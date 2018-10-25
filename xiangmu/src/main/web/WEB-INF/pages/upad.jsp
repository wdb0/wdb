<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: WDB1
  Date: 2018/10/25
  Time: 9:16
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
<form action="updatead">
    <table border="1">
        <tr>
            <td>招聘工作:<input type="text" name="ad_job" value="${sessionScope.adminad.ad_job}" required></td>
            <td>薪资：<input type="text" name="ad_money" value="${sessionScope.adminad.ad_money}" required></td>
        </tr>
        <tr>
            <td>招聘标题：<input type="text" name="ad_name" value="${sessionScope.adminad.ad_name}" required></td>
            <td>部门：<input type="text" name="ad_department"value="${sessionScope.adminad.ad_department}" required></td>
        </tr>
        <tr>
            <td colspan="2">
                工作福利：<textarea onKeyDown="if(value.length>300)  value=value.substr(0,300)" style="width:435px;height:150px;resize:none" name="ad_welfare" required><c:out value="${sessionScope.adminad.ad_welfare}"></c:out> </textarea>
            </td>
        </tr>
        <tr>
            <td>详细工作地点:<input type="text" name="ad_specworkplace" value="${sessionScope.adminad.ad_specworkplace}" required></td>
            <td>工作地点：<input type="text" name="ad_workplace" value="${sessionScope.adminad.ad_workplace}" ></td>
        </tr>
        <tr>
            <td>任职要求：
                <textarea onKeyDown="if(value.length>300) value=value.substr(0,300)"   style="width:435px;height:150px;resize:none" name="ad_tenure"  required> <c:out value="${sessionScope.adminad.ad_tenure}"></c:out></textarea><br/>
                岗位职责：
                <textarea onKeyDown="if(value.length>300) value=value.substr(0,300)"   style="width:435px;height:150px;resize:none" name="ad_duty" required><c:out value="${sessionScope.adminad.ad_duty}"></c:out></textarea><br/>
            </td>
        </tr>
        <tr>
            <td>
                公司名称：
                <input type="text" name="ad_company" value="${sessionScope.adminad.ad_company}" required>
                公司介绍：
                <textarea onKeyDown="if(value.length>300) value=value.substr(0,300)"   style="width:435px;height:150px;resize:none" name="ad_compro" required><c:out value="${sessionScope.adminad.ad_compro}"></c:out></textarea><br/>
            </td>
        </tr>
    </table>
    <input type="submit" value="修改">
</form>
</body>
</html>
