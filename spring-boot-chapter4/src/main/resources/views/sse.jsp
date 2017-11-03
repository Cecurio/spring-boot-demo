<%--
  Created by IntelliJ IDEA.
  User: Cecurio
  Date: 2017/11/2
  Time: 17:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>SSE Demo</title>
    <meta http-equiv="content-type" content="text/html;charset=UTF-8">
</head>
<body>
<div id="msgFromPush"></div>

<script type="application/javascript" src="assets/js/jquery-3.2.1.min.js"></script>

<script>
    // EventSource对象只有新式的浏览器才有，EventSource是SSE的客户端
    if (!!window.EventSource) {
        var source = new EventSource('push');
        s = '';

        // 添加SSE客户端监听，再次获取服务器端推送的消息
        source.addEventListener('message', function (e) {
            s += e.data + "<br/>";
            $("#msgFromPush").html(s);
        });

        source.addEventListener('open', function (e) {
            console.log("连接打开");
        }, false);

        source.addEventListener('error', function (e) {
            if (e.readyState == EventSource.CLOSED) {
                console.log("连接关闭");
            } else {
                console.log(e.readyState);
            }
        }, false);
    } else {
        console.log("你的浏览器不支持SSE")
    }
</script>

</body>
</html>
