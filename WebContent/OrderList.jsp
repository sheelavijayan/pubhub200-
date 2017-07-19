<%@page import="com.sheela.order.Order"%>
<%@page import="java.util.List"%>
<%@page import="com.sheela.orderdao.OrderDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ordered List</title>
</head>
<body><h3>list of books</h3>
	<%
		OrderDAO orderdao = new OrderDAO();
		List<Order> orderList = orderdao.login();
		//out.println("books:" + bookList);
	%>
	<table border="1">
		<thead>
			<tr>
				<th>userid</th>
				<th>bookid</th>
				<th>status</th>
				<th>quantity</th>
				<th>orderdate</th>
			</tr>
		</thead>
		
	<%
		for (Order o : orderList) {
			out.println("<tr>");
			out.println("<td>" + o.getUserId()+ "</td>");
			out.println("<td>" + o.getBookId()+ "</td>");
			out.println("<td>" + o.getStatus()+ "</td>");
			out.println("<td>" + o.getQuantity()+ "</td>");
			out.println("<td>" + o.getOrderDate()+ "</td>");
			out.println("</tr>");
		}
	%>

</body>
</html>