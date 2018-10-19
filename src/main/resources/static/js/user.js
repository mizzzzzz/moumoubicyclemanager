var $table = $('#table');
function AddFunctionAlty(value,row,index) {
    return[
        '    <button type="button" id="edi" type="button" class="btn btn-default" data-toggle="modal" data-target=".bs-example-modal-sm">编辑</button>' +
        '    <button id="del" type="button" class="btn btn-danger">删除</button>'
    ].join("")
}
window.operateEvents = {
    "click #edi":function (e,value,row,index) {
        $("#user_phone").val(row.phone);
        $("#user_money").val(row.money);
        // alert(row.hasdeposit+"11");
        if(row.hasdeposit) {
            $("input[name='inlineRadioOptions']").eq(0).attr("checked",true);
        }else {
            $("input[name='inlineRadioOptions']").eq(1).attr("checked", true);
        }
        $("#ediBtn").text("保存");
        $("#ediBtn").on("click",function(){
            var user={
                "id":row.id,
                "phone":$("#user_phone").val(),
                "money":$("#user_money").val(),
                "hasdeposit":$(".myRadio:checked").val(),
            }
            $.ajax({
                url:"/updataUser",
                method:"POST",
                contentType:"application/json;charset=utf-8",
                data:JSON.stringify(user),
                success:
                    function () {
                        $table.bootstrapTable('refresh');
                    }
            })
        });
        $("#opEdiRowModal").modal();
    },
    "click #del":function (e,value,row,index) {
        $("#warningText").text("是否删除ID为：" +row.id + "的用户 ?");
        $("#confirmBtn").text("删除");
        $("#confirmBtn").on("click",function(){

            $.ajax({
                url:"/delUserByThisId",
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
        $("#opDataxJobRowModal").modal();


    }
}
$('#table').bootstrapTable({
    url: '/getUserList',
    search:true,
    pagination: true, //是否显示分页
    pageSize: 11, //每页的记录行数（*）
    height: 615,
    pageList: [11, 25, 50, 100],
    toolbar: '#toolbar',
    columns: [{
        field: 'id',
        title: 'Item ID',
        sortable:true,
    }, {
        field: 'phone',
        title: 'Item Phone',
        searchable:false,
        sortable:true,
    }, {
        field: 'money',
        title: 'Item Money',
        searchable:false,
        sortable:true,
    }, {
        field: 'hasdeposit',
        title: 'Item HasDeposit',
        searchable:false,
        sortable:true,
    }, {
        field: 'myButton',
        title: 'Item Button',
        searchable:false,
        events:operateEvents,
        formatter:AddFunctionAlty,
    }, ]
});
$('#opDataxJobRowModal').on('hidden.bs.modal', function (event) {
    $("#confirmBtn").unbind();
})
$('#opEdiRowModal').on('hidden.bs.modal', function (event) {
    $("#ediBtn").unbind();
})
newUser=function(){
    var user={
        "wxopenid":$("#user_newPhone").val(),
        "phone":$("#user_newMoney").val()
    }
    $.ajax({
        url:"/addUser",
        method:"POST",
        contentType:"application/json;charset=utf-8",
        data:JSON.stringify(user),
        success:
            function (res) {
                if(res.status==0000){
                    $table.bootstrapTable('refresh');
                    alert("新建用户成功");
                }
                /* else {
                    $table.bootstrapTable('refresh');
                    alert("新建用户失败");
				}*/

            }
    })
}