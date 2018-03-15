package game;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PaperRockScissors
 */
@WebServlet("/game/start")
public class PaperRockScissors extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
    public PaperRockScissors() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd = request.getRequestDispatcher("start.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int player = Integer.parseInt(request.getParameter("theGame"));
		Random g = new Random();
		int si = g.nextInt(3);
		
		if(player==si) {
			RequestDispatcher rd = request.getRequestDispatcher("game01.jsp");
			rd.forward(request, response);
		}
		else if((player+1)%3==si) {
			RequestDispatcher rd = request.getRequestDispatcher("gamel01.jsp");
			rd.forward(request, response);
		}
		else {
			RequestDispatcher rd = request.getRequestDispatcher("gamew01.jsp");
			rd.forward(request, response);
		}
	}

}
