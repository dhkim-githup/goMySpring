package com.Servlet;

import java.io.IOException;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class NewCar
 */
@WebServlet("/NewCar")
public class NewCar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		java.io.PrintWriter out = response.getWriter();		
		
		request.setCharacterEncoding("UTF-8");
		
		String strOwner = request.getParameter("car_owner");
		String strName = request.getParameter("car_name");
		String strPrice = request.getParameter("car_price");
		String strMaker = request.getParameter("car_maker");
		String strHome = request.getParameter("car_home");
		
		
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
			String sql = "INSERT INTO zzz_java_study(car_owner, car_name, car_price, car_maker, car_home)";
					sql += " VALUES ('" +strOwner+ "','" +strName+ "',"+strPrice+",'"+strMaker+"','"+strHome+"')";
			int result = stmt.executeUpdate(sql);
			
			if(result == 1) {
				out.print("INSERT success!!");
			} else {
				out.print("INSERT fail!!");
			}
			
			con.commit();			
		} catch (Exception e) {
			e.printStackTrace();			
		} finally {
			try {
				if(stmt != null) stmt.close();
				if(con != null) con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
				try {
					con.rollback();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		response.sendRedirect("CarList.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
