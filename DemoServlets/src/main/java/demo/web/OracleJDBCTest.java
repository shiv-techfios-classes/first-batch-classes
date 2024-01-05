package demo.web;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleJDBCTest {

	public static void main(String[] args) {
		
		Connection con;
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE", "hr", "HR");
			Statement st = con.createStatement();
		//	ResultSet rs = st.executeQuery("select * from users where userid='" + "manisha" + "' and password='" + "123" + "'");
			ResultSet rs = st.executeQuery("select * from users where userid='psingh' and password='psingh'");

            String userid ="psingh";
            
            String password="psingh";
			try {

				if(rs.isBeforeFirst()) {
			     	while(rs.next()) {
			     	 String ouser = rs.getString("userid");
			     	 String opaswd = rs.getString("password");
					 if (ouser.equals(password) && opaswd.equals(userid)) {
					  //out.println("<h2>Welcome </h2>");
						 
						 System.out.println("Welcome");
					 } else {
					  //out.println("Invalid password or username.");
						 System.out.println("Invalid username.");
					 }
				  }
				} else {
					//out.println("User not registered.");
					
					System.out.println("User not regsitered.");
				}
			}catch (Exception e) {
			 e.printStackTrace();
			}

			System.out.println(rs.next());
			
			if(con!=null)
		
				System.out.println("Connection successful.");
			
			  Statement statement = con.createStatement();
	          String sql = "select * from employees";

	          // Step 4: Execute the query
	          ResultSet result = statement.executeQuery(sql);

	          // Step 5: Process the results

	          // Condition check using hasNext() method which
	          // holds true till there is single element
	          // remaining in List
	          
	          int count =25;
	       /**   while (result.next() && count-->0) {

	              // Print name an age
	              System.out.println(
	                  "ID: " + result.getString("employee_ID") + "\tEMail:" + result.getString("email"));
	            
	          }
			*/
				
		} catch (SQLException e) {
			System.out.println("Error in connection.Failed!");
			
			e.printStackTrace();
		}
	}				
		
}


