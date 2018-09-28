<%--
  User: 刘玉龙
  Date: 2018/9/26
  Time: 16:36
--%>
<%@ page contentType="text/html;charset=UTF-8" %>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>教室管理</title>
    <link rel="stylesheet" type="text/css" href="/js/layui/css/layui.css">
    <script type="text/javascript" src="/js/jquery-2.2.4-min.js"></script>
    <script type="text/javascript" src="/js/xadmin.js"></script>
</head>

<body>
<div style="padding: 15px;">
    <div class="demoTable" style="text-align: center;margin-top: 15px;">
        <div class="layui-inline">
            <input class="layui-input" id="search" autocomplete="off">
        </div>
        <button class="layui-btn" id="searchbtn" data-type="reload">搜索</button>
    </div>
</div>
<xblock>
    <button style="float: right" class="layui-btn" onclick="x_admin_show('添加教室','/clazzroom/add',500,400)"><i class="layui-icon"></i>添加
    </button>
    <button class="layui-btn">批量导入</button>
    <button class="layui-btn">批量导出</button>
    <button class="layui-btn" id="exportAll">全部导出</button>
</xblock>

<table class="layui-hide" id="clazzroom" lay-filter="test"></table>

</div>
</body>

<script type="text/javascript" src="/js/layui/layui.js"></script>

<script type="text/html" id="toolbarDemo">

</script>

<script type="text/html" id="barDemo">
    <button class="layui-btn layui-btn-sm" lay-event="update">编辑</button>
    <button class="layui-btn layui-btn-sm" lay-event="delete">删除</button>
</script>

<script src="/js/Base64.js"></script>

<script src="/js/clazzroom/clazzroom_list.js"></script>

</html>
