import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/woman")
public class CzyKobieta extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if(request.getParameter("name") != null && request.getParameter("age") != null) {
            String name = request.getParameter("name");
            int age = Integer.parseInt(request.getParameter("age"));
            PrintWriter out = response.getWriter();
            if (name.charAt(name.length() - 1) == 'a' && age >= 18) {
                out.println(name + " jest dorosla kobieta");
                out.close();
            } else {
                out.println(name + " nie jest dorosla kobieta");
                out.close();
            }
        }
    }
}