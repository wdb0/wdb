<%--
  Created by IntelliJ IDEA.
  User: WDB1
  Date: 2018/10/24
  Time: 14:04
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
<form action="addada">
<table border="1">
    <tr>
        <td>招聘工作:<input type="text" name="ad_job" required></td>
        <td>薪资：<input type="text" name="ad_money" required></td>
    </tr>
    <tr>
        <td>招聘标题：<input type="text" name="ad_name" required></td>
        <td>部门：<input type="text" name="ad_department" required></td>
    </tr>
    <tr>
        <td colspan="2">
            工作福利：<textarea onKeyDown="if(value.length>300) value=value.substr(0,300)"   style="width:435px;height:150px;resize:none" name="ad_welfare" required></textarea>
        </td>
    </tr>
    <tr>
        <td>详细工作地点:<input type="text" name="ad_specworkpalce" required></td>
        <td>工作地点：<input type="text" name="ad_workplace"></td>
    </tr>
    <tr>
        <td>任职要求：
            <textarea onKeyDown="if(value.length>300) value=value.substr(0,300)"   style="width:435px;height:150px;resize:none" name="ad_tenure" required></textarea><br/>
            岗位职责：
            <textarea onKeyDown="if(value.length>300) value=value.substr(0,300)"   style="width:435px;height:150px;resize:none" name="ad_duty" required></textarea><br/>
        </td>
    </tr>
    <tr>
        <td>
            公司名称：
            <input type="text" name="ad_company" required>
            公司介绍：
            <textarea onKeyDown="if(value.length>300) value=value.substr(0,300)"   style="width:435px;height:150px;resize:none" name="ad_compro" required></textarea><br/>
        </td>
    </tr>
</table>
<input type="submit" value="修改">
</form>
</body>
</html>
