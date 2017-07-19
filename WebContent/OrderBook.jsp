<%@page import="com.sheela.user.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Book app</title>
</head>
<body>
<h2> Order Book</h2>
<form action="OrderBookServlet">
<%User user=(User) session.getAttribute("Logged_in_user"); %> 
welcome<%=user.getName() %>
<br/>

UserId:<input type="number" name="user_id" required value="<%=user.getId()%>" readonly></br>

Select book:<select name="book_id" required>
<option value="11">java</option>
<option value="12">c</option>
<option value="13">c++</option>
<option value="14">ADC</option>
</select>
</br>

Quantity:<input type="number" name="quantity"  required></br>

<button type="submit">submit</button>
</form>
</body>
</html>