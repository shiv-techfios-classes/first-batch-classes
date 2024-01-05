<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% 
double num = Math.random();

if(num>0.76) {

%>

<h2>You have a lucky day today<p>(<%= num %>)</h2>
<%} else {%>

<h2>life goes on<p> <%= num %></h2>

<%} %>

<a href="<%= request.getRequestURI()%>"><h3>Try Again!</h3></a>
</body>
</html>