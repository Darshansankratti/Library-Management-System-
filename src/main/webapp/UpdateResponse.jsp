<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>updated</title>
</head>
<body>
<jsp:include page ="Header.jsp"/>
<button><a href="Home.jsp">HOME</a></button><br><br>
<form action="getall">
<button>getall</button><br><br>
</form>
<%String r= (String)request.getAttribute("a"); %>
Result: <%= r %>
</body>
</html>