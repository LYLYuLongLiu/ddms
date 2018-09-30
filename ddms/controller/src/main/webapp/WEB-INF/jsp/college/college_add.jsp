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


			<%--<div class="layui-form-item">--%>
				<%--<div class="layui-inline">--%>
					<%--<label class="layui-form-label">学院编号</label>--%>
					<%--<div class="layui-input-inline">--%>
						<%--<input type="text" name="id" id="id" autocomplete="off"--%>
							   <%--class="layui-input">--%>
					<%--</div>--%>
				<%--</div>--%>

			<div class="layui-form-item">
				<div class="layui-inline">
					<label class="layui-form-label">学院名称</label>
					<div class="layui-input-inline">
						<input type="text" name="collegeName" id="college_Name" autocomplete="off"
							class="layui-input">
					</div>
				</div>

				<%--<div class="layui-form-item">--%>
				<%--<label class="layui-form-label">备注</label>--%>
				<%--<div class="layui-input-inline">--%>
					<%--<input type="text" name="remark" id="remark" autocomplete="off"--%>
						   <%--class="layui-input">--%>
			    <%--</div>--%>
			    <%--</div>--%>
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
	   		url:'http://localhost:8080/college/add',
	   		type:"post",
	   		data:{
	   		    id: $('#id').val(),
	   			collegeName : $('#college_Name').val(),
	   			//remark:$('#remark').val(),
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
