package booksmanage.web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import booksmanage.dao.BooksDAO;
import booksmanage.model.Book;

/**
 * Servlet implementation class BookServlet
 */
@WebServlet("/")
public class BookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	BooksDAO bookDAO= null;
	
	public void init() {
		
		bookDAO = new BooksDAO();
	}
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getServletPath();
		
		System.out.println("Servlet action:" + action);
		
	try {
		
		switch(action) {
		
		case "/new":
			showBookForm(request,response);
			break;
		case "/edit":
			showEditForm(request,response);
			break;			
		case "/update":
			updateBook(request, response);
			break;
		case "/add":
			addBook(request, response);
			break;
		case "/list":
			listAllBooks(request, response);
			break;		
		case "/delete":
			deleteBook(request,response);
			break;
		default:
			listAllBooks(request, response);
		}
	
	}catch(SQLException ex) {
		ex.printStackTrace();
	}
		
	
	}

	private void updateBook(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		
		int id =Integer.parseInt(request.getParameter("id"));
		
		System.out.println("updateBook id=" + id);
			
		String title = request.getParameter("title");
		
		String author = request.getParameter("author");
		String quantity = request.getParameter("quantity");
		
		String price = request.getParameter("price");
		
		Book buk = new Book(id, title, author, price, quantity);
		
		bookDAO.updateBook(buk);
		
		response.sendRedirect("list-books");
		
	}

	private void showBookForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher reqDispatcher = request.getRequestDispatcher("books-form.jsp");
		
		reqDispatcher.forward(request, response);
	}

	private void addBook(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		
		String title = request.getParameter("title");
		
		String author = request.getParameter("author");
		String quantity = request.getParameter("quantity");
		
		String price = request.getParameter("price");
		
		Book _book = new Book(title, author, quantity, price);
		
		bookDAO.insertBook(_book);
		
		response.sendRedirect("list-books");
		
	}

	private void showEditForm(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
		
		int id =Integer.parseInt(request.getParameter("id"));
		
		System.out.println("Edit Form id="+ id);
		
		Book book = bookDAO.selectBook(id);
		
		request.setAttribute("book", book);
		
		request.getRequestDispatcher("books-form.jsp").forward(request, response);
	
	}

	
	private void listAllBooks(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
		
	    List<Book> listbooks = bookDAO.getAllBooks();
	    
	    System.out.println("~~~~~"+listbooks.size()+"~~~~~~records retrieved.");
	    request.setAttribute("bookslist", listbooks);
	    RequestDispatcher rd= request.getRequestDispatcher("list-books.jsp");
	    
	    rd.forward(request, response);
	    
//	    response.sendRedirect("list-books.jsp");
  
		
	}

	private void deleteBook(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		
		System.out.println("deleteBook() called...");
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		bookDAO.deleteBook(id);
		
		response.sendRedirect("list-books");
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
