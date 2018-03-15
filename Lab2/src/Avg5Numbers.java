import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/avg")
public class Avg5Numbers extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int n1 = Integer.parseInt(request.getParameter("1"));
        int n2 = Integer.parseInt(request.getParameter("2"));
        int n3 = Integer.parseInt(request.getParameter("3"));
        int n4 = Integer.parseInt(request.getParameter("4"));
        int n5 = Integer.parseInt(request.getParameter("5"));
        int avg = (n1+n2+n3+n4+n5)/5;
        PrintWriter out = response.getWriter();
        out.println("Srednia: "+avg);
        out.close();
    }
}