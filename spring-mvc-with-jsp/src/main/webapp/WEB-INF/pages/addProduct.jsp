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
<h1>${title}</h1>

<img src="images/logo.jpg" alt="product">

<form:form method="post" modelAttribute="command">

<div>
<label>Product Id</label>
<form:input path="productId" />
</div>
<br>

<div>
<label>Product Name</label>
<form:input path="productName" />
</div>
<br>

<div>
<label>price</label>
<form:input path="price" />
</div>
<br>

<div>
<input type = "submit" value="Add">
</div>
<br>

 </form:form>
</body>
</html>