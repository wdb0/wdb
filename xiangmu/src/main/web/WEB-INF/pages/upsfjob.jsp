<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: WDB1
  Date: 2018/10/26
  Time: 15:52
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
            $("#department").change(function () {
                if($("#department").val()!="--请选择--") {
                    $.ajax({
                        url: "getjob",
                        type: "get",
                        data: {"dp_id": $("#department").val()},
                        dataType: "json",
                        success: function (jobs) {
                            document.getElementById("job").options.length = 0;
                            for (var i = 0; i < jobs.length; i++) {
                                var option = document.createElement("option");
                                option.text = jobs[i].job_name;
                                option.value = jobs[i].job_id;
                                document.getElementById("job").appendChild(option);
                            }
                        }
                    });
                }else{
                    document.getElementById("job").options.length = 0;
                    var option = document.createElement("option");
                    var a="--请选择--";
                    option.text = a ;
                    document.getElementById("job").appendChild(option);
                }
            });

            $("input[name='put']").click(function () {
                if($("#department").val()=="--请选择--"||$("#job").val()=="--请选择--"||$("#job").val()==""){
                    alert("请选择职位")
                }else{
                    $.ajax({
                        url: "upstaffjob",
                        type: "get",
                        data: {"dp_id": $("#department").val(),"job_id":$("#job").val()},
                        success: function (obj) {
                            if(obj=="成功"){
                                window.location.href="pagingstaff?currentPage=1"
                            }else{
                                alert("失败")
                            }
                        }
                    });
                }
            })
        })
    </script>
</head>
<body>
    <select name="department" id="department">
        <option>--请选择--</option>
        <c:forEach items="${sessionScope.dp}" var="i">
            <option value="${i.dp_id}">${i.dp_department}</option>
        </c:forEach>
    </select>
    职位：<select name="job" id="job">
    <option>--请选择--</option>
</select>
    <input name="put" type="button" value="更改">
</body>
</html>
