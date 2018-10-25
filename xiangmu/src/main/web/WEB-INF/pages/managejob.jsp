<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: WDB1
  Date: 2018/10/25
  Time: 15:05
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
<a href=""><input type="button" value="增加部门"></a>
<a href=""><input type="button" value="增加职位"></a>
<table border="1">
    <tr>
        <td>部门</td>
        <td>职位</td>
        <td>员工人数</td>
        <td>管理</td>
    </tr>
    <c:forEach items="${sessionScope.jbs}" var="i">
        <c:forEach items="${sessionScope.deps}" var="dp">
            <c:if test="${dp.dp_id==i.job_dp_id}">
                <tr>
                    <td>
                        <c:out value="${dp.dp_department}"></c:out>
                    </td>
                    <td>
                        <c:out value="${i.job_name}"></c:out>
                    </td>
                    <td>
                        <c:out value="${i.job_num}"></c:out>
                    </td>
                    <td>
                        <form action="deljob">
                            <input type="hidden" name="jobid" value="${i.job_id}">
                            <input type="submit" value="删除">
                        </form>
                    </td>
                </tr>
            </c:if>
        </c:forEach>
    </c:forEach>
</table>
</body>
</html>
