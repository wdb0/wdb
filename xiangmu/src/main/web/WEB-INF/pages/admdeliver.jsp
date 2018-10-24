<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: WDB1
  Date: 2018/10/23
  Time: 9:56
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
<c:if test="${sessionScope.admdelivers.size()!=0}">
    <c:forEach items="${sessionScope.admdelivers}" var="i">
        <form action="admdeview">
            <input type="hidden" name="admde_id" value="${i.de_id}">
        <c:forEach items="${sessionScope.admads}" var="ad">
            <c:if test="${i.de_ad_id==ad.ad_id}">
                招聘信息：<c:out value="${ad.ad_name}"></c:out><br/>
                公司名称：<c:out value="${ad.ad_company}"></c:out>
                <input type="hidden" name="admad_id" value="${ad.ad_id}">
            </c:if>
        </c:forEach>
        <h4>投递简历的信息</h4>
            <c:if test="${i.de_state==0}">
                <c:out value="未查看"></c:out>
            </c:if>
            <c:if test="${i.de_state>0}">
                <c:out value="已查看"></c:out>
            </c:if>
        <c:forEach items="${sessionScope.admresumes}" var="res">
            <c:if test="${i.de_user_id==res.re_user_id}">
               名字： <c:out value="${res.re_name}"></c:out><br/>
                性别:<c:out value="${res.re_sex}"></c:out><br/>
                年龄:<c:out value="${res.re_age}"></c:out><br/>
                所学专业:<c:out value="${res.re_major}"></c:out><br/>
                毕业学校:<c:out value="${res.re_school}"></c:out>
                <input type="hidden" name="admre_id" value="${res.re_id}">
            </c:if>
        </c:forEach>
            <input type="submit" value="查看详情">
        </form>
    </c:forEach>
    <c:if test="${sessionScope.totalPages!=0}">
        <c:forEach  var="t" begin="1" end="${sessionScope.totalPages}">
            <a href="pagingadmdeliver?currentPage=${t}">${t}</a>
        </c:forEach>
    </c:if>
</c:if>
</body>
</html>
