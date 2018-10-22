<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: WDB1
  Date: 2018/10/22
  Time: 16:20
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
<c:if test="${sessionScope.delivers.size()!=0}">
    <c:forEach items="${sessionScope.delivers}" var="i">
        <c:out value="adid:${i.de_ad_id}"></c:out><br/>
        <c:out value="user_id:${i.de_user_id}"></c:out>
        <form action="showdeliver" >
            <input type="hidden" name="deliverid" value="${i.de_id}">
            <input type="submit" value="查看详情">
        </form>
    </c:forEach>
    <c:if test="${sessionScope.totalPages!=0}">
        <c:forEach  var="t" begin="1" end="${sessionScope.totalPages}">
            <a href="pagingad?currentPage=${t}">${t}</a>
        </c:forEach>
    </c:if>
</c:if>
<c:if test="${sessionScope.delivers.size==0}">
    <c:out value="您暂时还未投递简历"></c:out>
    <form action="pagingad?currentPage=1">
        <input type="submit" value="立即查看招聘信息">
    </form>
</c:if>
</body>
</html>
