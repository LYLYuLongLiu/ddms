<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<title>学院数据更新管理</title>
<link rel="stylesheet" type="text/css" href="/js/layui/css/layui.css">
<script type="text/javascript" src="/js/jquery-2.2.4-min.js"></script>
</head>

<body>
	<div style="padding: 15px;">
		<form class="layui-form" action="">
			<c:forEach items="${collegeresult}" var="college">
			<input type="hidden" id="id" value="${college.id}"></input>
			<div class="layui-form-item">
				<div class="layui-inline">
					<label class="layui-form-label">学院名称</label>
					<div class="layui-input-inline">
						<input type="text" name="collegename" id="collegeName" autocomplete="off"
							class="layui-input" value="${college.collegeName}">
					</div>
				</div>
				</div>

				<%--<div class="layui-inline">--%>
					<%--<label class="layui-form-label">备注</label>--%>
					<%--<div class="layui-input-inline">--%>
						<%--<input type="text" name="remark"--%>
							<%--id="remark" autocomplete="off"--%>
							<%--class="layui-input" value="${college.remark}">--%>
					<%--</div>--%>
				<%--</div>--%>

				<div class="layui-form-item">
					<div class="layui-input-block">
						<button class="layui-btn" lay-submit="" lay-filter="demo1">立即提交</button>
					</div>
				</div>
			</c:forEach>
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
	   console.log($('#collegeName').val());
	   	$.ajax({
	   		url:'http://localhost:8080/college/update',
	   		type:"post",
	   		data:{
	   			id:$('#id').val(),
	   			collegeName : $('#collegeName').val(),
	   			//remark:$('#remark').val(),
	   		},success: function(data){
	   			// 获得frame索引
				var index = parent.layer.getFrameIndex(window.name);
				//实时更新
				window.parent.location.reload();
				//关闭当前frame
				parent.layer.close(index);
	   		},error: function(data){
	   			layer.msg('更新失败',{icon: 5,time:1000});
	   		}
	   	})
	    return false;
	  });
	});
</script>	
</html>
