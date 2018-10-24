<%--
  Created by IntelliJ IDEA.
  User: WDB1
  Date: 2018/10/19
  Time: 9:40
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
<form action="AutoLoginServlet" method="post">
    <div id="d1">
        <table>
            <tr>
                <td>用户名：</td>
                <td><input name="user"/><br/></td>
            </tr>
            <tr>
                <td>密码：</td>
                <td><input type="password" name="password"/><br/></td>
            </tr>
            <tr>
                <td colspan="2"><input type="checkbox" name="log">记住用户名密码</td>
            </tr>
            <tr>
                <td><input type="submit" value="登陆"></td>
                <td><a href="CheckServlet">自动登陆</a></td>
                <td><a href="register1">立即注册</a></td>
            </tr>
        </table>
    </div>
</form>
<form action="adminjsp">
    <input type="submit" value="管理员登陆">
</form>
</body>
</html>
