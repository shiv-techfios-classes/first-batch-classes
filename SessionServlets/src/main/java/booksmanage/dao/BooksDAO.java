package booksmanage.dao;

import booksmanage.model.Book;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class BooksDAO {
	

	private static final String DELETE_BOOKS_SQL = "delete from books where id =?";
	
	private static final String SELECT_BOOK_SQL = "select id, title, author, price, quantity from books where id=?";
	
	private static final String INSERT_A_BOOK_SQL = "INSERT INTO BOOKS(title, author, price,quantity) values(?,?,?,?)";
	
	private static final String UPDATE_A_BOOK_SQL = "UPDATE BOOKS SET title=?, author=?, price=?, quantity=? where id=?";
	
	private static final String GET_ALL_BOOKS_SQL = "select * from books";

//	private String jdbcURL = "jdbc:oracle:thin:@localhost:1521/XE";
//	
//	private String jdbcUsername ="hr";
//	
//	private String jdbcPassword="HR";

	private String jdbcURL = "jdbc:mysql://localhost:3306/demo?useSSL=false";

	private String jdbcUsername = "root";
	
	private String jdbcPassword = "root";

	
	private Connection connection = null;
	
	public Connection getConnection() {
			
		try {
			
			if(connection==null) {
				
				connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
				
				System.out.println("Connection object:"+ connection);
			}			
				
			} catch (SQLException e) {
				
				e.printStackTrace();
		    }		
	  return connection;
	}
	
	public List<Book> getAllBooks() throws SQLException {
		
		List<Book> books = new ArrayList<Book>();
		Connection conn = getConnection();
		
		PreparedStatement ps = conn.prepareStatement(GET_ALL_BOOKS_SQL);
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			
			int id =rs.getInt("id");
			System.out.println("-----id:"+ id);
			
			
			String title = rs.getString("title");
			String author =rs.getString("author");
			String qty =  rs.getString("quantity");
			String price = rs.getString("price");
			
			books.add(new Book(id, title, author, price, qty));
		}
		
		return books;
			
	}
	
	public boolean deleteBook(int id) throws SQLException {
		
		boolean rowDeleted =false;
		
		Connection conn = getConnection();
		
		System.out.println(DELETE_BOOKS_SQL);
		
		PreparedStatement ps = conn.prepareStatement(DELETE_BOOKS_SQL);
		
		ps.setInt(1, id);
		
		rowDeleted = ps.executeUpdate()>0;
		
	    return rowDeleted;
		
	}

	public boolean insertBook(Book book) throws SQLException {
		
		Connection conn = getConnection();
		
		PreparedStatement ps = conn.prepareStatement(INSERT_A_BOOK_SQL);
		
		ps.setString(1, book.getTitle());
		ps.setString(2, book.getAuthor());
		ps.setString(3, book.getPrice());
		ps.setString(4, book.getQuantity());
		
		boolean rowAffected = ps.executeUpdate()>0;
		
		return rowAffected;
	}

	public Book selectBook(int id) throws SQLException {
		
		Connection conn =  getConnection();
		
		PreparedStatement ps = conn.prepareStatement(SELECT_BOOK_SQL);
		
		ps.setInt(1, id);
		
		ResultSet rs = ps.executeQuery();
		
		Book book = null;
		
		while(rs.next()) {
						
			String name = rs.getString("title");
			
			String author = rs.getString("author");
			
			String price =  rs.getString("price");
			
			String quantity = rs.getString("quantity");
	
			
			book = new Book(id, name, author, price, quantity);
		}
		
		return book;
	}

	public boolean updateBook(Book book) throws SQLException {
		Connection conn = getConnection();
		
		PreparedStatement ps = conn.prepareStatement(UPDATE_A_BOOK_SQL);
		
		ps.setString(1, book.getTitle());
		ps.setString(2, book.getAuthor());
		ps.setString(3, book.getPrice());
		ps.setString(4, book.getQuantity());
	
		ps.setInt(5, book.getId());
		
		System.out.println("Updating book id="+book.getId());
		boolean rowAffected = ps.executeUpdate()>0;

		return rowAffected;
		
	}
	

}
