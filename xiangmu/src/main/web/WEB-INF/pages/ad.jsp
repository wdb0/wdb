<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: WDB1
  Date: 2018/10/19
  Time: 10:09
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
<c:out value="${sessionScope.u.user_name}"></c:out>
<c:if test="${sessionScope.ivnum!=0}">
    <a href="pagingnewinterview?currentPage=1"> <input type="button" value="你有${sessionScope.ivnum}条新面试邀请"></a>
</c:if>
<c:if test="${sessionScope.ivnum==0}">
    <a href="paginginterview?currentPage=1"><input type="button" value="查看全部面试邀请"></a>
</c:if>
<c:if test="${sessionScope.ofnum!=0}">
    <a href="pagingnewoffer?currentPage=1"><input type="button" value="你有${sessionScope.ofnum}个新offer"></a>
</c:if>
<c:if test="${sessionScope.ofnum==0}">
    <a href="pagingoffer?currentPage=1"><input type="button" value="查看全部offer"></a>
</c:if>
<form action="showresume">
    <input type="submit" value="查看个人简历">
</form>
    <a href="pagingdeliver?currentPage=1"> <input type="button" value="查看已投简历"></a>
<c:if test="${sessionScope.ads.size()!=0}">
    <table>
        <p>目前已有的招聘信息</p>
        <c:forEach items="${sessionScope.ads}" var="i">
            <tr>
                <td><c:out value="${i.ad_workplace}|${i.ad_name}"></c:out></td>
                <td><c:out value="${i.ad_company}"></c:out></td>
                <td>
                    <form action="viewad">
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
        </c:forEach>
    </table>
    <c:if test="${sessionScope.totalPages!=0}">
        <c:forEach  var="t" begin="1" end="${sessionScope.totalPages}">
            <a href="pagingad?currentPage=${t}">${t}</a>
        </c:forEach>
    </c:if>
</c:if>
<c:if test="${sessionScope.ads.size()==0}">
    <c:out value="暂无招聘信息,请过段时间来查看"></c:out>
    <img src="https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1540027853283&di=8ab9c4913c632644593d0ac3e034ca08&imgtype=0&src=http%3A%2F%2Fb.hiphotos.baidu.com%2Fimage%2Fpic%2Fitem%2F18d8bc3eb13533fa83db056ca3d3fd1f41345b06.jpg">
</c:if>
</body>
</html>
