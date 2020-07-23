package JspPracticePackage;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


//webservelt override with the name and the url to view the page in the browser
@WebServlet(name = "PracticeServlet", urlPatterns = "/practice/servlet")
//extends the httpservlet to define the methods doGet and doPost
public class PracticeServlet extends HttpServlet {

    //doGet gets the request and the response parameters
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //set the content type text/html
        response.setContentType("text/html");
        //to send data back to the browser
        PrintWriter out = response.getWriter();
        //generate content
        out.println("<html><body>");
        out.println("<h2>Practice page");
        out.println("<hr>");
        out.println("time: " + new java.util.Date());
        out.println("</h2></body></html>");
    }

}
