layui.use(['form','layer'], function(){
    $ = layui.jquery;
    var form = layui.form
        ,layer = layui.layer;

    //自定义验证规则
    form.verify({
        phoneNum:  [/(^$)|^1\d{10}$/, '请输入正确的手机号']
    });

    //监听提交
    form.on('submit(add)', function(data){
        data.field.teaPicture = $('#image').get(0).currentSrc;
        //发异步，把数据提交给php
        $.ajax({
            url : 'http://localhost:8080/teacher/add'
            ,type : 'post'
            ,data : {
                "result" : JSON.stringify(data.field)
            },success : function () {
                layer.alert("添加成功", {icon: 6},function () {
                    // 获得frame索引
                    var index = parent.layer.getFrameIndex(window.name);
                    window.parent.location.reload();
                    //关闭当前frame
                    parent.layer.close(index);
                    return true;
                });
            },error : function () {
                layer.alert("添加失败", {icon: 5},function () {
                    // 获得frame索引
                    var index = parent.layer.getFrameIndex(window.name);
                    //关闭当前frame
                    parent.layer.close(index);
                    return true;
                });
            }
        });
        return false;
    });


});

layui.use('laydate', function(){
    var laydate = layui.laydate;

    laydate.render({
        elem: '#L_teaCjny,#L_teaCredentialstime,#L_teaBirthdate,#L_teaCjgzny,#L_teaCometime' //指定元素
    });
});

layui.use('upload', function () {
    var upload = layui.upload;

    //执行实例
    upload.render({
        elem: '#test8'
        , auto: false //选择文件后不自动上传
        , choose: function (obj) {
            //将每次选择的文件追加到文件队列
            obj.preview(function (index, file, result) {
                $("#image").attr("src", result);
            });
        }
    });
});