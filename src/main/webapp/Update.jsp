<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<jsp:include page ="Header.jsp"/>
<body>
<form action="update" style="border:2px solid black; padding:50px; width:400px">

<h2>Enter All details to update </h2>
  <label>Book id</label> <input type="text" name="id" required> <br><br><br>
  <label>Name</label> <input type="text" name="name" required> <br><br><br>
  <label>Author</label> <input type="text" name="author" required><br><br><br>
  <label>Price</label>  <input type="text" name="price" required><br><br><br>
  <label>Quantity</label> <input type="text" name="qty" required><br><br><br><br>
  <input type="submit">
</form>
</body>
</html>