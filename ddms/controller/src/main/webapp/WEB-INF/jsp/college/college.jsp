<%--
  Created by IntelliJ IDEA.
  User: 84261
  Date: 2018/9/19
  Time: 16:13
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
</head>

<body>
<div style="padding: 15px;">
    <div class="demoTable" style="text-align: center;margin-top: 50px;">
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
    <div class="layui-btn-group demoTable" style="margin-top: 50px;">
        <button class="layui-btn" >批量导入</button>
        <button class="layui-btn" >批量导出</button>
        <button class="layui-btn" >全部导出</button>
    </div>
</div>
</body>

</html>
