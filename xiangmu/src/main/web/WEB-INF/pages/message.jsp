<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: WDB1
  Date: 2018/10/23
  Time: 22:31
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
<c:if test="${sessionScope.interviews.size()!=0}">
    <c:forEach items="${sessionScope.interviews}" var="i">
            <c:out value="${i.iv_view}"></c:out>
            面试时间：<c:out value="${i.iv_time}"></c:out>
    </c:forEach>
    <c:if test="${sessionScope.totalPages!=0}">
        <c:forEach  var="t" begin="1" end="${sessionScope.totalPages}">
            <a href="pagingad?currentPage=${t}">${t}</a>
        </c:forEach>
    </c:if>
</c:if>
</body>
</html>
