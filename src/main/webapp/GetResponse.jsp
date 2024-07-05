<%@page import="Model.Book"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="Header.jsp" /><br>
	<button>
		<a href="Home.jsp">HOME</a>
	</button>
	<br>
	<br>
	<%
	Book b1 = (Book) request.getAttribute("get");
	%>
	<table border="4">
		<tr>
			<th>Book id</th>
			<th>Book Name</th>
			<th>Book Author</th>
			<th>Book Price</th>
			<th>Book qty</th>
		</tr>
		<tr>
			<td><%=b1.getBookid()%></td>
			<td><%=b1.getName()%></td>
			<td><%=b1.getAuthor()%></td>
			<td><%=b1.getPrice()%></td>
			<td><%=b1.getQuantity()%></td>

		</tr>

	</table>

</body>
</html>