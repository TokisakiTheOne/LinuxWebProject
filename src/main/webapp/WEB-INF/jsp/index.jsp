<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: YanYuHang
  Date: 2019/12/13
  Time: 10:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<table class="table">
    <tbody>
    <tr>
        <td>学生编号</td>
        <td>学生姓名</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${list}" var="stu">
        <tr>
            <td>${stu.stuId}</td>
            <td>${stu.stuName}</td>
            <td></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
