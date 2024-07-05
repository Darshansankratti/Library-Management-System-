<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page ="Header.jsp"/>
<form action="get" style="border:2px solid black; padding:50px; width:400px">
  <h3>Enter the book id to get Book Details</h3>
  <label>Enter book id</label> <input type="text" name="id" required><br><br><br><br>
  <input type="submit">
</form>
</body>
</html>