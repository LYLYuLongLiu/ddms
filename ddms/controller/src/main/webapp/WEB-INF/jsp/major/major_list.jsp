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
				<input class="layui-input" name="selmajorName" id="selmajorName" autocomplete="off">
			</div>学历：
			<div class="layui-inline">
				<input class="layui-input" name="selmajorEducation" id="selmajorEducation" autocomplete="off">
			</div>
			<button class="layui-btn" id="search" data-type="reload">搜索</button>
		</div>
		<div>
			<button class="layui-btn layui-btn-sm" id="filePath" name="filePath"><i class="layui-icon"></i>批量导入</button>
		    <button class="layui-btn layui-btn-sm" id="exportAll">全部导出</button>
  	    	<button class="layui-btn layui-btn-sm" id="addmajor">增加</button>
		</div>	      
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
			,id:'majorReload'
			,cols : [ [ {field : 'id',title : '编号',sort : true
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
		        	    layer.msg("删除成功");
					},error:function(data){
                        layer.msg("删除失败");
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
		  
		  $("#search").click(function(){
			  reload();
			});
		  $('#addmajor').click(function () {              
              layer.open({
                  type: 2,
                  content: 'http://localhost:8080/selcollege',
                  area: ['500px','400px'],
                  offset: ['0px', '250px']
              })
          })
		  $('#exportAll').click(function(){
			  $.ajax({
		        	url : 'http://localhost:8080/selectByEducationOrName',
					type : "get",
				    data:{
                        majorName : $('#selmajorName').val(),
                        majorEducation : $('#selmajorEducation').val()
					},
					success : function(data) {
						//定义一个数组
						var x= new Array();
						console.log(data.data);
						 for(var i = 0; i<data.data.length; i++) {		
							 //定义一个数组的数组
		                     x[i] = new Array();
							 x[i]=[data.data[i].id,data.data[i].majorName,data.data[i].collegeName,
									 data.data[i].majorDisciplinecategories,data.data[i].majorEducation,data.data[i].schoolsystem];   
						 }
						 console.log(x[i]);
						 table.exportFile(['编号','专业名称','学院','学科门类','学历','学制'], x, 'xls');
					},error:function(data){
						 layer.msg("导出失败");
					}
		        })
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
		}
	
	layui.use('upload', function(){
		  var $ = layui.jquery
		  ,upload = layui.upload;
		  //指定允许上传的文件类型
		  upload.render({
		    elem: '#filePath'
		    ,url: 'http://localhost:8080/readExcelData'
		    ,field: 'filePath'
		    ,accept: 'file' //普通文件
		    ,success:function(data){
		    	 layer.msg("上传成功");
		    }
		  	,error: function(data){
		  		 layer.msg("上传失败");
		  	}
		  });		  
	  })
</script>
</html>
