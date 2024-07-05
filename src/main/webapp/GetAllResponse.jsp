<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page ="Header.jsp"/><br>
<button><a href="Home.jsp">HOME</a></button>
<h3>ALL THE BOOK DETAILS</h3>
<table border="1">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Author</th>
			<th>price</th>
			<th>quantity</th>
		</tr>
		<c:forEach var="book" items="${all}">
			<tr>
				<td>${book.bookid }</td>
				<td>${book.name }</td>
				<td>${book.author }</td>
				<td>${book.price }</td>
				<td>${book.quantity }</td>
			</tr>
		</c:forEach>

	</table>
</body>
</html>