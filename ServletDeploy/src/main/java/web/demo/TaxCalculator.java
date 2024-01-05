package web.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TaxCalculator
 */
@WebServlet("/taxcalculator")
public class TaxCalculator extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	private static final double taxRate = 0.4;
	
	double incomeTax= 0.0;
	
	double annualIncome = 0.0;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TaxCalculator() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String income = request.getParameter("s_income");;
		PrintWriter writer =   response.getWriter();
	
		if(income=="") {
			
			income ="0.0";
		}
		
		System.out.println("Entered Income:" + income);
		try {
		
			annualIncome = Double.parseDouble(income);
		
		}catch(NumberFormatException nfe) {
		
			writer.print("You have to enter a numeric value.");
			
			return;		
		}

		incomeTax = annualIncome*taxRate;
		
		
		writer.println("Tax Payable is:" + incomeTax);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// TODO Auto-generated method stub
	
		
		doGet(request, response);
	}

}
