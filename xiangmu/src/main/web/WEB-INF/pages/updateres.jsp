<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: WDB1
  Date: 2018/10/20
  Time: 9:33
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
<form action="updatere">
<table cellspacing="0"  border="1">
    <tr>
        <td>姓名：</td>
        <td><input type="text" name="re_name" value="${sessionScope.resume.re_name}" required/></td>
        <td>性别：</td>
        <td><input type="text" name="re_sex" value="${sessionScope.resume.re_sex}" required/></td>
    </tr>
    <tr>
        <td>年龄：</td>
        <td><input type="number" name="re_age" value="${sessionScope.resume.re_age}" required/></td>
        <td>民族：</td>
        <td><input type="text" name="re_nation" value="${sessionScope.resume.re_nation}" required/></td>
    </tr>
    <tr>
        <td>籍贯：</td>
        <td><input type="text" name="re_hometown" value="${sessionScope.resume.re_hometown}" required/></td>
        <td>婚姻状况：</td>
        <td><input type="text" name="re_marry" value="${sessionScope.resume.re_marry}" required/></td>
    </tr>
    <tr>
        <td>政治面貌：</td>
        <td><input type="text" name="re_polity" value="${sessionScope.resume.re_polity}" required/></td>
        <td>专业：</td>
        <td><input type="text" name="re_major" value="${sessionScope.resume.re_major}" required/></td>
    </tr>
    <tr>
        <td>毕业学校：</td>
        <td colspan="3"><input style="width:435px" type="text" name="re_school" value="${sessionScope.resume.re_school}" required/></td>
    </tr>
    <tr>
        <td>联系电话：</td>
        <td><input type="number" name="re_phone" min="0" value="${sessionScope.resume.re_phone}" required/></td>
        <td>联系地址：</td>
        <td><input type="text" name="re_addr" value="${sessionScope.resume.re_addr}" required/></td>
    </tr>
    <tr>
        <td>邮编：</td>
        <td><input type="number"  name="re_post" min="0" value="${sessionScope.resume.re_post}" required/></td>
        <td>电子邮箱：</td>
        <td><input type="text" name="re_email" value="${sessionScope.resume.re_email}" required/></td>
    </tr>
    <tr>
        <td>社会实践：(最大300字)</td>
        <td colspan="3"><textarea onKeyDown="if(value.length>300) value=value.substr(0,300)"   style="width:435px;height:150px;resize:none" name="re_sop" ><c:out value="${sessionScope.resume.re_sop}"/></textarea></td>
    </tr>
    <tr>
        <td>教育经历：(最大300字)</td>
        <td colspan="3"><textarea onKeyDown="if(value.length>300) value=value.substr(0,300)"   style="width:435px;height:150px;resize:none" name="re_edubg" ><c:out value="${sessionScope.resume.re_edubg}"/></textarea></td>
    </tr>
    <tr>
        <td>个人简介：(最大300字)</td>
        <td colspan="3"><textarea onKeyDown="if(value.length>300) value=value.substr(0,300)"  style="width:435px;height:150px;resize:none" name="re_sel" ><c:out value="${sessionScope.resume.re_sel}"/></textarea></td>
    </tr>
</table>
    <input type="submit" value="修改">
</form>
<h4 style="color: red">
    <%
        String str = (String) request.getAttribute("upresu");
        if (str!=null){
            out.print(str);
        }
    %>
</h4>
</body>
</html>
