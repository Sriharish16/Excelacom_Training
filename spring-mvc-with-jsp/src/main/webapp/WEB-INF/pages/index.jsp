<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${title}
<ol>
<li><a href="http://localhost:8090/product">Add</a></li>
<li><a href="http://localhost:8090/product/{id}">find</a></li>
<li><a href="http://localhost:8090/mvc/home">All Product</a></li>
<li><a href="http://localhost:8090/product/remove/{id}">Delete</a></li>
</ol>

</body>
</html>