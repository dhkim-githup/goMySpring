package com.jdbc;


import java.sql.*;

public class MainJdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
				System.out.print("Owner : " + res.getString("car_owner"));
				System.out.print(", Name : " + res.getString("car_name"));
				System.out.print(", Price : " + res.getInt("car_price"));
				System.out.print(", Maker : " + res.getString("car_maker"));
				System.out.println(", Home : " + res.getString("car_home"));
				
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
		

	}

}
