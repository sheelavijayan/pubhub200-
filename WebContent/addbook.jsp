<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>add book</title>
</head>
<body>
<h4>crate a account</h4>
	<form action="AddBook">
		name:<input type="text" name="name" required autofocus></br> 
		price:<input type="integer" name="price" required></br> 
		publishedDate:<input type="date" name="published_date" required ><br /> 


		<button type="submit">create book</button>

	</form>
</body>
</html>