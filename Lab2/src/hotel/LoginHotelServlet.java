package hotel;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginHotel
 */
@WebServlet("/hotel/login")
public class LoginHotelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginHotelServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
	    PrintWriter out = response.getWriter();
	    out.println("<title>Login</title>");
	    try{
	    	String error = request.getParameter("er");
	    	if(error!=null) {
		    	switch(error) {
				    case "aeio":
				    	out.println("<form action=\"login\" method=\"post\">  \n" + 
				    			"    Login:<input type=\"text\" name=\"login\">   ~ Prosze podac imie<br>  \n" + 
				    			"    Password:<input type=\"password\" name=\"password\"><br>  \n" + 
				    		    "    <input type=\"submit\" value=\"login\">  \n" + 
				    		    "    </form>");
				    	out.close();
				    	break;
				    case "eioa":
				    	out.println("<form action=\"login\" method=\"post\">  \n" + 
		    		    		"    Login:<input type=\"text\" name=\"login\"><br>  \n" + 
		    		    		"    Password:<input type=\"password\" name=\"password\">   ~ Prosze podac haslo<br>  \n" + 
		    		    		"    <input type=\"submit\" value=\"login\">  \n" + 
		    		    		"    </form>");
		    		    out.close();
		    		    break;
				    case "oaie":
				    	out.println("<form action=\"login\" method=\"post\">  \n" + 
		    		    		"    Login:<input type=\"text\" name=\"login\"><br>  \n" + 
		    		    		"    Password:<input type=\"password\" name=\"password\"><br>  \n" + 
		    		    		"    Bledne dane<br>  \n" + 
		    		    		"    <input type=\"submit\" value=\"login\">  \n" + 
		    		    		"    </form>");
		    		    out.close();
		    		    break;
				    default:
				    	out.println("<form action=\"login\" method=\"post\">  \n" + 
					    		"    Login:<input type=\"text\" name=\"login\"><br>  \n" + 
					    		"    Password:<input type=\"password\" name=\"password\"><br>  \n" + 
					    		"    <input type=\"submit\" value=\"login\">  \n" + 
					    		"    </form>");
					    out.close();
				    }
	    	}
	    	else {
	    		out.println("<form action=\"login\" method=\"post\">  \n" + 
			    		"    Login:<input type=\"text\" name=\"login\"><br>  \n" + 
			    		"    Password:<input type=\"password\" name=\"password\"><br>  \n" + 
			    		"    <input type=\"submit\" value=\"login\">  \n" + 
			    		"    </form>");
			    out.close();
	    	}
	    
	    }
	    catch(Exception e) {
	    	out.println("<form action=\"login\" method=\"post\">  \n" + 
		    		"    Login:<input type=\"text\" name=\"login\"><br>  \n" + 
		    		"    Password:<input type=\"password\" name=\"password\"><br>  \n" + 
		    		"    <input type=\"submit\" value=\"login\">  \n" + 
		    		"    </form>");
		    out.close();
	    }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 response.setContentType("text/html");  
	     //PrintWriter out=response.getWriter();  
	     String login=request.getParameter("login");
	     String password=request.getParameter("password");
	     
	     if(login.isEmpty()) {
	    	 response.sendRedirect("login?er=aeio");
	     }
	     if(password.isEmpty()) {
	    	 response.sendRedirect("login?er=eioa");
	     }

	     LoginBean bean=new LoginBean(login, password);
	     //request.setAttribute("bean",bean);  
	          
	     boolean status=bean.validate();
	          
	     if(status==true){
	    	 request.setAttribute("bean",bean);
	    	 response.sendRedirect("guest");
	    	 //ServletContext sc = getServletContext();
	    	 //sc.getRequestDispatcher("/guest").forward(request, response);
	     }  
	     else{  
	    	 response.sendRedirect("login?er=oaie");  
	     }
	      
	}

}
