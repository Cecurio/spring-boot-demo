<%--
  Created by IntelliJ IDEA.
  User: Cecurio
  Date: 2017/11/2
  Time: 18:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>servlet async support</title>
    <meta http-equiv="content-type" content="text/html;charset=UTF-8">
</head>
<body>
<script type="application/javascript" src="assets/js/jquery-3.2.1.min.js"></script>
<div id="time"></div>
<script>
    deferred();

    function deferred() {
        $.get('defer',function (data) {
            console.log(data);
            $("#time").html(new Date(data));
            deferred();
        })
    }
</script>
</body>
</html>
