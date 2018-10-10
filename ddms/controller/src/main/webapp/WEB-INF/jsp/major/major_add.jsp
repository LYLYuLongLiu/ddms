<%--
  Created by eclipse.
  User: songjunwei
  Date: 2018/9/22
  Time: 18:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<title>专业数据更新管理</title>
<link rel="stylesheet" type="text/css" href="/js/layui/css/layui.css">
<script type="text/javascript" src="/js/jquery-2.2.4-min.js"></script>
</head>

<body>
	<div style="padding: 15px;">
		<form class="layui-form" action="">
			<div class="layui-form-item">
				<div class="layui-inline">
					<label class="layui-form-label">专业名称</label>
					<div class="layui-input-inline">
						<input type="tel" name="majorname" id="majorName" autocomplete="off"
							class="layui-input">
					</div>
				</div>
				<div class="layui-form-item">
				    <label class="layui-form-label">学院</label>
				    <div class="layui-input-inline">
				      <select name="collegeName" id="collegeName">
				        <option value="" selected>请选择学院</option>
				        <c:forEach items="${list}" var="list">
				        	<option value="${list.id}">${list.collegeName}</option>
				        </c:forEach>
				      </select>
				    </div>
				</div>
				<div class="layui-inline">
					<label class="layui-form-label">学科门类</label>
					<div class="layui-input-inline">
						<input type="text" name="email"
							id="majorDisciplinecategories" autocomplete="off"
							class="layui-input">
					</div>
				</div>
				<div class="layui-inline">
					<label class="layui-form-label">学历</label>
					<div class="layui-input-inline">
						<input type="text" name="email"
							id="majorEducation" autocomplete="off" class="layui-input">
					</div>
				</div>
				<div class="layui-inline">
					<label class="layui-form-label">学制</label>
					<div class="layui-input-inline">
						<input type="text" name="email"
							id="schoolsystem" autocomplete="off" class="layui-input">
					</div>
				</div>
			</div>
			<div class="layui-form-item">
				<div class="layui-input-block">
					<button class="layui-btn" lay-submit="" lay-filter="demo1">立即提交</button>
				</div>
			</div>
		</form>
	</div>
</body>
<script type="text/javascript" src="/js/layui/layui.js"></script>
<script>
layui.use(['form', 'layedit', 'laydate'], function(){
	  var form = layui.form
	  ,layer = layui.layer
	  ,layedit = layui.layedit
	  ,laydate = layui.laydate; 
	  //监听提交
	  form.on('submit(demo1)', function(data){
	    //layer.alert(JSON.stringify(data.field), {
	     // title: '最终的提交信息'
	   // })
	   	$.ajax({
	   		url:'http://localhost:8080/addmajor',
	   		type:"post",
	   		data:{
	   			majorName : $('#majorName').val(),
	   			majorCollegeid:$('#collegeName').val(),
	   			majorDisciplinecategories:$('#majorDisciplinecategories').val(),
				majorEducation: $('#majorEducation').val(),
				schoolsystem:$('#schoolsystem').val()
	   		},success: function(data){
	   			// 获得frame索引
				var index = parent.layer.getFrameIndex(window.name);
				//实时更新
				window.parent.location.reload();
				//关闭当前frame
				parent.layer.close(index);
	   		},error: function(data){
	   			layer.msg('插入失败',{icon: 5,time:1000});
	   		}
	   	})
	    return false;
	  });
	});
</script>	
</html>
