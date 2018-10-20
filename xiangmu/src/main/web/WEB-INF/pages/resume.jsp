<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: WDB1
  Date: 2018/10/19
  Time: 14:42
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
<table cellspacing="0"  border="1">
    <tr>
        <td>姓名：</td>
        <td><c:out value="${sessionScope.resume.re_name}"/></td>
        <td>性别：</td>
        <td><c:out value="${sessionScope.resume.re_sex}"/></td>
    </tr>
    <tr>
        <td>年龄：</td>
        <td><c:out value="${sessionScope.resume.re_age}"/></td>
        <td>民族：</td>
        <td><c:out value="${sessionScope.resume.re_nation}"/></td>
    </tr>
    <tr>
        <td>籍贯：</td>
        <td><c:out value="${sessionScope.resume.re_hometown}"/></td>
        <td>婚姻状况：</td>
        <td><c:out value="${sessionScope.resume.re_marry}"/></td>
    </tr>
    <tr>
        <td>政治面貌：</td>
        <td><c:out value="${sessionScope.resume.re_polity}"/></td>
        <td>专业：</td>
        <td><c:out value="${sessionScope.resume.re_major}"/></td>
    </tr>
    <tr>
        <td>毕业学校：</td>
        <td colspan="3"><c:out value="${sessionScope.resume.re_school}"/></td>
    </tr>
    <tr>
        <td>联系电话：</td>
        <td><c:out value="${sessionScope.resume.re_phone}"/></td>
        <td>联系地址：</td>
        <td><c:out value="${sessionScope.resume.re_addr}"/></td>
    </tr>
    <tr>
        <td>邮编：</td>
        <td><c:out value="${sessionScope.resume.re_post}"/></td>
        <td>电子邮箱：</td>
        <td><c:out value="${sessionScope.resume.re_email}"/></td>
    </tr>
    <tr>
        <td>社会实践：</td>
        <td colspan="3"><c:out value="${sessionScope.resume.re_sop}"/></td>
    </tr>
    <tr>
        <td>教育经历：</td>
        <td colspan="3"><c:out value="${sessionScope.resume.re_edubg}"/></td>
    </tr>
    <tr>
        <td>个人简介：</td>
        <td colspan="3"><c:out value="${sessionScope.resume.re_sel}"/></td>
    </tr>
</table>
</body>
</html>
