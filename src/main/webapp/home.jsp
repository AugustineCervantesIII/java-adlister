<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<% String firstname = request.getParameter("firstname"); %>--%>
<%! String firstname = "Augustine"; %>
<%! String lastname = "Cervantes"; %>
<%--<%! int myNumber = 1; %>--%>
<%--<%--%>
<%--    if(firstname.equals("augustine")){--%>
<%--        response.sendRedirect("/index.jsp");--%>
<%--    }--%>
<%--%>--%>
<html>
<head>
    <title>Home Page</title>
</head>
<body>
<%= new java.util.Date() %>
    <%@ include file="partials/navbar.jsp"%>
<%@ include file="partials/login.jsp" %>
    <h1>Hello, <%= firstname + " " + lastname%></h1>
    <%@ include file="partials/aboutme.jsp"%>
<%@ include file="partials/profile.jsp" %>
<%--    <%@ inlcude file="partials/login.jsp"%>--%>
    <%@ include file="partials/footer.jsp"%>
    <%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <!doctype html>
    <html>
    <head>
        <title>Implicit Object Example</title>
    </head>
    <body>
    <h1>Welcome To The Site!</h1>
    <p>Path: <%= request.getRequestURL() %></p>
    <p>Query String: <%= request.getQueryString() %></p>
    <p>"name" parameter: <%= request.getParameter("name") %></p>
    <p>"method" attribute: <%= request.getMethod() %></p>
    <p>User-Agent header: <%= request.getHeader("user-agent") %></p>
    </body>
    </html>
</body>
</html>