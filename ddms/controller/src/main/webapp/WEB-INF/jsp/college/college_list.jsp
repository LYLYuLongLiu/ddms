<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>学院管理</title>
    <link rel="stylesheet" type="text/css" href="/js/layui/css/layui.css">
    <script type="text/javascript" src="/js/jquery-2.2.4-min.js"></script>
</head>

<body>
<script type="text/javascript" src="/js/layui/layui.js"></script>
<div style="padding: 15px;">
    <div class="demoTable" style="text-align: center;margin-top: 50px;">
        学院名称：
        <div class="layui-inline">
            <input class="layui-input" name="querycollegeName" id="querycollegeName" autocomplete="off">
        </div>
        <button class="layui-btn" id="search" data-type="reload">搜索</button>
    </div>

    <%--<div id = "file">--%>
        <%--<form action="#" id = "upload" onsubmit="return check();">--%>
            <%--<div> <input id="excel_file" type = "file" name = "file" accept="xlsx" size="80"/>--%>
                <%--<input  class="layui-btn" id="excel_button" type="submit" value="导入excel">--%>
            <%--</div>--%>
        <%--<div>--%>
            <%--<span>别瞎几把导入</span>--%>
        <%--</div>--%>
        <%--</form>--%>
    <%--</div>--%>

    <button class="layui-btn layui-btn-sm" id="exportAll">全部导出</button>
    <button class="layui-btn layui-btn-sm" id="addcollege">增加</button>

    <table id="college" lay-filter="test"></table>
    <script type="text/html" id="barDemo">
        <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
        <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
    </script>
</div>
</body>
<script type="text/javascript" src="/js/layui/layui.js"></script>
<script>
    layui.use('table',function () {
        var table = layui.table;
        table.render({
            elem: '#college' //指定原始表格元素选择器（推荐id选择器）
            ,url: 'http://localhost:8080/college/college_configList'
            ,height:"440"
            ,toolbar: '#toolbarDemo'
            ,id:'collegeReload'
            ,cols : [ [
                //{type: 'checkbox', fixed: 'left'}  //选择框
                {field:'id',  title: '编号', sort: true}
                ,{field:'collegeName',  title: '学院名称'}
                //,{field:'remark',  title: '备注'}
                ,{fixed: 'right', title: '操作',align:'center', toolbar: '#barDemo'}
            ]]
            ,page: true
        });
        //监听行工具事件
        table.on('tool(test)', function(obj){
            var data = obj.data;
            if(obj.event === 'del'){
                layer.confirm('真的删除行么', function(index){
                    console.log(obj.data);
                    obj.del();
                    layer.close(index);
                    $.ajax({
                        url : 'http://localhost:8080/college/del',
                        type : "post",
                        data : {
                            id : obj.data.id
                        },success : function(data) {
                            layer.msg('删除成功',{icon: 1,time:1000});
                        },error:function(data){
                            layer.msg("请删除相关专业后再删除学院信息",{icon: 5,time:1000});
                        }
                    })
                });
            } else if(obj.event === 'edit'){
                var ids=obj.data.id;
                console.log(ids);
                layer.open({
                    type: 2,
                    content: 'http://localhost:8080/college/selectCollegeAccrodingtoid?id='+ids,
                    area: ['500px','400px'],
                    offset: ['0px', '250px']
                });
            }
        })
        $("#search").click(function(){
            reload();
        });
        $("#addcollege").click(function () {
            layer.open({
                type: 2,
                content: 'http://localhost:8080/college/addcollege',
                area: ['500px','400px'],
                offset: ['0px', '250px']
            })
        })


        /**全部导出**/
        //搜索时间
        $('#searchbtn').on('click', function(){
            var type = $(this).data('type');
            active[type] ? active[type].call(this) : '';
        });


        $('#exportAll').on('click', function(){
            $.ajax({
                url : 'http://localhost:8080/college/selAllCollege'
                ,type : 'get'
                ,data : {}
                ,success : function (data) {
                    var x = new Array();
                    for(var i = 0; i<data.length; i++) {
                        x[i] = new Array();
                        x[i] = [data[i].id,data[i].collegeName];
                        console.log(data);
                    }

                    table.exportFile(['编号','学院名称'], x, 'xls');
                }
                ,error:function(data){
                    layer.msg("导出失败");
                }
            });
        });
    });

    function reload(){
        var table = layui.table;
        console.log(table);
        //执行重载
        table.reload('collegeReload', {
            url: 'http://localhost:8080/college/queryCollegeByName'
            ,where: { //设定异步数据接口的额外参数，任意设
                collegeName : $('#querycollegeName').val()
            }
            ,page: true
        });
    }
/**
 * 导入
 *此功能停用
 * */
    // layui.use('upload', function(){
    //     var $ = layui.jquery
    //         ,upload = layui.upload;
    //     //指定允许上传的文件类型
    //     upload.render({
    //         elem: '#filePath'
    //         ,url: 'http://localhost:8080/college/readExcelData'
    //         ,field: 'filePath'
    //         ,accept: 'file' //普通文件
    //         ,success:function(){
    //             layer.msg("上传成功");
    //         }
    //         ,error: function(){
    //             layer.msg("上传失败");
    //         }
    //     });
    // })
</script>
</html>
