layui.use(['form','layer'], function(){
    $ = layui.jquery;
    var form = layui.form
        ,layer = layui.layer;

    //监听提交
    form.on('submit(add)', function(data){
        //发异步，把数据提交给php
        $.ajax({
            url : 'http://localhost:8080/clazzroom/add'
            ,type : 'post'
            ,data : {
                "result" : JSON.stringify(data.field)
            },success : function (data) {
                if(data.status==200) {
                    layer.alert("更新成功", {icon: 6},function () {
                        // 获得frame索引
                        var index = parent.layer.getFrameIndex(window.name);
                        window.parent.location.reload();
                        //关闭当前frame
                        parent.layer.close(index);
                        return true;
                    });
                } else {
                    layer.alert("更新失败", {icon: 5},function () {
                        // 获得frame索引
                        var index = parent.layer.getFrameIndex(window.name);
                        //关闭当前frame
                        parent.layer.close(index);
                        return true;
                    });
                }

            },error : function () {
                layer.alert("更新失败", {icon: 5},function () {
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
