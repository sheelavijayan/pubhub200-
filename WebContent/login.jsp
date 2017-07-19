<!docType HTML>
	<html>
	<head>
	<title>BookApp_register</title>
	</head>
	<body>
	<h3>Book Application</h3>
	<h4>login</h4>
	<form action="LoginServlet">
	<% String errorMessage=(String)request.getAttribute("error message");
if(errorMessage !=null){
out.println(errorMessage);
}
%>
	
	email:<input type="email" name="email" required autofocus></br>
	password:<input type="password" name="password" required><br/>
	
	<button type="submit">Login</button>
	
	</form>
	<br/>
	<a href="register.html">create account</a>
	</body>
	</html>