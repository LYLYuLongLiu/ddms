<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<title>班级数据更新管理</title>
<link rel="stylesheet" type="text/css" href="/js/layui/css/layui.css">
<script type="text/javascript" src="/js/jquery-2.2.4-min.js"></script>
</head>

<body>
	<div style="padding: 15px;">
		<form class="layui-form" action="">
			<%--<div class="layui-form-item">--%>
				<%--<div class="layui-inline">--%>
					<%--<label class="layui-form-label">班级编号</label>--%>
					<%--<div class="layui-input-inline">--%>
						<%--<input type="text" name="id" id="id" autocomplete="off"--%>
							   <%--class="layui-input">--%>
					<%--</div>--%>
				<%--</div>--%>
			<%--</div>--%>
			<div class="layui-form-item">
				<div class="layui-inline">
					<label class="layui-form-label">班级名称</label>
					<div class="layui-input-inline">
						<input type="text" name="clazzName" id="clazz_Name" autocomplete="off"
							class="layui-input">
					</div>
				</div>
			</div>
			<div class="layui-form-item">
					<div class="layui-inline">
						<label class="layui-form-label">班级人数</label>
						<div class="layui-input-inline">
							<input type="text" name="clazzNum" id="clazz_Num" autocomplete="off"
								   class="layui-input">
						</div>
					</div>
				</div>
			<div class="layui-form-item">
					<label class="layui-form-label">专业</label>
					<div class="layui-input-inline">
						<select name="majorid" id="majorid">
							<option value="" selected>请选择专业</option>
							<c:forEach items="${selmajor}" var="selmajor">
								<option value="${selmajor.id}">${selmajor.majorName}</option>
							</c:forEach>
						</select>
					</div>
				</div>
			<div class="layui-form-item">
						<label class="layui-form-label">学院</label>
						<div class="layui-input-inline">
							<select name="collegeName" id="collegeName">
								<option value="" selected>请选择学院</option>
								<c:forEach items="${selcollege}" var="selcollege">
									<option value="${selcollege.id}">${selcollege.collegeName}</option>
								</c:forEach>
							</select>
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
		  console.log($('#major_id').val());
	   	$.ajax({
	   		url:'http://localhost:8080/clazz/add',
	   		type:"post",
	   		data:{
	   		    id: $('#id').val(),
	   			clazzName : $('#clazz_Name').val(),
				clazzNum:$('#clazz_Num').val(),
                clazzMajorid:$('#majorid').val(),
                collegeid:$('#collegeName').val(),
	   			//remark:$('#remark').val()
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
