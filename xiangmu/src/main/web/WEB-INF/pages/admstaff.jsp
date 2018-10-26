<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: WDB1
  Date: 2018/10/26
  Time: 9:03
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
<c:if test="${sessionScope.admstaffs.size()!=0}">
    <table border="1">
        <tr>
            <td>姓名</td>
            <td>性别</td>
            <td>年龄</td>
            <td>电话</td>
            <td>邮箱</td>
            <td>住址</td>
            <td>部门</td>
            <td>职位</td>
            <td>薪资</td>
            <td>入职时间</td>
            <td>换岗</td>
        </tr>
        <c:forEach items="${sessionScope.admstaffs}" var="i">
            <tr>
                <td><c:out value="${i.sf_name}"></c:out></td>
                <td><c:out value="${i.sf_sex}"></c:out></td>
                <td><c:out value="${i.sf_age}"></c:out></td>
                <td><c:out value="${i.sf_phone}"></c:out></td>
                <td><c:out value="${i.sf_mail}"></c:out></td>
                <td><c:out value="${i.sf_addr}"></c:out></td>
                <td><c:forEach items="${sessionScope.admindp}" var="dp">
                    <c:if test="${dp.dp_id==i.sf_dp_id}">
                        <c:out value="${dp.dp_department}"></c:out>
                    </c:if>
                </c:forEach></td>
                <td><c:forEach items="${sessionScope.adminjob}" var="job">
                    <c:if test="${job.job_id==i.sf_job_id}">
                        <c:out value="${job.job_name}"></c:out>
                    </c:if>
                </c:forEach></td>
                <td><c:out value="${i.sf_money}"></c:out></td>
                <td><c:out value="${i.sf_time}"></c:out></td>
                <td>
                    <form action="updatestaffjob">
                        <input type="hidden" name="sf_id" value="${i.sf_id}">
                        <input type="submit" value="换岗">
                    </form>
                </td>
            </tr>
        </c:forEach>
    </table>
    <c:if test="${sessionScope.totalPages!=0}">
        <c:forEach  var="t" begin="1" end="${sessionScope.totalPages}">
            <a href="pagingad?currentPage=${t}">${t}</a>
        </c:forEach>
    </c:if>
</c:if>
<c:if test="${sessionScope.admstaffs.size()==0}">
    <c:out value="暂时没有员工"></c:out>
</c:if>
</body>
</html>
