<%--
  Created by IntelliJ IDEA.
  User: WDB1
  Date: 2018/9/5
  Time: 18:06
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
    <title>login</title>
    <script src="js/jquery-3.2.1.js"></script>
    <style>
        #d1{
            width: 350px;
            height:350px;
            background-color: deepskyblue;
            position: relative;
            left:500px;
            top: 170px;
        }
    </style>
    <script>
        function randomColor() {
            var color= '#'+('00000'+(Math.random()*0x1000000<<0).toString(16)).slice(-6);
            document.getElementById("sp1").style.color=color;
        }
        var s=setInterval(function () {
            randomColor()
        },100)
        $(function () {
            $("input[name='log']").click(function () {
                $.ajax({
                    type:"get",
                    url:"CheckadmServlet",
                    data:{user:$("input[name='user']").val(),pass:$("input[name='password']").val()},
                    success:function (obj) {
                        if(obj=="登陆失败"){
                            alert(obj);
                        }else{
                            window.location.href="LogadmServlet";
                        }
                    }
                })
            })
        })
    </script>
</head>
<body>
<center><span id="sp1" style="font-size: 30px " >管理员界面</span></center>
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
                <td><input name="log" type="button" value="登陆"></td>
            </tr>
        </table>
    </div>
</body>
</html>
