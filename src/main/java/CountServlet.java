import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CountServlet", urlPatterns = "/count")
public class CountServlet extends HttpServlet {
    private int counter = 0;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        counter += 1;
        resp.getWriter().println("<h3>Number of times this page has been viewed " + counter + "</h3>");
        PrintWriter out = resp.getWriter();

        String name = req.getParameter("name");

        if(name == null){
            name = "World";
        }
        out.println("<h1>Hello " + name + "!</h1>");
    }
}