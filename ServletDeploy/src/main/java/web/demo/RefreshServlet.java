package web.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class RefreshServlet
 */
@WebServlet("/RefreshServlet")
public class RefreshServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RefreshServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
		
		  HttpSession session = request.getSession(true);
		  response.setIntHeader("Refresh", 30);
		  response.setContentType("text/html");
		  PrintWriter out = response.getWriter();
		  Integer count = Integer.valueOf(0);
		  String head;
		  if (session.isNew()) {
		   head = "This is the New Session";
		  } else {
		   head = "This is the old Session";
		   Integer oldcount = (Integer)session.getAttribute("count");
		   if (oldcount != null) {
		    count = Integer.valueOf(oldcount.intValue() + 1);
		   }
		  }
		  session.setAttribute("count", count);
		  out.println("<HTML><BODY BGCOLOR=#FDF5E6>" + "<H2 ALIGN=CENTER>" + head + "</H2>"
		    + "<TABLE BORDER=1 ALIGN=CENTER>" + "<TR BGCOLOR=#FFAD00>" + "  <TH>Information Type<TH>Session Count "
		    + "<TR>" + " <TD>Total Session Accesses" + "<TD>" + count + "</TABLE>" + "</BODY></HTML>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
