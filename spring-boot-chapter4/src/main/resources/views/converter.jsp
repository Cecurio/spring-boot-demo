<%--
  Created by IntelliJ IDEA.
  User: Cecurio
  Date: 2017/11/2
  Time: 15:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>HttpMessageConverter Demo</title>
</head>
<body>
<div id="resp">

</div>

<input type="button" onclick="req();" value="请求">

<script src="assets/js/jquery-3.2.1.min.js"></script>
<script>
    function req() {
        $.ajax({
            url: "/convert",
            data:"1-shankai",
            type:"POST",
            contentType:"application/x-wisely",
            success: function (data) {
                $("#resp").html(data);
            }
        })
    }
</script>
</body>
</html>
