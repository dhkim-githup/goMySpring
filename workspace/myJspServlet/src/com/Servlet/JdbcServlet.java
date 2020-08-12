package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class JdbcServlet
 */
@WebServlet("/JdbcServlet")
public class JdbcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JdbcServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@172.16.3.224:1521:testdb";
		String id = "mets_imsi";
		String pw = "mets_imsi";
		
		Connection con = null;
		Statement stmt = null;
		ResultSet res = null;
		
		
		
		try {
			
			Class.forName(driver);			
            con = DriverManager.getConnection(url, id, pw);			
			stmt = con.createStatement();					
						
			String sql = "SELECT car_owner, car_name, car_price, car_maker, car_home FROM zzz_java_study ";
			res = stmt.executeQuery(sql);
			
			while (res.next()) {
				out.print("Owner : " + res.getString("car_owner"));
				out.print(", Name : " + res.getString("car_name"));
				out.print(", Price : " + res.getInt("car_price"));
				out.print(", Maker : " + res.getString("car_maker"));
				out.println(", Home : " + res.getString("car_home"));
				out.println("<p>");
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {	
				if(stmt!= null) stmt.close();
				if(con != null) con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		//response.sendRedirect("hello.jsp");
		//response.sendRedirect("CarList.jsp");
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
