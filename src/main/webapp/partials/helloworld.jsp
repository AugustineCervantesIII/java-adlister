<%--
  Created by IntelliJ IDEA.
  User: augustinecervantes
  Date: 7/16/20
  Time: 4:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="JspPracticePackage.PracticeUtils" %>
<html>
<head>
    <title>Practicing</title>
</head>
<body>
<h3>Hello World</h3>
<%= new java.util.Date() %>
<br>
<br>
<p>This is a practice file for jsp and jstl. JSP stands for java server pages. JSTL stands for JSP standard tag library.</p>
<p>Java servlet pages allow us to create html pages with dynamic content by mixing java code into our html.</p>
<p>Jsp standard tag library has the ability to create custom tags</p>
<br>
<p>Converting a string to an uppercase: <%= new String("Augustine").toUpperCase() %></p>
<p>25 multiplied by 4 equals <%= 25*4 %></p>
<p>is 75 less than 69 <%= 75 < 69 %></p>
<%!
    String makeItLower(String data){
        return data.toLowerCase();
    }
%>
lower case "Hello World": <%= makeItLower("Hello World")%>
<br>
<br>
<%= PracticeUtils.makeItLowerCase("This is calling the makeitlower method inside of the java file from the package.")%>

<br>
<%
    for (int i = 1; i <= 5; i++){
        out.println("<br/>this is a for loop: " + i);
    }
%>
</body>
</html>
