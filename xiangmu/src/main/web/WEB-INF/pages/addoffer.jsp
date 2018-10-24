<%--
  Created by IntelliJ IDEA.
  User: WDB1
  Date: 2018/10/24
  Time: 13:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>"/>
    <title>Title</title>
</head>
<body>
<form action="addof">
    内容：<textarea onKeyDown="if(value.length>300) value=value.substr(0,300)"   style="width:435px;height:150px;resize:none" name="view"></textarea>
    <input type="submit" value="发送">
</form>
</body>
</html>
