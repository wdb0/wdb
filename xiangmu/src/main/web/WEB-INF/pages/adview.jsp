<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: WDB1
  Date: 2018/10/20
  Time: 15:51
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
<form action="adddeliver">
    <table border="1">
        <tr>
            <td><c:out value="${sessionScope.ad.ad_job}"></c:out></td>
            <td><c:out value="${sessionScope.ad.ad_money}"></c:out></td>
        </tr>
        <tr>
            <td colspan="2"><c:out value="${sessionScope.ad.ad_name}"></c:out></td>
        </tr>
        <tr>
            <td colspan="2"><c:out value="${sessionScope.ad.ad_welfare}"></c:out></td>
        </tr>
        <tr>
            <td><c:out value="${sessionScope.ad.ad_specworkplace}"></c:out></td>
        </tr>
        <tr>
            <td><h3>职位描述:</h3></td>
        </tr>
        <tr>
            <td>任职要求：<c:out value="${sessionScope.ad.ad_tenure}"></c:out><br/>
                岗位职责：<c:out value="${sessionScope.ad.ad_duty}"></c:out><br/>

            </td>
        </tr>
        <tr>
            <td><h3>公司描述:</h3></td>
        </tr>
        <tr>
            <td>
                公司名称：<c:out value="${sessionScope.ad.ad_company}"></c:out><br/>
                公司介绍：<c:out value="${sessionScope.ad.ad_compro}"></c:out><br/>
            </td>
        </tr>
    </table>
    <input type="hidden" name="ad_id" value="${sessionScope.ad.ad_id}">
    <input type="submit" value="申请">
</form>
<h4 style="color: red">
    <%
        String str = (String) request.getAttribute("updeliver");
        if (str!=null){
            out.print(str);
        }
    %>
</h4>
</body>
</html>
