<%--
  Created by IntelliJ IDEA.
  User: LIZEYU
  Date: 2018/9/20
  Time: 23:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>班级管理</title>
    <link rel="stylesheet" type="text/css" href="/js/layui/css/layui.css">
    <script type="text/javascript" src="/js/jquery-2.2.4-min.js"></script>
</head>

<body>
<script type="text/javascript" src="/js/layui/layui.js"></script>
<div style="padding: 15px;">
    <div class="demoTable" style="text-align: center;margin-top: 15px;">
        班级名称：
        <div class="layui-inline">
            <input class="layui-input" name="clazzName" id="clazzName" autocomplete="off">
        </div>
        专业名称：
        <div class="layui-inline">
            <input class="layui-input" name="majorName"  id="majorName" autocomplete="off">
        </div>
        <button class="layui-btn" data-type="reload" id="search">搜索</button>
    </div>


        <button class="layui-btn layui-btn-sm" id="exportAll">全部导出</button>
        <button class="layui-btn layui-btn-sm" id="addclazz">增加</button>


    <table id="clazz" lay-filter="test"></table>
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
            elem: '#clazz' //指定原始表格元素选择器（推荐id选择器）
            ,url: 'http://localhost:8080/clazz/clazz_configList'
            ,height:"440"
            ,toolbar: '#toolbarDemo'
            ,id:'clazzReload'
            ,cols: [[
               // {type: 'checkbox', fixed: 'left'}  //选择框
                {field:'id',  title: '编号', sort: true}
                ,{field:'clazzName',  title: '班级名称'}
                ,{field:'clazzNum',  title: '班级人数'}
                ,{field:'majorName', title: '专业名称'}
                ,{field:'collegeName', title: '学院名称'}
               // ,{field:'remark', title: '备注'}
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
                        url : 'http://localhost:8080/clazz/del',
                        type : "post",
                        data : {
                            id : obj.data.id
                        },success : function(data) {
                            layer.msg('删除成功',{icon: 1,time:1000});
                        },error:function(data){
                            layer.msg("删除失败",{icon: 5,time:1000});
                        }
                    })
                });
            } else if(obj.event === 'edit'){
                var ids=obj.data.id;
                console.log(ids);
                layer.open({
                    type: 2,
                    content: 'http://localhost:8080/clazz/selectClazzAccrodingtoid?id='+ids,
                    area: ['500px','400px'],
                    offset: ['0px', '250px']
                });
            }
        })

        $("#addclazz").click(function () {
            layer.open({
                type: 2,
                content: 'http://localhost:8080/clazz/addclazz',
                area: ['500px','400px'],
                offset: ['0px', '250px']
            })
        })



        //搜索时间
        $('#searchbtn').on('click', function(){
            var type = $(this).data('type');
            active[type] ? active[type].call(this) : '';
        });


        $('#exportAll').on('click', function(){
            $.ajax({
                url : 'http://localhost:8080/clazz/selAllClazz'
                ,type : 'get'
                ,data : {}
                ,success : function (data) {
                    var x = new Array();
                    for(var i = 0; i<data.length; i++) {
                        x[i] = new Array();
                        x[i] = [data[i].id,data[i].clazzName,data[i].clazzNum,,data[i].majorName,data[i].collegeName];
                        console.log(data);
                    }

                    table.exportFile(['编号','班级名称','班级人数','专业名称','学院名称'], x, 'xls');
                }
            });
        });


    });

    function reload(){
        var table = layui.table;
        console.log(table);
        //执行重载
        table.reload('clazzReload', {
            url: 'http://localhost:8080/clazz/queryClazzByNameOrmajorName'
            ,where: { //设定异步数据接口的额外参数，任意设
                clazzName : $('#clazzName').val(),
                majorName : $('#majorName').val()
            }
            ,page: true
        });
    };
    $("#search").click(function(){
        reload();
    });
</script>
</html>
