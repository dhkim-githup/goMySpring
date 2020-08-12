<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="com.dao.*" %>
<%@ page import="java.util.ArrayList" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	Car List ...
	
	<%
	    DaoClass dao = new DaoClass();
		ArrayList<DtoClass> list = dao.selCar();
		
		
		for (int i = 0; i < list.size(); i++) {
			
			//System.out.print("Owner : " +  list.get(i));
			
			DtoClass dto = list.get(i); // �ش� �ε����� ��ü�� ���� 
			
			out.print("Owner : " + dto.getStrOwner());
			out.print(", Name : " + dto.getStrName());
			out.print(", Price : " + dto.getiPrice());
			out.print(", Maker : " + dto.getStrMaker());
			out.println(", Home : " + dto.getStrHome());
			
			out.println("<p>");
		}
	%>
</body>
</html>