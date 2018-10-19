var $table = $('#table');
function AddFunctionAlty(value,row,index) {
    return[
        '    <button type="button" id="edi" type="button" class="btn btn-default" data-toggle="modal" data-target=".bs-example-modal-sm">编辑</button>' +
        '    <button id="del" type="button" class="btn btn-danger">删除</button>'
    ].join("")
}
window.operateEvents = {
    "click #edi":function (e,value,row,index) {
        // alert("编辑");
        $("#bicycle_status").val(row.status);
        $("#ediBtn").text("保存");
        $("#ediBtn").on("click",function(){
            var bicycle={
                "id":row.id,
                "status":$("#bicycle_status").val(),
            }
            console.log(bicycle);
            $.ajax({
                url:"/updataBicycle",
                method:"POST",
                contentType:"application/json;charset=utf-8",
                data:JSON.stringify(bicycle),
                success:
                    function () {
                        $table.bootstrapTable('refresh');
                    }
            })
        });
        $("#opEdiRowModal").modal();
    },
    "click #del":function (e,value,row,index) {
         // alert("row.status"+row.status);
        if(row.status==2){
            $("#warningText").text("此单车使用中不可被删除");
            $("#confirmBtn").text("删除");
            $("#confirmBtn").attr("disabled","true");
        }else {
            $("#warningText").text("是否删除Mark为：" +row.mark + "的单车 ?");
            $("#confirmBtn").text("删除");
            $("#confirmBtn").on("click",function(){
                $.ajax({
                    url:"/delBicycleByThisId",
                    // contentType:"application/json",
                    data:{
                        id:row.id
                    },
                    success:
                        function () {
                            $table.bootstrapTable('remove', {
                                field: 'id',
                                values: [parseInt(row.id)]
                            });
                        }
                })
            });
        }
        $("#opDataxJobRowModal").modal();
    }
}
$('#table').bootstrapTable({
    url: '/getBicycleList',
    search:true,
    pagination: true, //是否显示分页
    pageSize: 11, //每页的记录行数（*）
    height: 615,
    pageList: [11, 25, 50, 100],
    toolbar: '#toolbar',
    columns: [{
        field: 'id',
        title: 'Item ID',
        searchable:false,
        sortable:true,
    }, {
        field: 'mark',
        title: 'Item Mark',
        sortable:true,
    }, {
        field: 'status',
        title: 'Item Status',
        searchable:false,
        sortable:true,
        formatter:function(value,row,index){
            var thisStr='';
            if(value==1){
                thisStr='空闲中';
            }else if(value==2){
                thisStr='使用中';
            }else if(value==3){
                thisStr='维修中';
            }
            else if(value==4){
                thisStr='失联';
            }
            return thisStr;
        }
    }, {
        field: 'sign',
        title: 'Item Sign',
        searchable:false,
        sortable:true,
    }, {
        field: 'latitude',
        title: 'Item Latitude',
        searchable:false,
    }, {
        field: 'longitde',
        title: 'Item Longitde',
        searchable:false,
    }, {
        field: 'myButton',
        title: 'Item Button',
        searchable:false,
        events:operateEvents,
        formatter:AddFunctionAlty,
    }, ]
});
$('#opEdiRowModal').on('hidden.bs.modal', function (event) {
    $("#ediBtn").unbind();
})

$('#opDataxJobRowModal').on('hidden.bs.modal', function (event) {
    $("#confirmBtn").unbind();
})

newBicycle=function(){
    var bicycle={
        "mark":$("#bicycle_newMark").val(),
    }
    $.ajax({
        url:"/addBicycle",
        method:"POST",
        contentType:"application/json;charset=utf-8",
        data:JSON.stringify(bicycle),
        success:
            function (res) {
                if(res.status==0000){
                    $table.bootstrapTable('refresh');
                    alert("新建单车成功");
                }
                /* else {
                    $table.bootstrapTable('refresh');
                    alert("新建用户失败");
				}*/

            }
    })
}