<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Calendar" %>
<%@ page import="java.util.GregorianCalendar" %><%--
  Created by IntelliJ IDEA.
  User: WDB1
  Date: 2018/10/23
  Time: 20:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    Date now = new Date();
    Calendar c = Calendar.getInstance();
    c.setTime(now);
    c.add(Calendar.DAY_OF_MONTH, 1);
    now=c.getTime();
    String date= format.format(now);
    SimpleDateFormat format1 = new SimpleDateFormat("HH:mm");
    String date1= format1.format(new Date());
    String date2=date+"T"+date1;
%>
<html>
<head>
    <base href="<%=basePath%>"/>
    <title>Title</title>
    <script src="js/jquery-3.2.1.js"></script>
</head>
<body>
<form action="addiv">
    内容：<textarea onKeyDown="if(value.length>300) value=value.substr(0,300)"   style="width:435px;height:150px;resize:none" name="view" required></textarea><br/>
    时间：<input type="datetime-local" min="<%=date2%>" name="time"  required>
    <input type="submit" value="发送">
</form>
</body>
</html>
