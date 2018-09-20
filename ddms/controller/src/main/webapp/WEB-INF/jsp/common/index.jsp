<%--
  Created by IntelliJ IDEA.
  User: 高伟萌
  Date: 2018/9/19
  Time: 10:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>后台管理系统</title>
    <link rel="stylesheet" type="text/css" href="/js/layui/css/layui.css">
    <script src="/js/jquery-2.2.4-min.js"></script>
</head>

<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">
    <div class="layui-header">
        <div class="layui-logo">数据字典</div>
        <!-- 头部区域（可配合layui已有的水平导航） -->
        <ul class="layui-nav layui-layout-left">
            <li class="layui-nav-item my-demo" data-id="0" data-uri="first">首页</li>
            <li class="layui-nav-item">
                <a href="javascript:;">其它系统</a>
                <dl class="layui-nav-child">
                    <dd><a href="">千分制系统</a></dd>
                </dl>
            </li>
        </ul>
        <ul class="layui-nav layui-layout-right">
            <li class="layui-nav-item">
                <a href="javascript:;">
                    ${administrators.adminAccnum}
                    <!-- -------------------------------------------------------此处为用户名 -->
                </a>
                <dl class="layui-nav-child">
                    <dd><a href="">基本资料</a></dd>
                </dl>
            </li>
            <li class="layui-nav-item"><a href="">退了</a></li>
        </ul>
    </div>
    <div class="layui-side layui-bg-black">
        <div class="layui-side-scroll">
            <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
            <ul class="layui-nav layui-nav-tree" lay-filter="test">
                <li class="layui-nav-item"><a data-id="1" data-uri="college" class="my-demo">学院管理</a></li>
                <li class="layui-nav-item"><a data-id="2" data-uri="major" class="my-demo">专业管理</a></li>
                <li class="layui-nav-item"><a data-id="3" data-uri="teacher" class="my-demo">教师管理</a></li>
                <li class="layui-nav-item"><a data-id="4" data-uri="student" class="my-demo">学生管理</a></li>
                <li class="layui-nav-item"><a data-id="5" data-uri="subject" class="my-demo">科目管理</a></li>
                <li class="layui-nav-item"><a data-id="6" data-uri="classroom" class="my-demo">教室管理</a></li>
                <li class="layui-nav-item"><a data-id="7" data-uri="class" class="my-demo">班级管理</a></li>
                <li class="layui-nav-item layui-nav-itemed">
                    <a class="" href="#">所有商品</a>
                    <dl class="layui-nav-child">
                        <dd><a href="#">列表一</a></dd>
                        <dd><a href="#">列表二</a></dd>
                        <dd><a href="#">列表三</a></dd>
                    </dl>
                </li>
            </ul>
        </div>
    </div>
    <div class="layui-body">
        <div class="layui-tab" lay-filter="demo" lay-allowClose="true">
            <ul class="layui-tab-title">
                <li class="layui-this" lay-id="0">首页</li>
            </ul>
            <div class="layui-tab-content">
                <div class="layui-tab-item layui-show">
                    <iframe frameborder="0" name="content" scrolling="no" width="100%" height="600px" src="http://localhost:8080/first"></iframe>
                </div>
            </div>
        </div>
    </div>
    <div class="layui-footer">
        <!-- 底部固定区域 -->
        © wisdsoft.cn - 底部固定区域
    </div>
</div>
<script src="/js/layui/layui.js"></script>
<script>
    //JavaScript代码区域
    layui.use('element', function() {
        var element = layui.element;
        active = {
            tabAdd: function(title, id, uri) {
                element.tabAdd('demo', {
                    title: title,
                    content: '<iframe frameborder="0" name="content" scrolling="no" width="100%" height="600px" src="http://localhost:8080/'+uri+'/"'+'></iframe>', //支持传入html
                    id: id
                })
            },
            tabChange: function (id) {
                //切换到指定Tab项
                element.tabChange('demo', id); //切换到：用户管理
            }
        }
        $('.my-demo').on('click', function() {
            var dataid = $(this);
            var id = dataid.attr('data-id');
            var title = dataid.text();
            var uri = dataid.attr('data-uri');
            var li = $('.layui-tab-title li[lay-id=' + id + ']').length;
            if(li>0){
                active.tabChange(id);
            }else{
                active.tabAdd(title,id,uri);
                active.tabChange(id);
            }
            // active.tabAdd(title, id, uri);
            // active.tabChange(id);
            console.log(dataid.attr('data-id'));
        });
    });

    // function load(view) {
    //     layui.jquery(".layui-show").load("HTML/" + view + ".html", function() {});
    // }
</script>
</body>

</html>
