package car;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CarChoiceServlet
 */
@WebServlet("/car/carchoice")
public class CarChoiceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CarChoiceServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("carchoice.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int from, to;
		PrintWriter out = response.getWriter();
		try {
			from = Integer.parseInt(request.getParameter("from"));
		} catch(NumberFormatException e) {
			from = 0;
		}
		try {
			to = Integer.parseInt(request.getParameter("from"));
		} catch(NumberFormatException e) {
			to = 100000000;
		}
		String car = request.getParameter("car");
		CarChoiceHelper x = new CarChoiceHelper();
		
        out.println("Cars for you:\n" + x.getCars(car, from, to));
        out.close();
		
	}

}
