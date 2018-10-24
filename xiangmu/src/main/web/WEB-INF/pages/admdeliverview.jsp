<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: WDB1
  Date: 2018/10/23
  Time: 10:18
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
<table border="1">
    <tr>
        <td><c:out value="${sessionScope.admad.ad_job}"></c:out></td>
        <td><c:out value="${sessionScope.admad.ad_money}"></c:out></td>
    </tr>
    <tr>
        <td colspan="2"><c:out value="${sessionScope.admad.ad_name}"></c:out></td>
    </tr>
    <tr>
        <td colspan="2"><c:out value="${sessionScope.admad.ad_welfare}"></c:out></td>
    </tr>
    <tr>
        <td><c:out value="${sessionScope.admad.ad_specworkplace}"></c:out></td>
    </tr>
    <tr>
        <td><h3>职位描述:</h3></td>
    </tr>
    <tr>
        <td>任职要求：<c:out value="${sessionScope.admad.ad_tenure}"></c:out><br/>
            岗位职责：<c:out value="${sessionScope.admad.ad_duty}"></c:out><br/>

        </td>
    </tr>
    <tr>
        <td><h3>公司描述:</h3></td>
    </tr>
    <tr>
        <td>
            公司名称：<c:out value="${sessionScope.admad.ad_company}"></c:out><br/>
            公司介绍：<c:out value="${sessionScope.admad.ad_compro}"></c:out><br/>
        </td>
    </tr>
</table>
<table cellspacing="0"  border="1">
    <tr>
        <td>姓名：</td>
        <td><c:out value="${sessionScope.admre.re_name}"/></td>
        <td>性别：</td>
        <td><c:out value="${sessionScope.admre.re_sex}"/></td>
    </tr>
    <tr>
        <td>年龄：</td>
        <td><c:out value="${sessionScope.admre.re_age}"/></td>
        <td>民族：</td>
        <td><c:out value="${sessionScope.admre.re_nation}"/></td>
    </tr>
    <tr>
        <td>籍贯：</td>
        <td><c:out value="${sessionScope.admre.re_hometown}"/></td>
        <td>婚姻状况：</td>
        <td><c:out value="${sessionScope.admre.re_marry}"/></td>
    </tr>
    <tr>
        <td>政治面貌：</td>
        <td><c:out value="${sessionScope.admre.re_polity}"/></td>
        <td>专业：</td>
        <td><c:out value="${sessionScope.admre.re_major}"/></td>
    </tr>
    <tr>
        <td>毕业学校：</td>
        <td colspan="3"><c:out value="${sessionScope.admre.re_school}"/></td>
    </tr>
    <tr>
        <td>联系电话：</td>
        <td><c:out value="${sessionScope.admree_phone}"/></td>
        <td>联系地址：</td>
        <td><c:out value="${sessionScope.admre.re_addr}"/></td>
    </tr>
    <tr>
        <td>邮编：</td>
        <td><c:out value="${sessionScope.admre.re_post}"/></td>
        <td>电子邮箱：</td>
        <td><c:out value="${sessionScope.admre.re_email}"/></td>
    </tr>
    <tr>
        <td>社会实践：</td>
        <td colspan="3"><c:out value="${sessionScope.admre.re_sop}"/></td>
    </tr>
    <tr>
        <td>教育经历：</td>
        <td colspan="3"><c:out value="${sessionScope.admre.re_edubg}"/></td>
    </tr>
    <tr>
        <td>个人简介：</td>
        <td colspan="3"><c:out value="${sessionScope.admre.re_sel}"/></td>
    </tr>
</table>
<form action="addinterview">
    <input type="submit" value="发送面试邀请">
</form>
</body>
</html>
