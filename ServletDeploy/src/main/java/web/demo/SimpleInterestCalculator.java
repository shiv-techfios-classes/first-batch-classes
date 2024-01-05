package web.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SimpleInterestCalculator
 */
@WebServlet("/simpleinterest")
public class SimpleInterestCalculator extends HttpServlet {

	private static final long serialVersionUID = 1L;

	double rate = 0.07;
	
	double prinicipal = 0.0;
	
	double tenure =0 ;
	
	double maturityamount = 0.0;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SimpleInterestCalculator() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String pr = request.getParameter("p_num");
		
		String tr = request.getParameter("t_num");
		
		
		PrintWriter writer = response.getWriter();
		
		if(pr=="" || tr=="") {
			
			pr = "0.0";
			tr = "0.0";
		}

		try {
			
			prinicipal = Double.parseDouble(pr);
			
			tenure = Double.parseDouble(tr);
			
		}catch(NumberFormatException ne) {
			
			writer.println("Only numerical values are allowed.");
			
			return;
			
		}

		
		maturityamount = prinicipal + prinicipal*tenure*rate;

		
		writer.println("Maturity Amount after "+ tenure +" years is " + maturityamount);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
