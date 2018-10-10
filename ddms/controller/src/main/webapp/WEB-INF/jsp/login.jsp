<%--
  Created by IntelliJ IDEA.
  User: 84261
  Date: 2018/9/25
  Time: 18:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8" />
    <title>登录</title>
    <script type="text/javascript" src="/js/jquery-2.2.4-min.js"></script>
    <link rel="stylesheet" href="/js/layui/css/layui.css"  media="all">
    <link rel="stylesheet" type="text/css" href="/css/login.css"/>
</head>
<body>
<div id="bg">
    <img src="/image/bgimg.jpg" />
</div>
<div id="form">
    <form action="/loginToIndex" method="post" id="form1">
        <span>账号</span><input type="text" name="username" id="username" placeholder="请输入账号"/></br></br>
        <span>密码</span><input type="password" name="pwd" id="pwd" placeholder="请输入密码" /></br></br>
        <input id="btn" type="button" value="登陆" style="background-color: cornflowerblue; border: none; width: 160px;height:30px;border-radius: 0.25rem; margin-left: 60px;margin-top: 1rem;color: white;" />
    </form>
</div>
</body>
<script src="/js/layui/layui.js" charset="utf-8"></script>
<script>
    layui.use('layer', function() {
        var $ = layui.jquery, layer = layui.layer;
        $('#btn').on('click', function () {

            var name = $('#username').val();
            var pwd = $('#pwd').val();
            $.ajax({
                type: 'post',
                url: 'http://localhost:8080/judge',
                data: {
                    username: name,
                    password: pwd
                },
                success: function (msg) {
                    if (msg.status == 200) {
                        $('#form1').submit();
                    } else {
                        layer.alert('用户名或密码错误', {
                            icon: 5,
                            skin: 'layer-ext-moon' //该皮肤由layer.seaning.com友情扩展。关于皮肤的扩展规则，去这里查阅
                        })
                        return false;
                    }
                }
            });
            return false;
        })
    })
</script>
</html>
