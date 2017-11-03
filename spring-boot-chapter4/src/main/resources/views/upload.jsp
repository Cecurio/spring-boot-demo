<%--
  Created by IntelliJ IDEA.
  User: Cecurio
  Date: 2017/11/2
  Time: 9:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>upload page</title>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8"/>
</head>
<body>
<div class="upload">
    <form action="upload" enctype="multipart/form-data" method="post">
        <input type="file" name="file"/><br>
        <input type="submit" value="上传">
    </form>
</div>
</body>
</html>
