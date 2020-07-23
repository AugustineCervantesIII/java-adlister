<%--
  Created by IntelliJ IDEA.
  User: augustinecervantes
  Date: 7/22/20
  Time: 5:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login with Servlet</title>
</head>
<body>
<%--action=".file" not needed--%>
<form action="loginwithservlet" method="GET">
    First name: <input type="text" name="firstName"/>
    <br>
    <br>
    Last name: <input type="text" name="lastName"/>
    <br>
    <br>
    <input type="submit" value="Login"/>
</form>
</body>
</html>
