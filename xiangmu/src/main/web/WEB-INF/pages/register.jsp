<%--
  Created by IntelliJ IDEA.
  User: WDB1
  Date: 2018/10/19
  Time: 10:21
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
    <script src="js/jquery-3.2.1.js"></script>
    <script>
        $(function () {
            $("input[name='user']").blur(function () {
                $.ajax({
                    type:"get",
                    url:"check",
                    data:{user:$("input[name='user']").val()},
                    success:function (obj) {
                        alert(obj);
                        if(obj=="用户名重复"){
                            $("input[name='user']").val("");
                        }
                    }
                })
            })
        })
    </script>
</head>
<body>
<center><h1>欢迎注册</h1></center>
<form action="RegisterServlet" method="post">
    <div id="d1">
        <table>
            <tr>
                <td>用户名：</td>
                <td><input type="text" name="user" required/><br/></td>
            </tr>
            <tr>
                <td>密码：</td>
                <td><input type="password"name="password" required/><br/></td>
            </tr>
            <tr>
                <td> 确认密码：</td>
                <td><input type="password"name="password1" required/><br/></td>
            </tr>
            <tr>
                <td><input type='submit'value="注册"></td>
                <td>
                    <a href="../../index.jsp"><input type="button" value="返回"></a>
                </td>
            </tr>
        </table>
    </div>
</form>
<h4 style="color: red">
        <%
        String str = (String) request.getAttribute("reg");
        if (str!=null){
            out.print(str);
        }
    %>
</h4>
</body>
</html>
