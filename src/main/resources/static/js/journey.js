var $table = $('#table');
function changeDateFormat(cellval) {
    var dateVal = cellval + "";
    if (cellval != null) {
        var date = new Date(parseInt(dateVal.replace("/Date(", "").replace(")/", ""), 10));
        var month = date.getMonth() + 1 < 10 ? "0" + (date.getMonth() + 1) : date.getMonth() + 1;
        var currentDate = date.getDate() < 10 ? "0" + date.getDate() : date.getDate();

        var hours = date.getHours() < 10 ? "0" + date.getHours() : date.getHours();
        var minutes = date.getMinutes() < 10 ? "0" + date.getMinutes() : date.getMinutes();
        var seconds = date.getSeconds() < 10 ? "0" + date.getSeconds() : date.getSeconds();

        return date.getFullYear() + "-" + month + "-" + currentDate + " " + hours + ":" + minutes + ":" + seconds;
    }
}
$('#table').bootstrapTable({
    url: '/getJourneyList',
    search:true,
    pagination: true, //是否显示分页
    pageSize: 12, //每页的记录行数（*）
    height: 615,
    pageList: [12, 25, 50, 100],
    toolbar: '#toolbar',
    columns: [{
        field: 'id',
        title: 'Item ID',
        sortable:true,
    }, {
        field: 'user',
        title: 'Item User ID',
        searchable:false,
        sortable:true,
    }, {
        field: 'bicycle',
        title: 'Item Bicycle ID',
        searchable:false,
        sortable:true,
    }, {
        field: 'starttime',
        title: 'Item StartTime',
        searchable:false,
        sortable:true,
        formatter:function (value, row, index) {return changeDateFormat(value)},
    },{
        field: 'finishtime',
        title: 'Item SinishTime',
        searchable:false,
        sortable:true,
        formatter:function (value, row, index) {return changeDateFormat(value)},
    },{
        field: 'cost',
        title: 'Item Cost',
        searchable:false,
        sortable:true,
    },{
        field: 'haspaid',
        title: 'Item HasPaid',
        searchable:false,
        sortable:true,
    },
    ]
});