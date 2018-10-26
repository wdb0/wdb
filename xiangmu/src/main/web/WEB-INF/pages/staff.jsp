<%--
  Created by IntelliJ IDEA.
  User: WDB1
  Date: 2018/10/26
  Time: 11:02
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
<form action="loginstaff" method="post">
    <div id="d1">
        <table>
            <tr>
                <td>用户名：</td>
                <td><input name="sf_name"/><br/></td>
            </tr>
            <tr>
                <td>密码：</td>
                <td><input type="password" name="sf_pass"/><br/></td>
            </tr>
            <tr>
                <td><input type="submit" value="登陆"></td>
            </tr>
        </table>
    </div>
</form>
</body>
</html>
