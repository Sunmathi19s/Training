<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>

h2{text-align:center}
ol{text-align:center}
ol>li{
list-style:none;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>

<img src="images/logo.jpg" alt="product">



<h2>${overview}</h2>

<ol>
<li ><a href="product">Add</a></li>
<li><a href="http://localhost:8080/product/srch">find</a></li>
<li><a href="http://localhost:8080/mvc/home">All Product</a></li>
<li><a href="http://localhost:8080/product/del">Delete</a></li>
</ol>



</body>
</html>