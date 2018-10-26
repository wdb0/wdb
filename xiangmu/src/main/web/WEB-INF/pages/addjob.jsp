<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: WDB1
  Date: 2018/10/25
  Time: 16:31
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
    <script src="js/jquery-3.2.1.js"></script>
    <script>
        $(function () {
            $("input[name='put']").click(function () {
                $.ajax({
                    type: "get",
                    url: "adjob",
                    data: {"dp_id": $("#department").val(), "job_name": $("input[name='job']").val()},
                    success: function (obj) {
                        alert(obj)
                    }
                })
            })
        })
    </script>
</head>
<body>
    请选择部门：
    <select name="department" id="department">
        <option>--请选择--</option>
        <c:forEach items="${sessionScope.depts}" var="i">
        <option value="${i.dp_id}">${i.dp_department}</option>
        </c:forEach>
        请输入职位名称：<input type="text" name="job" required>
        <input type="button" name="put" value="添加">
</body>
</html>
