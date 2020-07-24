package JspPracticePackage;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "/loginwithservlet", urlPatterns = "/loginwithservlet")
public class loginwithservlet extends HttpServlet {

//doget is good for debugging, bookmarking or email url and limitations on data length, grabs the get information to show in the browser with logic from the servlet
    //dopost cant bookmark or email url, no limitations on data length can also send binary data, posts the information to the browser with the logic from the servlet for forms
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("user logged in: "
                + request.getParameter("firstName")
                + " "
                + request.getParameter("lastName"));
        out.println("</body></html>");
    }
}

