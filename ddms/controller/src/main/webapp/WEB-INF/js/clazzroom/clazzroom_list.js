layui.use('table', function () {
    var table = layui.table;
    table.render({
        elem: '#clazzroom' //指定原始表格元素选择器（推荐id选择器）
        , url: 'http://localhost:8080/clazzroom/querypageall'
        ,toolbar: '#toolbarDemo'
        ,title : '教室信息'
        , height: 'full-150'
        , page: true
        , cols: [[
            {type: 'checkbox', fixed: 'left'}  //选择框
            , {field: 'id', hide : true, title: '编号'}
            , {field: 'crLocation', title: '所处位置'}
            , {field: 'crRoomnum', title: '房间号'}
            , {field: 'crMaxstunum', title: '可容纳学生数量'}
            , {field: 'crType', title: '类型'}
            , {fixed: 'right',title:'操作', align: 'center', toolbar: '#barDemo'}
        ]]
    });


    //监听工具栏事件
    table.on('tool(test)', function(obj) {
        if (obj.event === 'delete') {
            layer.confirm('真的删除数据吗', function (index) {
                obj.del();
                layer.close(index);
                $.ajax({
                    url: 'http://localhost:8080/clazzroom/del',
                    type: "post",
                    data: {
                        id: obj.data.id
                    }, success: function (data) {
                        data.background
                        if(data.status == 200) {
                            layer.msg("删除成功");
                        } else {
                            layer.msg("删除失败");
                        }
                    }, error: function (data) {
                        layer.msg("删除失败");
                    }
                })
            });
        } else if (obj.event === 'update') {
            var clazzRoom = obj.data;
            var s = JSON.stringify(clazzRoom);
            //将字符转义
            s = encodeURI("http://localhost:8080/clazzroom/update/"+s);
            layer.open({
                type: 2,
                content: s,
                area: ['500px', '400px'],
                offset: 'auto'
            });
        }
    });

    //监听复选框事件
    table.on('checkbox(test)', function(obj){
        console.log(obj);
        console.log(table.checkStatus('clazzroom'));
        console.log(table.checkStatus('clazzroom').data);
    });

    var $ = layui.jquery, active = {
        //搜索
        reload: function () {
            table.reload('clazzroom', {
                url:'http://localhost:8080/clazzroom/querypageacondition'
                ,where: {
                    condition : $('#search').val()
                }
                ,page: {
                    curr: 1 //重新从第 1 页开始
                }
            });
        }
    }

    //搜索时间
    $('#searchbtn').on('click', function(){
        var type = $(this).data('type');
        active[type] ? active[type].call(this) : '';
    });

    $('#exportAll').on('click', function(){
        $.ajax({
            url : 'http://localhost:8080/clazzroom/condition'
            ,type : 'get'
            ,data : {
                condition : $('#search').val()
            },success : function (data) {
                var x = new Array();
                for(var i = 0; i<data.data.length; i++) {
                    x[i] = new Array();
                    x[i] = [data.data[i].crLocation,data.data[i].crRoomnum,data.data[i].crMaxstunum,data.data[i].crType];
                }
                table.exportFile(['所处位置','房间号','容纳学生数量','类型'], x, 'xls');
            }
        });
    });
});