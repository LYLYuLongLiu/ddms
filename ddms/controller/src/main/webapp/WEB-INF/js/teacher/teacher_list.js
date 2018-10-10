layui.use('table', function () {
    var table = layui.table;
    table.render({
        elem: '#teacher' //指定原始表格元素选择器（推荐id选择器）
        , url: 'http://localhost:8080/teacher/queryallpage'
        ,toolbar: '#toolbarDemo'
        ,title : '教师信息'
        , height: 'full-150'
        , page: true
        , cols: [[
            {type: 'checkbox', fixed: 'left'}  //选择框
            , {field: 'worknumber', title: '工号', sort: true}
            , {field: 'teaName', title: '教师姓名'}
            , {field: 'teaSex', title: '性别'}
            , {field: 'teaPhone', title: '手机号'}
            , {field: 'teaNation', title: '民族'}
            , {field: 'teaJobtitle', title: '职称'}
            , {field: 'teaRkzk', title: '任课状况'}
            , {fixed: 'right', title:'操作', align: 'center', toolbar: '#barDemo'}
        ]]
    });


    //监听工具栏事件
    table.on('tool(test)', function(obj) {
        var data = obj.data;
        if (obj.event === 'delete') {
            layer.confirm('真的删除数据吗', function (index) {
                obj.del();
                layer.close(index);
                $.ajax({
                    url: 'http://localhost:8080/teacher/del',
                    type: "post",
                    data: {
                        id: obj.data.worknumber
                    }, success: function (data) {
                        layer.msg("删除成功");
                    }, error: function (data) {
                        layer.msg("删除失败");
                    }
                })
            });
        } else if (obj.event === 'update') {
            //var thisid = parseInt(ids);
            //将字符转义
            s = encodeURI("http://localhost:8080/teacher/update/"+obj.data.worknumber);
            layer.open({
                type: 2,
                content: s,
                area: ['1000px', '500px'],
                offset: 'auto'
            });
        }
    });

    //监听复选框事件
    table.on('checkbox(test)', function(obj){
        console.log(obj);
        console.log(table.checkStatus('teacher'));
        console.log(table.checkStatus('teacher').data);
    });

    var $ = layui.jquery, active = {
        //搜索
        reload: function () {
            table.reload('teacher', {
                url:'http://localhost:8080/teacher/queryconditionpage'
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
            url : 'http://localhost:8080/teacher/condition'
            ,type : 'get'
            ,data : {
                condition : $('#search').val()
            },success : function (data) {
                var x = new Array();
                for(var i = 0; i<data.data.length; i++) {
                    x[i] = new Array();
                    x[i] = [data.data[i].worknumber,data.data[i].teaName,data.data[i].teaEnglishname,data.data[i].teaSex
                        ,data.data[i].teaBirthdate,data.data[i].teaPhone,data.data[i].teaSparephone,data.data[i].teaNation,data.data[i].teaNativeplace
                        ,data.data[i].teaAddress,data.data[i].teaPoliticalface,data.data[i].teaIdcard,data.data[i].teaMaritalstatus,data.data[i].teaDegreeedu
                        ,data.data[i].teaJobtitle,data.data[i].teaCjgzny,data.data[i].teaCjny,data.data[i].teaCredentialstime,data.data[i].teaCometime
                        ,data.data[i].teaRkzk,data.data[i].teaType,data.data[i].teaCampus];
                }
                table.exportFile(['工号','教师姓名','教师英文名字','性别','出生日期'
                    ,'手机号','备用联系方式','民族','籍贯','现住址','政治面貌','身份证'
                    ,'婚姻状态','教育程度','职称','参加工作年月','从教年月'
                    ,'教师资格证获取时间','来校日期','任课状况','教师类型','校区'], x, 'xls');
            }
        });
    });
});

layui.use('upload', function () {
    var upload = layui.upload;

    //执行实例
    upload.render({
        elem: '#importExcel'
        , url:'http://localhost:8080/teacher/importExcel'
        , field: 'excelFile'
        , accept: 'file'
        , auto: true //选择文件后不自动上传
        ,done : function (res) {
            if(res.status == 200) {
                layer.msg("上传成功");
            } else {
                layer.msg(res.msg);
            }
        }, error:function (res) {
            layer.msg(res.msg);
        }
    });
});