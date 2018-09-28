<%--
  Created by IntelliJ IDEA.
  User: 84261
  Date: 2018/9/19
  Time: 20:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%@include file="/taglibs.jsp"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>学院管理</title>
    <link rel="stylesheet" type="text/css" href="${ctx }/js/layui/css/layui.css">
    <script type="text/javascript" src="${ctx }/js/jquery-2.2.4-min.js"></script>
</head>

<body>
<div style="padding: 15px;">
    <div class="demoTable" style="text-align: center;margin-top: 15px;">
        搜索ID：
        <div class="layui-inline">
            <input class="layui-input" name="id" autocomplete="off">
        </div>
        <div class="layui-inline">
            <input class="layui-input" name="id" autocomplete="off">
        </div>
        <div class="layui-inline">
            <input class="layui-input" name="id" autocomplete="off">
        </div>
        <button class="layui-btn" data-type="reload">搜索</button>
    </div>
    <script type="text/html" id="toolbarDemo">
        <div class="layui-btn-container">
            <button class="layui-btn layui-btn-sm" lay-event="bulkImport">批量导入</button>
            <button class="layui-btn layui-btn-sm" lay-event="downloadTheTemplate">下载模板</button>
            <button class="layui-btn layui-btn-sm" lay-event="theBatchExport">批量导出</button>
            <button class="layui-btn layui-btn-sm" lay-event="dataRecovery">数据恢复</button>
        </div>
    </script>
    <table id="student" lay-filter="test"></table>
</div>
</body>
<script type="text/javascript" src="${ctx }/js/layui/layui.js"></script>
<script>
    layui.use('table',function () {
        var table = layui.table;
        table.render({
            elem: '#student' //指定原始表格元素选择器（推荐id选择器）
            ,url: 'http://localhost:8080/configList'
            ,title: '学生表'
            ,toolbar: '#toolbarDemo'
            ,cols: [[
                {type: 'checkbox', fixed: 'left'}  //选择框i
                ,{field:'id',  title: '学号', sort: true}
                ,{field:'stuName',  title: '学生姓名'}
                ,{field:'stuSex',  title: '性别'}
                ,{field:'stuPhone', title: '手机号'}
                // ,{field:'stu_classid', title: '班级', minWidth: 150}
                ,{field:'stuDormitoryid', title: '宿舍号'}
                ,{field:'stuStatus', title: '状态'}
                ,{fixed: 'right', title:'操作', align:'center', toolbar: '#barDemo'}
            ]]
            ,page: true
        });
        //绑定行工具栏事件
        table.on('tool(test)', function(obj){ //注：tool是工具条事件名，test是table原始容器的属性 lay-filter="对应的值"
            var data = obj.data; //获得当前行数据
            var layEvent = obj.event; //获得 lay-event 对应的值（也可以是表头的 event 参数对应的值）
            var tr = obj.tr; //获得当前行 tr 的DOM对象
            if(layEvent === 'edit'){
                //编辑按钮
                console.log(data.id);
                layer.open({
                    type: 2,
                    area: ['900px', '500px'],
                    content: '${ ctx }/goToEdit?id='+data.id //这里content是一个URL，如果你不想让iframe出现滚动条，你还可以content: ['http://sentsin.com', 'no']
                });
            }else if(layEvent === 'see'){
                //查看按钮
                console.log(data.id);
                layer.open({
                    type: 2,
                    area: ['900px', '500px'],
                    content: '${ ctx }/goToSee?id='+data.id //这里content是一个URL，如果你不想让iframe出现滚动条，你还可以content: ['http://sentsin.com', 'no']
                });
            }else if(layEvent === 'del'){
                //删除按钮
                layer.confirm('真的删除么？', {
                    btn: ['朕决定了','算了吧'] //按钮
                }, function(){
                    $.ajax({
                        type : 'GET',
                        url : '${ctx}/firstDelStudent?id='+data.id,
                        dataType : 'json',
                        success : function (msg) {
                            if(msg.data === 1){
                                obj.del(); //删除对应行（tr）的DOM结构，并更新缓存
                                layer.alert('删除成功 (*^v^*)', {
                                    icon: 6,
                                    skin: 'layer-ext-moon' //该皮肤由layer.seaning.com友情扩展。关于皮肤的扩展规则，去这里查阅
                                });
                            }else{
                                layer.alert('删除失败 つ﹏⊂', {
                                    icon: 5,
                                    skin: 'layer-ext-moon' //该皮肤由layer.seaning.com友情扩展。关于皮肤的扩展规则，去这里查阅
                                });
                            }
                        },
                        error : function (msg) {
                            layer.msg('程序猿偷懒了，没写好接口 (⊙ˍ⊙)', {icon: 5});
                            console.log(msg);
                        }
                    });
                }, function(){
                    layer.msg('谢谢大哥不杀之恩 (*^v^*)', {icon: 6});
                });
            }
        });
        //绑定头工具栏事件
        table.on('toolbar(test)', function(obj){
            var checkStatus = table.checkStatus(obj.config.id);
            switch(obj.event){
                case 'bulkImport':
                    //批量导入
                    break;
                case 'downloadTheTemplate':
                    //下载模板
                    break;
                case 'theBatchExport':
                    //批量导出
                    break;
                case 'dataRecovery':
                    //数据恢复
                    layer.open({
                        type: 2,
                        area: ['1000px', '600px'],
                        content: '${ctx}/openDelPage' //这里content是一个URL，如果你不想让iframe出现滚动条，你还可以content: ['http://sentsin.com', 'no']
                    });
                    break;
            }
        });
    })
</script>
<script type="text/html" id="barDemo">
    <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
    <a class="layui-btn layui-btn-xs layui-btn-normal" lay-event="see">查看</a>
    <a class="layui-btn layui-btn-xs layui-btn-danger" lay-event="del">删除</a>
</script>
</html>
