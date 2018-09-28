<%--
  Created by IntelliJ IDEA.
  User: 84261
  Date: 2018/9/22
  Time: 17:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page isELIgnored="false" %>
<%@include file="/taglibs.jsp"%>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>查看</title>
    <link rel="stylesheet" type="text/css" href="${ctx}/js/layui/css/layui.css">
    <script type="text/javascript" src="${ctx}/js/jquery-2.2.4-min.js"></script>
</head>
<body>
    <div>
        <div class="layui-form-item">
            <label class="layui-form-label">姓名</label>
            <div class="layui-input-inline">
                <input type="text" id="stuName" readonly lay-verify="required" class="layui-input" value="${oneStudent.stuName}" />
            </div>
            <label class="layui-form-label">状态</label>
            <div class="layui-input-inline">
                <input type="text" id="stuStatus" readonly lay-verify="required" class="layui-input" value="${oneStudent.stuStatus}" />
            </div>
            <label class="layui-form-label">照片</label>
            <div class="layui-input-inline" style="width: 50px;height: 50px;border: 1px solid red;">
                <img src="" alt="" id="picture">
            </div>
        </div>
        <%--<div class="layui-form-item">--%>
            <%--<label class="layui-form-label">照片</label>--%>
            <%--<div class="layui-input-inline">--%>
                <%--<img src="" alt="" id="picture">--%>
            <%--</div>--%>
        <%--</div>--%>
        <div class="layui-form-item">
            <label class="layui-form-label">性别</label>
            <div class="layui-input-inline">
                <input type="text" id="stuSex" readonly lay-verify="required" class="layui-input" value="${oneStudent.stuSex}" />
            </div>
            <label class="layui-form-label">出生日期</label>
            <div class="layui-input-inline">
                <input type="text" id="stuBirthday" readonly lay-verify="required" class="layui-input"
                       value="<fmt:formatDate value='${oneStudent.stuBrithdate}' pattern='yyyy-MM-dd' />" />
            </div>
        </div>
        <%--<div class="layui-form-item">--%>
            <%--<label class="layui-form-label">出生日期</label>--%>
            <%--<div class="layui-input-inline">--%>
                <%--<input type="text" id="stuBirthday" readonly lay-verify="required" class="layui-input" value="${oneStudent.stuBrithdate}" />--%>
            <%--</div>--%>
        <%--</div>--%>
        <div class="layui-form-item">
            <label class="layui-form-label">籍贯</label>
            <div class="layui-input-inline">
                <input type="text" id="stuNative" readonly lay-verify="required" class="layui-input" value="${oneStudent.stuNative}" />
            </div>
            <label class="layui-form-label">政治面貌</label>
            <div class="layui-input-inline">
                <input type="text" id="stuPoliticalFace" readonly lay-verify="required" class="layui-input" value="${oneStudent.stuPoliticalface}" />
            </div>
        </div>
        <%--<div class="layui-form-item">--%>
            <%--<label class="layui-form-label">入学时间</label>--%>
            <%--<div class="layui-input-inline">--%>
                <%--<input type="text" id="stuEntranceTime" readonly lay-verify="required" class="layui-input" value="${oneStudent.stuEntrancetime}" />--%>
            <%--</div>--%>
        <%--</div>--%>
        <div class="layui-form-item">
            <label class="layui-form-label">入学时间</label>
            <div class="layui-input-inline">
                <input type="text" id="stuEntranceTime" readonly lay-verify="required" class="layui-input"
                       value="<fmt:formatDate value='${oneStudent.stuEntrancetime}' pattern='yyyy-MM-dd' />" />
            </div>
            <label class="layui-form-label">毕业时间</label>
            <div class="layui-input-inline">
                <input type="text" id="stuGraduationTime" readonly lay-verify="required" class="layui-input"
                       value="<fmt:formatDate value='${oneStudent.stuGraduationtime}' pattern='yyyy-MM-dd' />" />
            </div>
        </div>
        <%--<div class="layui-form-item">--%>
            <%--<label class="layui-form-label">政治面貌</label>--%>
            <%--<div class="layui-input-inline">--%>
                <%--<input type="text" id="stuPoliticalFace" readonly lay-verify="required" class="layui-input" value="${oneStudent.stuPoliticalface}" />--%>
            <%--</div>--%>
        <%--</div>--%>
        <div class="layui-form-item">
            <label class="layui-form-label">家庭电话</label>
            <div class="layui-input-inline">
                <input type="text" id="stuFamilyNum" readonly lay-verify="required" class="layui-input" value="${oneStudent.stuFamilynum}" />
            </div>
            <label class="layui-form-label">家庭住址</label>
            <div class="layui-input-inline">
                <input type="text" id="stuAddress" readonly lay-verify="required" class="layui-input" value="${oneStudent.stuAddress}" />
            </div>
        </div>
        <%--<div class="layui-form-item">--%>
            <%--<label class="layui-form-label">家庭住址</label>--%>
            <%--<div class="layui-input-inline">--%>
                <%--<input type="text" id="stuAddress" readonly lay-verify="required" class="layui-input" value="${oneStudent.stuAddress}" />--%>
            <%--</div>--%>
        <%--</div>--%>
        <div class="layui-form-item">
            <label class="layui-form-label">手机号</label>
            <div class="layui-input-inline">
                <input type="text" id="stuPhone" readonly lay-verify="required" class="layui-input" value="${oneStudent.stuPhone}" />
            </div>
            <label class="layui-form-label">身份证</label>
            <div class="layui-input-inline">
                <input type="text" id="stuIdCard" readonly lay-verify="required" class="layui-input" value="${oneStudent.stuIdcard}" />
            </div>
        </div>
        <%--<div class="layui-form-item">--%>
            <%--<label class="layui-form-label">身份证</label>--%>
            <%--<div class="layui-input-inline">--%>
                <%--<input type="text" id="stuIdCard" readonly lay-verify="required" class="layui-input" value="${oneStudent.stuIdcard}" />--%>
            <%--</div>--%>
        <%--</div>--%>
        <div class="layui-form-item">
            <label class="layui-form-label">所在班级</label>
            <div class="layui-input-inline">
                <input type="text" id="stuClass" readonly lay-verify="required" class="layui-input" value="${oneStudent.stuClazzid}" />
            </div>
            <label class="layui-form-label">所在宿舍</label>
            <div class="layui-input-inline">
                <input type="text" id="stuDormitoryId" readonly lay-verify="required" class="layui-input" value="${oneStudent.stuDormitoryid}" />
            </div>
        </div>
        <%--<div class="layui-form-item">--%>
            <%--<label class="layui-form-label">所在宿舍</label>--%>
            <%--<div class="layui-input-inline">--%>
                <%--<input type="text" id="stuDormitoryId" readonly lay-verify="required" class="layui-input" value="${oneStudent.stuDormitoryid}" />--%>
            <%--</div>--%>
        <%--</div>--%>
        <div class="layui-form-item">
            <label class="layui-form-label">所属民族</label>
            <div class="layui-input-inline">
                <input type="text" id="stuNational" readonly lay-verify="required" class="layui-input" value="${oneStudent.stuNational}" />
            </div>
        </div>
        <%--<div class="layui-form-item">--%>
            <%--<label class="layui-form-label">状态</label>--%>
            <%--<div class="layui-input-inline">--%>
                <%--<input type="text" id="stuStatus" readonly lay-verify="required" class="layui-input" value="${oneStudent.stuStatus}" />--%>
            <%--</div>--%>
        <%--</div>--%>
    </div>
</body>
<script>

</script>
</html>
