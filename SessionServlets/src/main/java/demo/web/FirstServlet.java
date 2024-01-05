package demo.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		 out.println("<!DOCTYPE html>");
		 out.println("<html><head>");
         out.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
         out.println("<title>Hello, World</title></head>");
         out.println("<body>");
        
         out.println("<p>Using Math.random() function:" + Math.random());
     
         out.println("<P>getServletPath():" + request.getServletPath()+"</P>");
         
         out.println("<P>getContextPath():" + request.getContextPath()+"</P>");
         
         
         String baseUrl = getBaseUrl(request) + request.getServletPath();
         
         out.println("Back Path:" + baseUrl);
         
         out.println("<a href="+baseUrl+"/>" + "Back");
         
         out.println("</body>");
         out.println("</html>");
		

		
	}
	
	 public static String getBaseUrl(HttpServletRequest request) {
		    String scheme = request.getScheme() + "://";
		    String serverName = request.getServerName();
		    String serverPort = (request.getServerPort() == 80) ? "" : ":" + request.getServerPort();
		    String contextPath = request.getContextPath();
		    return scheme + serverName + serverPort + contextPath;
		  }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
