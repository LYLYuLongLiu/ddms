<%--
  Created by IntelliJ IDEA.
  User: LIZEYU
  Date: 2018/9/29
  Time: 11:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>layui</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" type="text/css" href="/js/layui/css/layui.css">
</head>
<body>
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
    <legend>欢迎使用数据字典</legend>
</fieldset>

<div style="padding: 20px; background-color: #F2F2F2;">
    <div class="layui-row layui-col-space15">
        <div class="layui-col-md6">
            <div class="layui-card">
                <div class="layui-card-header">智软工作室制作出品</div>
                <div class="layui-card-body">
                    公司主页：<a href="www.wisdsoft.cn">www.wisdsoft.cn</a><br>
                    联系QQ：123456789<br>
                </div>
            </div>
        </div>
        <div class="layui-col-md6">
            <div class="layui-card">
                <div class="layui-card-header">承接业务</div>
                <div class="layui-card-body">
                    前端页面设计 + 后台管理系统<br>
                    分布式 + 服务器
                </div>
            </div>
        </div>
        <div class="layui-col-md12">
            <div class="layui-card">
                <div class="layui-card-header">系统简介</div>
                <div class="layui-card-body">
                    本系统主要用于学校的数据管理，提供各项功能保证数据的安全性，可靠性。极大提高了工作效率，支持各类子系统扩展。
                </div>
            </div>
        </div>
    </div>
</div>

<fieldset class="layui-elem-field layui-field-title" style="margin-top: 50px;">
    <legend>数据引擎</legend>
</fieldset>

<table class="layui-table" lay-skin="line">
    <colgroup>
        <col width="150">
        <col width="150">
        <col width="200">
        <col>
    </colgroup>
    <tbody>
    <tr>
        <td>操作系统</td>
        <td>Windows 7+ 操作系统</td>

    </tr>
    <tr>
        <td>后台框架</td>
        <td>Spring + SpringMVC + Mybits</td>
    </tr>
    <tr>
        <td>前端框架</td>
        <td>JQuery 2.4.x + layUI</td>
    </tr>
    <tr>
        <td>JDK版本</td>
        <td>JDK 1.8</td>
    </tr>
    <tr>
        <td>项目管理</td>
        <td>Maven 3.5.x</td>
    </tr>
    <tr>
        <td>Mysql数据库</td>
        <td>Mysql 5.5.x</td>
    </tr>
    </tbody>
</table>

<script src="../js/layui/layui.js" charset="utf-8"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
<script>
    layui.use(['element', 'layer'], function(){
        var element = layui.element;
        var layer = layui.layer;

        //监听折叠
        element.on('collapse(test)', function(data){
            layer.msg('展开状态：'+ data.show);
        });
    });
</script>

</body>
</html>
