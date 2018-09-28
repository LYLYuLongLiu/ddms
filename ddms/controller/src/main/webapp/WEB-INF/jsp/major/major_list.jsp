<%--
  Created by eclipse.
  User: songjunwei
  Date: 2018/9/20
  Time: 19:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<title>专业管理</title>
<link rel="stylesheet" type="text/css" href="/js/layui/css/layui.css">
<script type="text/javascript" src="/js/jquery-2.2.4-min.js"></script>
</head>

<body>
	<div style="padding: 15px;">
		<div class="demoTable" style="text-align: center; margin-top: 15px;">
			专业名称：
			<div class="layui-inline">
				<input class="layui-input" name="selmajorName" id="selmajorName"
					autocomplete="off">
			</div>
			学历：
			<div class="layui-inline">
				<input class="layui-input" name="selmajorEducation"
					id="selmajorEducation" autocomplete="off">
			</div>
			<button class="layui-btn" id="search" data-type="reload">搜索</button>
		</div>
		<div class="layui-btn-group demoTable" style="margin-top: 20px;">
			<script type="text/html" id="toolbarDemo">
  			<div class="layui-btn-container" id="aaa">
   			 	<button class="layui-btn layui-btn-sm" lay-event="getCheckData">获取选中行数据</button>

  			</div>
			</script>
		</div>
        <button class="layui-btn addmajor" id="addmajor">增加</button>
		<table id="major" lay-filter="test"></table>
		<script type="text/html" id="barDemo">
  			<a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
  			<a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
		</script>
	</div>
</body>
<script type="text/javascript" src="/js/layui/layui.js"></script>
<script>
	layui.use('table', function() {
		var table = layui.table;
		table.render({
			elem : '#major' //指定原始表格元素选择器（推荐id选择器）
			,url : 'http://localhost:8080/selmajor'
			,height:473
			,toolbar: '#toolbarDemo'
			,id:'majorReload'
			,cols : [ [ {
				type : 'checkbox',fixed : 'left'
			} //选择框
			, {field : 'id',title : '编号',sort : true
			}, {field : 'majorName',title : '专业名称'
			}, {field : 'collegeName',title : '学院'
			}, {field : 'majorDisciplinecategories',title : '学科门类'
			}, {field : 'majorEducation',title : '学历'
			}, {field : 'schoolsystem',title : '学制'
			}, {fixed : 'right',align : 'center',title : '状态',toolbar : '#barDemo'
			} ] ],
			page : true
		});
		//监听行工具事件
		  table.on('tool(test)', function(obj){
		    var data = obj.data;		   
		    if(obj.event === 'del'){
		      layer.confirm('真的删除行么', function(index){
		    	  console.log(obj.data);
		    	   //console.log($('#id').val());
		    	obj.del();
				layer.close(index);
		        $.ajax({
		        	url : 'http://localhost:8080/delemajor',
					type : "post",
					data : {
						id : obj.data.id
					},success : function(data) {
						alert("删除成功");
					},error:function(data){
						alert("删除失败");
					}
		        })
		      });
		    } else if(obj.event === 'edit'){
		      <%--layer.prompt({
		        formType: 2
		        ,value: data.email
		      }, function(value, index){
		        obj.update({
		          email: value
		        });
		        layer.close(index);
		      });--%>
		      var ids=obj.data.id;
		      //var thisid = parseInt(ids);
		      console.log(ids);
		     layer.open({
					type: 2, 
					content: 'http://localhost:8080/selectMajorAccrodingtoid?id='+ids, 
				    area: ['500px','400px'],
					offset: ['0px', '250px']
		     });
		    }
		  })
	});
	function reload(){
		var table = layui.table;
		console.log(table);
		//执行重载
		table.reload('majorReload', {
		  url: 'http://localhost:8080/selectByEducationOrName'
		  ,where: { //设定异步数据接口的额外参数，任意设
		  	 majorName : $('#selmajorName').val(),
			 majorEducation : $('#selmajorEducation').val()
		  }
		  	,page: true
		  }); 
		}; 
		$("#search").click(function(){
		  reload();
		});
            $('#addmajor').click(function () {
                alert("sdfs");
                layer.open({
                    type: 2,
                    content: 'http://localhost:8080/selcollege',
                    area: ['500px','400px'],
                    offset: ['0px', '250px']
                })
            })
</script>
</html>
