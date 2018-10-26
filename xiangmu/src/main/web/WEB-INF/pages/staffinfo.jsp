<%--
  Created by IntelliJ IDEA.
  User: WDB1
  Date: 2018/10/26
  Time: 11:31
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
<a href=""><input type="button" value="打卡"></a>
<a href=""><input type="button" value="培训"></a>
<a href=""><input type="button" value="奖惩"></a>
<a href=""><input type="button" value="查看部门员工"></a>
<a href=""><input type="button" value="个人资料"></a>
</body>
</html>
