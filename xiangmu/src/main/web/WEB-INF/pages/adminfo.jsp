<%--
  Created by IntelliJ IDEA.
  User: WDB1
  Date: 2018/9/16
  Time: 16:16
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
<a href="pagingadmdeliver?currentPage=1"><input type="button" value="查看投递的简历"></a>
</body>
</html>
