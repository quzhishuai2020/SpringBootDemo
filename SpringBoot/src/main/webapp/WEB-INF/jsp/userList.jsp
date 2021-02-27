<%--
  Created by IntelliJ IDEA.
  User: 屈智帅
  Date: 2021/2/26
  Time: 21:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>用户列表</title>
</head>
<body>
<table border="1" align="center" width="50%">
    <tr>
        <th>用户id</th>
        <th>用户姓名</th>
        <th>用户年龄</th>
    </tr>
    <c:forEach items="${list}" var="user">
        <tr>
            <td>${user.userId}</td>
            <td>${user.userName}</td>
            <td>${user.age}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
