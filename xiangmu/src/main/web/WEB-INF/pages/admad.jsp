<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: WDB1
  Date: 2018/10/24
  Time: 14:47
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
<c:if test="${sessionScope.admada.size()!=0}">
    <c:forEach items="${sessionScope.admada}" var="i">
        <table>
            <tr>
                <td><c:out value="${i.ad_workplace}|${i.ad_name}"></c:out></td>
                <td><c:out value="${i.ad_company}"></c:out></td>
                <td>
                    <form action="admadview">
                        <input type="hidden" name="adid" value="${i.ad_id}">
                        <input type="submit" value="查看详情">
                    </form>
                </td>
            </tr>
            <tr>
                <td colspan="2"><c:out value="${i.ad_money}"></c:out></td>
            </tr>
            <tr>
                <td colspan="2"><c:out value="${id.ad_welfare}"></c:out></td>
            </tr>
            <tr>
                <td>
                    <c:if test="${i.ad_state==0}">
                        <form action="putad">
                            <input type="hidden" name="adid" value="${i.ad_id}">
                            <input type="submit" value="发布">
                        </form>
                    </c:if>
                    <c:if test="${i.ad_state==1}">
                        <form action="putad">
                            <input type="hidden" name="adid" value="${i.ad_id}">
                            <input type="submit" value="撤回">
                        </form>
                    </c:if>
                </td>
            </tr>
        </table>
    </c:forEach>
    <c:if test="${sessionScope.totalPages!=0}">
        <c:forEach  var="t" begin="1" end="${sessionScope.totalPages}">
            <a href="pagingadmad?currentPage=${t}">${t}</a>
        </c:forEach>
    </c:if>
</c:if>
</body>
</html>
