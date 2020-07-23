
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--         Logic for checking username/password --%>
<c:choose>
<%--    entering admin as username and codeup as password will redirect to profile page--%>
    <c:when test="${param.username.equalsIgnoreCase('admin') && param.password.equalsIgnoreCase('codeup')}">
        <% response.sendRedirect("profile.jsp"); %>
    </c:when>
</c:choose>
<html>
<head>
    <title>
        <% request.setAttribute("title", "Login"); %>
        <%@ include file="head.jsp" %>
    </title>
</head>
<body>
<%@ include file="navbar.jsp" %>
<h1>Please Login.</h1>
<%-- Login Form for /login.jsp --%>
<form action="login.jsp" method="POST" >
    <label for="username">Username</label>
    <input type="text" id="username" name="username">
    <br>
    <br>
    <label for="password">Password</label>
    <input id="password" name="password" type="password">
    <br>
    <br>
    <button type="submit">Login</button>
</form>
<hr>
</body>
</html>