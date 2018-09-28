<%--
  Created by IntelliJ IDEA.
  User: 84261
  Date: 2018/9/24
  Time: 11:26
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
    <title>编辑</title>
    <link rel="stylesheet" type="text/css" href="${ctx}/js/layui/css/layui.css">
    <script type="text/javascript" src="${ctx}/js/jquery-2.2.4-min.js"></script>
</head>
<body>
    <form action="" method="post" id="form1" class="layui-form">
        <input type="text" value="${oneStudent.id}" id="id" name="id" hidden>
        <div class="layui-form-item">
            <div class="layui-inline">
                <label class="layui-form-label">姓名</label>
                <div class="layui-input-block">
                    <input type="text" name="stuName" id="stuName" autocomplete="off" class="layui-input" value="${oneStudent.stuName}">
                </div>
            </div>
            <div class="layui-inline">
                <label class="layui-form-label">性别</label>
                <div class="layui-input-inline">
                    <input type="text" name="stuSex" id="stuSex" autocomplete="off" class="layui-input" value="${oneStudent.stuSex}">
                </div>
            </div>
        </div>
        <div class="layui-form-item">
            <div class="layui-inline">
                <label class="layui-form-label">出生日期</label>
                <div class="layui-input-block">
                    <input type="text" name="stuBrithdate" id="stuBrithdate" autocomplete="off" class="layui-input"
                           value="<fmt:formatDate value='${oneStudent.stuBrithdate}' pattern='yyyy-MM-dd' />">
                </div>
            </div>
            <div class="layui-inline">
                <label class="layui-form-label">籍贯</label>
                <div class="layui-input-inline">
                    <input type="text" name="stuNative" id="stuNative" autocomplete="off" class="layui-input" value="${oneStudent.stuNative}">
                </div>
            </div>
        </div>
        <div class="layui-form-item">
            <div class="layui-inline">
                <label class="layui-form-label">入学时间</label>
                <div class="layui-input-block">
                    <input type="text" name="stuEntrancetime" id="stuEntrancetime" autocomplete="off" class="layui-input"
                           value="<fmt:formatDate value='${oneStudent.stuEntrancetime}' pattern='yyyy-MM-dd' />">
                </div>
            </div>
            <div class="layui-inline">
                <label class="layui-form-label">毕业时间</label>
                <div class="layui-input-inline">
                    <input type="text" name="stuGraduationtime" id="stuGraduationtime" autocomplete="off" class="layui-input"
                           value="<fmt:formatDate value='${oneStudent.stuGraduationtime}' pattern='yyyy-MM-dd' />">
                </div>
            </div>
        </div>
        <div class="layui-form-item">
            <div class="layui-inline">
                <label class="layui-form-label">政治面貌</label>
                <div class="layui-input-block">
                    <input type="text" name="stuPoliticalface" id="stuPoliticalface" autocomplete="off" class="layui-input" value="${oneStudent.stuPoliticalface}">
                </div>
            </div>
            <div class="layui-inline">
                <label class="layui-form-label">家庭电话</label>
                <div class="layui-input-inline">
                    <input type="text" name="stuFamilynum" id="stuFamilynum" autocomplete="off" class="layui-input" value="${oneStudent.stuFamilynum}">
                </div>
            </div>
        </div>
        <div class="layui-form-item">
            <div class="layui-inline">
                <label class="layui-form-label">家庭住址</label>
                <div class="layui-input-block">
                    <input type="text" name="stuAddress" id="stuAddress" autocomplete="off" class="layui-input" value="${oneStudent.stuAddress}">
                </div>
            </div>
            <div class="layui-inline">
                <label class="layui-form-label">手机号</label>
                <div class="layui-input-inline">
                    <input type="text" name="stuPhone" id="stuPhone" autocomplete="off" class="layui-input" value="${oneStudent.stuPhone}">
                </div>
            </div>
        </div>
        <div class="layui-form-item">
            <div class="layui-inline">
                <label class="layui-form-label">身份证号</label>
                <div class="layui-input-block">
                    <input type="text" name="stuIdcard" id="stuIdcard" autocomplete="off" class="layui-input" value="${oneStudent.stuIdcard}">
                </div>
            </div>
            <div class="layui-inline">
                <label class="layui-form-label">所属班级</label>
                <div class="layui-input-inline">
                    <input type="text" name="stuClazzid" id="stuClazzid" autocomplete="off" class="layui-input" value="${oneStudent.stuClazzid}">
                </div>
            </div>
        </div>
        <div class="layui-form-item">
            <div class="layui-inline">
                <label class="layui-form-label">宿舍号</label>
                <div class="layui-input-block">
                    <input type="text" name="stuDormitoryid" id="stuDormitoryid" autocomplete="off" class="layui-input" value="${oneStudent.stuDormitoryid}">
                </div>
            </div>
            <div class="layui-inline">
                <label class="layui-form-label">民族</label>
                <div class="layui-input-inline">
                    <input type="text" name="stuNational" id="stuNational" autocomplete="off" class="layui-input" value="${oneStudent.stuNational}">
                </div>
            </div>
        </div>
        <div class="layui-form-item">
            <div class="layui-inline">
                <label class="layui-form-label">状态</label>
                <div class="layui-input-inline">
                    <select name="stuStatus" id="stuStatus">
                        <option value="正常" <c:if test = "${ oneStudent.stuStatus == '正常' }">selected="selected"</c:if>>正常</option>
                        <option value="休学" <c:if test = "${ oneStudent.stuStatus == '休学' }">selected="selected"</c:if>>休学</option>
                        <option value="退学" <c:if test = "${ oneStudent.stuStatus == '退学' }">selected="selected"</c:if>>退学</option>
                        <option value="毕业" <c:if test = "${ oneStudent.stuStatus == '毕业' }">selected="selected"</c:if>>毕业</option>
                        <option value="参军" <c:if test = "${ oneStudent.stuStatus == '参军' }">selected="selected"</c:if>>参军</option>
                    </select>
                </div>
            </div>
            <div class="layui-inline">
                <button class="layui-btn" lay-submit lay-filter="editForm">立即提交</button>
            </div>
        </div>
    </form>
</body>
<script type="text/javascript" src="${ctx }/js/layui/layui.js"></script>
<script>
    layui.use('form', function(){
        var form = layui.form;
        //监听提交
        form.on('submit(editForm)', function(data){
            console.log(data);
            $.ajax({
                type : 'POST',
                url: '${ctx}/updateStudent',
                dataType : 'json',
                data:{
                    student : JSON.stringify(data.field)
                },
                success: function (msg) {
                    if(msg.data === 1){
                        // layer.alert('修改成功了哦！ (*^v^*)', {
                        //     icon: 6,
                        //     skin: 'layer-ext-moon' //该皮肤由layer.seaning.com友情扩展。关于皮肤的扩展规则，去这里查阅
                        // });
                        layer.alert('修改成功了哦！ (*^v^*)',{
                            icon: 6,
                            skin: 'layer-ext-moon'
                        }, function(index){
                            //do something
                            window.parent.location.reload();
                            layer.close(index);
                        });
                    }else{
                        layer.alert('修改失败了。 つ﹏⊂', {
                            icon: 5,
                            skin: 'layer-ext-moon' //该皮肤由layer.seaning.com友情扩展。关于皮肤的扩展规则，去这里查阅
                        });
                    }
                },
                error: function () {
                    layer.msg('程序猿偷懒了，没写好接口 (⊙ˍ⊙)', {icon: 5});
                }
            });
            return false;
        });
    });
</script>
</html>
