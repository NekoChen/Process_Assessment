<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 加法还没学
  Date: 2020/1/29
  Time: 18:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>查询所有的账户</h2>
    <c:forEach items="${list}" var="test_Account">
        ${test_Account.name}
    </c:forEach>
</body>
</html>
