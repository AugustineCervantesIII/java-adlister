
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Login Demo</title>
</head>
<body>
<form action="student-response.jsp">

First Name: <label>
    <input type="text" name="firstName"/>
</label>
<br>
<br>
Last Name: <label>
    <input type="text" name="lastName"/>
</label>
    <br>
    <br>
    <select name="country">
        <option>Canada</option>
        <option>United States</option>
        <option>South America</option>
        <option>United Kingdom</option>
        <option>Europe</option>
        <option>Russia</option>
        <option>China</option>
        <option>Africa</option>
        <option>Australia</option>
    </select>
<br>
<br>
<input type="submit" value="Submit"/>
</form>
</body>
</html>
