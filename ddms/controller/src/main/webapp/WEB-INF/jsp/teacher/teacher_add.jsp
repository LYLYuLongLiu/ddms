<%--
  User: 刘玉龙
  Date: 2018/9/25
  Time: 10:39
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>教师信息添加</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon" />
    <link rel="stylesheet" href="/css/font.css">
    <link rel="stylesheet" href="/css/xadmin.css">
    <%--<link rel="stylesheet" type="text/css" href="/js/layui/css/layui.css">--%>
    <script type="text/javascript" src="/js/jquery-2.2.4-min.js"></script>
    <script type="text/javascript" src="/js/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="/js/xadmin.js"></script>
    <!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
    <!--[if lt IE 9]>
    <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
    <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>
<div class="x-body">
    <div class="layui-upload" style="position: fixed;top: 20px;right: 20px;z-index: 999">
        <div class="layui-form-item">
            <img id="image" width="92.7px" height="125px" style="border: 1px solid red"><br/>
        </div>
        <button type="button" class="layui-btn layui-btn-normal" id="test8"><i class="layui-icon">&#xe67c;</i>上传图片</button>
    </div>
    <form class="layui-form">
        <div class="layui-form-item">
            <label for="L_worknumber" class="layui-form-label">
                <span class="x-red">*</span>工号
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_worknumber" name="worknumber" required="" lay-verify="worknumber"
                       autocomplete="off" class="layui-input">
            </div>
            <label for="L_teaName" class="layui-form-label">
                <span class="x-red">*</span>名称
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_teaName"name="teaName" required="" lay-verify="required"
                       autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_teaEnglishname" class="layui-form-label">
                英文名称
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_teaEnglishname" name="teaEnglishname"
                       autocomplete="off" class="layui-input">
            </div>
            <label for="L_teaSex" class="layui-form-label">
                <span class="x-red">*</span>性别
            </label>
            <div class="layui-input-inline">
                <select id="L_teaSex" name="teaSex">
                    <option value="男">男</option>
                    <option value="女">女</option>
                </select>
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_teaBirthdate" class="layui-form-label">
                出生日期
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_teaBirthdate"  name="teaBirthdate"
                       autocomplete="off" class="layui-input">
            </div>
            <label for="L_teaPhone" class="layui-form-label">
                手机号
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_teaPhone" name="teaPhone" lay-verify="phoneNum"
                       autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_teaSparephone" class="layui-form-label">
                备用联系方式
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_teaSparephone" name="teaSparephone" lay-verify="phoneNum"
                       autocomplete="off" class="layui-input">
            </div>
            <label for="L_teaNation" class="layui-form-label">
                <span class="x-red">*</span>民族
            </label>
            <div class="layui-input-inline">
                <select id="L_teaNation" name="teaNation">
                    <option value="汉">汉</option>
                </select>
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_teaNativeplace" class="layui-form-label">
                <span class="x-red">*</span>籍贯
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_teaNativeplace" name="teaNativeplace" lay-verify="required"
                       autocomplete="off" class="layui-input">
            </div>
            <label for="L_teaAddress" class="layui-form-label">
                <span class="x-red">*</span>现住址
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_teaAddress"  name="teaAddress" lay-verify="required"
                       autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_teaPoliticalface" class="layui-form-label">
                <span class="x-red">*</span>政治面貌
            </label>
            <div class="layui-input-inline">
                <select id="L_teaPoliticalface" name="teaPoliticalface">
                    <option value="党员" >党员</option>
                    <option value="团员" >团员</option>
                    <option value="群众" >群众</option>
                </select>
            </div>
            <label for="L_teaIdcard" class="layui-form-label">
                <span class="x-red">*</span>身份证
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_teaIdcard" name="teaIdcard" lay-verify="required|identity"
                       autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_teaDegreeedu" class="layui-form-label">
                教育程度
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_teaDegreeedu" name="teaDegreeedu"
                       autocomplete="off" class="layui-input">
            </div>
            <label for="L_teaMaritalstatus" class="layui-form-label">
                婚姻状态
            </label>
            <div class="layui-input-inline">
                <select id="L_teaMaritalstatus" name="teaMaritalstatus">
                    <option value="未婚" >未婚</option>
                    <option value="已婚" >已婚</option>
                </select>
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_teaJobtitle" class="layui-form-label">
                <span class="x-red">*</span>职称
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_teaJobtitle" name="teaJobtitle" lay-verify="required"
                       autocomplete="off" class="layui-input">
            </div>
            <label for="L_teaCjgzny" class="layui-form-label">
                参加工作年月
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_teaCjgzny" name="teaCjgzny"
                       autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_teaCjny" class="layui-form-label">
                从教年月
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_teaCjny" name="teaCjny"
                autocomplete="off" class="layui-input">
            </div>
            <label for="L_teaCredentialstime" class="layui-form-label">
                <span class="x-red">*</span>教师资格证获取时间
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_teaCredentialstime" name="teaCredentialstime" lay-verify="required"
                       autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_teaCometime" class="layui-form-label">
                <span class="x-red">*</span>来校日期
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_teaCometime" name="teaCometime" lay-verify="required"
                       autocomplete="off" class="layui-input">
            </div>
            <label for="L_teaRkzk" class="layui-form-label">
                <span class="x-red">*</span>任课状况
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_teaRkzk" name="teaRkzk" lay-verify="required"
                       autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_teaType" class="layui-form-label">
                <span class="x-red">*</span>教师类型
            </label>
            <div class="layui-input-inline">
                <select id="L_teaType" name="teaType">
                    <option value="本校" >本校</option>
                    <option value="外聘" >外聘</option>
                </select>
            </div>
            <label for="L_teaCampus" class="layui-form-label">
                校区
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_teaCampus" name="teaCampus"
                       autocomplete="off" class="layui-input">
            </div>
        </div>

        <div class="layui-form-item">
            <label for="L_repass" class="layui-form-label">
            </label>
            <button  class="layui-btn" lay-filter="add" lay-submit="">
                增加
            </button>
        </div>
    </form>
</div>
<script src="/js/teacher/teacher_add.js"></script>
</body>
</html>