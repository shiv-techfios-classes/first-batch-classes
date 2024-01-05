package web.demo;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ParamServlets
 */

public class ParamServlets extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	String email= null;
	
	String debug = "false";
	
	public void init(ServletConfig config) {
		
		email = config.getInitParameter("email");
		
		debug = config.getInitParameter("debug");
		 
		System.out.println("email from web.xml:" + email);
	}
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ParamServlets() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.getWriter().println("<br>Email:" + email);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
