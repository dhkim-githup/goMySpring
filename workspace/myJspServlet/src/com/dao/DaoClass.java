package com.dao;

import java.sql.*;
import java.util.ArrayList;


public class DaoClass {
	
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@172.16.3.224:1521:testdb";
	String id = "mets_imsi";
	String pw = "mets_imsi";
	
	public DaoClass() {
		try {
			Class.forName(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<DtoClass> selCar() {
		
		String strOwner, strName, strMaker, strHome;
		int iPrice;
		
		// TODO Auto-generated method stub
		ArrayList<DtoClass> list = new ArrayList<DtoClass>();
		
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
				strOwner = res.getString("car_owner");
				strName = res.getString("car_name");
				strMaker = res.getString("car_maker");
				strHome = res.getString("car_home");
				iPrice = res.getInt("car_price");
				
				DtoClass dto = new DtoClass(strOwner, strName, strMaker, strHome, iPrice);
				list.add(dto);
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
		
		return list;

	}


}
