<%--
  Created by IntelliJ IDEA.
  User: 84261
  Date: 2018/9/29
  Time: 10:53
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
    <title>添加管理员</title>
    <link rel="stylesheet" type="text/css" href="${ctx}/js/layui/css/layui.css">
    <script type="text/javascript" src="${ctx}/js/jquery-2.2.4-min.js"></script>
</head>
<body>
    <form action="" method="post" id="form1" class="layui-form">
        <div class="layui-form-item">
            <div class="layui-inline">
                <label class="layui-form-label">管理员账号</label>
                <div class="layui-input-block">
                    <input type="text" name="adminAccnum" id="adminAccnum" autocomplete="off" class="layui-input" >
                </div>
            </div>
        </div>
        <div class="layui-form-item">
            <div class="layui-inline">
                <label class="layui-form-label">管理员密码</label>
                <div class="layui-input-block">
                    <input type="password" name="adminPassword" id="adminPassword" autocomplete="off" class="layui-input" >
                </div>
            </div>
        </div>
        <div class="layui-inline">
            <button class="layui-btn" lay-submit lay-filter="addForm">添加</button>
        </div>
    </form>
</body>
<script type="text/javascript" src="${ctx }/js/layui/layui.js"></script>
<script>
    layui.use('form',function () {
        var form = layui.form;
        form.on('submit(addForm)', function(data){
            console.log(data);
            $.ajax({
               type : 'POST',
               url : '${ctx}/addAdministrator',
               dataType : 'json',
               data : {
                   administrators : JSON.stringify(data.field)
                },
               success : function (msg) {
                    if (msg.data === 1){

                        layer.alert('添加成功 (*^v^*)', {
                            icon: 6,
                            skin: 'layer-ext-moon' //该皮肤由layer.seaning.com友情扩展。关于皮肤的扩展规则，去这里查阅
                        });
                        document.getElementById("form1").reset();
                    }else{
                        layer.alert('添加失败 つ﹏⊂', {
                            icon: 5,
                            skin: 'layer-ext-moon' //该皮肤由layer.seaning.com友情扩展。关于皮肤的扩展规则，去这里查阅
                        });
                    }
               },
                error : function () {
                    layer.msg('程序猿偷懒了，没写好接口 (⊙ˍ⊙)', {icon: 5});
                }
            });
            return false;
        })
    })
</script>
</html>
