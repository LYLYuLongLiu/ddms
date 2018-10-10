<%--
  User: 刘玉龙
  Date: 2018/9/27
  Time: 21:21
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>教师信息编辑</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi"/>
    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon"/>
    <link rel="stylesheet" href="/css/font.css">
    <link rel="stylesheet" href="/css/xadmin.css">
    <%--<link rel="stylesheet" type="text/css" href="/js/layui/css/layui.css">--%>
    <script type="text/javascript" src="/js/jquery-2.2.4-min.js"></script>
    <script type="text/javascript" src="/js/layui/layui.js" charset="utf-8"></script>
    <!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
    <!--[if lt IE 9]>
    <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
    <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>
<div class="x-body">
    <form class="layui-form">

        <div class="layui-form-item">
            <label for="L_id" class="layui-form-label">
                <span class="x-red">*</span>编号
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_id" name="id" required=""
                       autocomplete="off" class="layui-input" />
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_crLocation" class="layui-form-label">
                <span class="x-red">*</span>所处位置
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_crLocation" name="crLocation" required=""
                       autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_crRoomnum" class="layui-form-label">
                <span class="x-red">*</span>房间号
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_crRoomnum" name="crRoomnum" required=""
                        autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_crMaxstunum" class="layui-form-label">
                <span class="x-red">*</span>可容纳学生数量
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_crMaxstunum" name="crMaxstunum" required=""
                       autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_crType" class="layui-form-label">
                <span class="x-red">*</span>类型
            </label>
            <div class="layui-input-inline">
                <select name="crType" id="L_crType">
                    <option value="机房">机房</option>
                    <option value="公共教室">公共教室</option>
                </select>
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_repass" class="layui-form-label">
            </label>
            <button class="layui-btn" lay-filter="add" lay-submit="">
                添加
            </button>
        </div>
    </form>
</div>
<script src="/js/clazzroom/clazzroom_add.js"></script>

</body>
</html>
