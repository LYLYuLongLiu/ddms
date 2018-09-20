<%--
  Created by IntelliJ IDEA.
  User: 84261
  Date: 2018/9/19
  Time: 10:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>后台管理系统登录</title>
    <script type="text/javascript" src="/js/jquery-2.2.4-min.js"></script>
    <link rel="stylesheet" href="/js/layui/css/layui.css"  media="all">
</head>
<body>
<form action="/login/loginToIndex" method="post" id="form1">
    <div style="text-align: center;">
        <table style="text-align: center;">
            <tr>
                <td>用户名：</td>
                <td><input type="text" id="username" name="username"></td>
            </tr>

            <tr>
                <td>密码：</td>
                <td><input type="password" id="pwd" name="pwd"></td>
            </tr>
            <tr>
                <td><button>登录</button></td>
            </tr>
        </table>
    </div>
</form>
</body>
<script src="/js/layui/layui.js" charset="utf-8"></script>
<script>
    layui.use('layer', function() {
        var $ = layui.jquery, layer = layui.layer;
        $('button').on('click', function () {
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
