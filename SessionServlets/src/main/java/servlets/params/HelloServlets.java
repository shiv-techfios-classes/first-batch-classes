package servlets.params;

import java.io.IOException;
import java.util.function.Consumer;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlets extends HttpServlet {
	
	Consumer<String> logger = (x)-> System.out.println(x);
	
	private boolean debug = false;
	
	ServletContext context = null;
	
	@Override
	public void init() {
		
		ServletConfig config = getServletConfig();
		
		String isDebugEnabled = config.getInitParameter("debug");
		
		if(isDebugEnabled.equalsIgnoreCase("true")) 
			{
			  System.out.println("Debug Mode Enabled");
 
			  debug = true;
			  
			}
		
	    context = config.getServletContext();
	    
	    System.out.println("---------------------------------");
	    
	    logger.accept("Will connect at:" + context);
	    
		
		
	}
	
	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.getWriter().append("\n\n<b>Debug Mode Enabled:</b>"+ debug);
		
		String dbUrl = context.getInitParameter("databaseUrl");
		
		response.getWriter().append("\n\nWill be connecting at:" + dbUrl);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}


}
