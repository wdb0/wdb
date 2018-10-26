<%--
  Created by IntelliJ IDEA.
  User: WDB1
  Date: 2018/10/25
  Time: 16:26
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
<form action="addDp">
    部门名称：<input type="text" name="department" required>
    <input type="submit" value="添加部门">
</form>
<h4 style="color: red">
    <%
        String str = (String) request.getAttribute("dp");
        if (str!=null){
            out.print(str);
        }
    %>
</h4>
</body>
</html>
