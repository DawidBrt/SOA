package hotel;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Vector;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GuestListServlet
 */
@WebServlet("/hotel/guest")
public class GuestListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private Vector<Review> review = new Vector<Review>();
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GuestListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//LoginBean bean = (LoginBean)request.getAttribute("bean");
		//System.out.println(bean.getName());
		
		response.setContentType("text/html");
	    PrintWriter out = response.getWriter();
	    out.println("<title>Reviews</title>");
	    out.println("<h2>Please submit your feedback:</h2><br>");
	    out.println("<form action=\"guest\" method=\"post\">  \n" + 
    			"    Your name:<input type=\"text\" name=\"name\"><br>  \n" + 
    			"    Your email:<input type=\"text\" name=\"email\"><br>  \n" + 
    			"    Comment:<input type=\"text\" name=\"comment\"><br>  \n" + 
    		    "    <input type=\"submit\" value=\"Send Feedback\">  \n" + 
    		    "    </form>");
	    out.println("_______________________________________________________________________________<br>");
	    Enumeration<Review> reviewEnum = review.elements();
	    while(reviewEnum.hasMoreElements()) {
	    	Review review = reviewEnum.nextElement();
	    	out.println("<h2>"+review.getName()+"</h2>("+review.getEmail()+") says<br>"+
	    	"      "+review.getComment()+"<br>");
	    }
    	out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

	    //PrintWriter out = response.getWriter();
		response.setContentType("text/html");
	    String name=request.getParameter("name");
	    String email=request.getParameter("email");
	    String comment=request.getParameter("comment");
	    if(name.isEmpty() || (email.isEmpty() || comment.isEmpty())) {
	    	doGet(request,response);
	    }
	    else {
	    	review.add(new Review(name, email, comment));
	    	doGet(request, response);
	    }
	}

}
