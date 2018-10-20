<%--
  Created by IntelliJ IDEA.
  User: WDB1
  Date: 2018/10/19
  Time: 14:43
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
<form action="addres">
<table cellspacing="0"  border="1">
    <tr>
        <td>姓名：</td>
        <td><input type="text" name="re_name" required></td>
        <td>性别：</td>
        <td><input type="text" name="re_sex" required></td>
    </tr>
    <tr>
        <td>年龄：</td>
        <td><input type="number" name="re_age"  min="0" required></td>
        <td>民族：</td>
        <td><input type="text" name="re_nation" required></td>
    </tr>
    <tr>
        <td>籍贯：</td>
        <td><input type="text" name="re_hometown" required></td>
        <td>婚姻状况：</td>
        <td><input type="text" name="re_marry" required></td>
    </tr>
    <tr>
        <td>政治面貌：</td>
        <td><input type="text" name="re_polity" required></td>
        <td>专业：</td>
        <td><input type="text" name="re_major" required></td>
    </tr>
    <tr>
        <td>毕业学校：</td>
        <td colspan="3"><input style="width:435px" type="text" name="re_school" required></td>
    </tr>
    <tr>
        <td>联系电话：</td>
        <td><input type="number" name="re_phone" min="0" required></td>
        <td>联系地址：</td>
        <td><input type="text" name="re_addr" required></td>
    </tr>
    <tr>
        <td>邮编：</td>
        <td><input type="number"  name="re_post" min="0" required></td>
        <td>电子邮箱：</td>
        <td><input type="text" name="re_email" required></td>
    </tr>
    <tr>
        <td>社会实践：(最大300字)</td>
        <td colspan="3"><textarea onKeyDown="if(value.length>300) value=value.substr(0,300)"   style="width:435px;height:150px;resize:none" name="re_sop"></textarea></td>
    </tr>
    <tr>
        <td>教育经历：(最大300字)</td>
        <td colspan="3"><textarea onKeyDown="if(value.length>300) value=value.substr(0,300)"   style="width:435px;height:150px;resize:none" name="re_edubg"></textarea></td>
    </tr>
    <tr>
        <td>个人简介：(最大300字)</td>
        <td colspan="3"><textarea onKeyDown="if(value.length>300) value=value.substr(0,300)"  style="width:435px;height:150px;resize:none" name="re_sel" ></textarea></td>
    </tr>
</table>
    <input type="submit" value="保存">
</form>
<h4 style="color: red">
    <%
        String str = (String) request.getAttribute("addresu");
        if (str!=null){
            out.print(str);
        }
    %>
</h4>
</body>
</html>
