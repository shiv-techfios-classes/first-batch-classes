<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Authors:</title>
</head>
<body>
<h2>Choose authors:</h2>
  <form method="get">
    <input type="checkbox" name="author" value="Tan Ah Teck">Tan
    <input type="checkbox" name="author" value="Mohd Ali">Ali
    <input type="checkbox" name="author" value="Kumar">Kumar
    <input type="checkbox" name="author" value="Peter Johnson">Peter
    <input type="submit" value="Query">
  </form>
  
  <% 
  String[] authors = request.getParameterValues("author");
  if (authors != null) {
  %>
    <h3>You have selected author(s):</h3>
    <ul>
      <%
      for (String author : authors) { 
      %>
        <li><%= author %></li>
      <%
      }
      %>
    </ul>
  <%
  }
  %>
  <br /><a href="<%= request.getRequestURI() %>">BACK</a> 
  
  <%= request.getRequestURI() %>
</body>
</html>