

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AvgNumbers
 */
@WebServlet("/avg")
public class AvgNumbers extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AvgNumbers() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("avg.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//ArrayList<String> numbers = new ArrayList<String>(request.getParameterMap().keySet());
		ArrayList<Double> numbers = new ArrayList<>();
		Enumeration<String> en = request.getParameterNames();
		try {
			while(en.hasMoreElements()) {
				numbers.add(Double.parseDouble(request.getParameter(en.nextElement())));
			}
			double avg = 0;
		    for(Double nr: numbers) {
		    	avg+=nr;
		    }
		    avg/=numbers.size();
			PrintWriter out = response.getWriter();
	        out.println("Average of all numbers is: " + avg);
	        out.close();
		} catch (NumberFormatException e) {
			PrintWriter out = response.getWriter();
	        out.println("Error: some data are not numbers");
	        out.close();
		}
		
	}

}
