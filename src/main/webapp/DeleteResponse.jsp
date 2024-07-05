<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>delete</title>
</head>
<body style="padding:10px; border:2px solid black; width:600px">
<jsp:include page ="Header.jsp"/>
<br>
<button><a href="Home.jsp">HOME</a></button><br><br>

<h4>RESULT</h4>
<%String r= (String)request.getAttribute("a"); %>
 <%= r %>
</body>
</html>