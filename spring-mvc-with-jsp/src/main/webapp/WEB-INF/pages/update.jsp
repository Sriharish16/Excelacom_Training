<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>${suba}</h1>

<form:form method="post" modelAttribute="command">

<label>Product Id</label>
<form:input path="productId"/>

<label>Rate of Price</label>
<form:input path="price"/>





<input type="submit" value="Update">

</form:form>
</body>
</html>