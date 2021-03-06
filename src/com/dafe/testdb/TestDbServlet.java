package com.dafe.testdb;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class TestDbServlet
 */
@WebServlet("/TestDbServlet")
public class TestDbServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public TestDbServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
	//setup connection variables
		String user = "springstudent";
		String pass = "springstudent";
		
		String jdbcUrl = "jdbc:mysql://localhost:3308/web_customer_tracker?"
				+ "useSSL=false&serverTimeZone=UTC";
		String driver = "com.mysql.jdbc.Driver";
	
		
		//get connection
	
		try {
			PrintWriter out = response.getWriter();
			out.print("connecting to database: " + jdbcUrl);
				
			Class.forName(driver);
			
			Connection conn =DriverManager.getConnection(jdbcUrl,user,pass);
			
			out.println("Success...!");
			
			conn.close();
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new ServletException(e);
		
		
		
		}
		
	}

}
