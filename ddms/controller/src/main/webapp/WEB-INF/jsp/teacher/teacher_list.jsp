<%--
  Created by IntelliJ IDEA.
  User: 84261
  Date: 2018/9/19
  Time: 20:37
  To change this template use File | Settings | File Templates.
--%>
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
<div style="padding: 15px;">
    <div class="demoTable" style="text-align: center;margin-top: 15px;">
        搜索ID：
        <div class="layui-inline">
            <input class="layui-input" name="id" autocomplete="off">
        </div>
        <div class="layui-inline">
            <input class="layui-input" name="id" autocomplete="off">
        </div>
        <div class="layui-inline">
            <input class="layui-input" name="id" autocomplete="off">
        </div>
        <button class="layui-btn" data-type="reload">搜索</button>
    </div>
    <div class="layui-btn-group demoTable" style="margin-top: 20px;">
        <button class="layui-btn">批量导入</button>
        <button class="layui-btn">批量导出</button>
        <button class="layui-btn">全部导出</button>
    </div>
    <table id="student" lay-filter="test"></table>
</div>
</body>
<script type="text/javascript" src="/js/layui/layui.js"></script>
<script>
    layui.use('table',function () {
        var table = layui.table;
        table.render({
            elem: '#student' //指定原始表格元素选择器（推荐id选择器）
            ,url: 'http://localhost:8080/teacher/queryallpage'
            ,cols: [[
                {type: 'checkbox', fixed: 'left'}  //选择框
                ,{field:'worknumber',  title: '工号', sort: true}
                ,{field:'teaName',  title: '教师姓名'}
                ,{field:'teaSex',  title: '性别'}
                ,{field:'teaPhone', title: '手机号'}
                ,{field:'teaNation', title: '民族'}
                ,{field:'teaJobtitle', title: '职称'}
                ,{field:'teaRkzk', title: '任课状况'}
                ,{fixed: 'right', align:'center', toolbar: '#barDemo'}
            ]]
            ,page: true
        });
    })
</script>
</html>
