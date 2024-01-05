package demo.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */

@WebServlet("/hellousers")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	Connection conn =null;
	Statement stmt= null;
	
	public void init() {
		
		try {
		
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE", "hr", "hr");
			
		    stmt = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter writer = response.getWriter();
		
		String usersquery = "select * from users";
		
	
		try {
			
			 conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE", "hr", "hr");
			
			 stmt = conn.createStatement();
			
			 ResultSet usersrs  =stmt.executeQuery(usersquery);
			
			  writer.println("Users records----------");

			while(usersrs.next()) {
				
				writer.println(usersrs.getString("fname")+"\t" + usersrs.getString("lname")+"\t" + usersrs.getString("email"));
				
			}
			/**
			String fname = "pawan";
			String lname = "kumar";
			String email = "pawan.kumar@rediff.com";
			String userid = "pawan";
			String paswd = "pawan";
			int rowCount = stmt.executeUpdate("insert into users values('" + fname+"','"+ lname+"','" + email+"','"+ userid+"','"
					                                                 +paswd +"')");
			**/
			
//			writer.println("Books records----------");
		
//			ResultSet booksrs    =stmt.executeQuery(booksquery);
//			booksrs =stmt.executeQuery(booksquery);
//			while(booksrs.next()) {
//				
//				writer.println(booksrs.getInt("id")+booksrs.getString("title")+"\t" + booksrs.getString("author"));
//				
//			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
