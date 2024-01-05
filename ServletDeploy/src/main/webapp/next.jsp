<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Result</title>
</head>
<body>

Hello, You entered a value!

<%! 
  double i=0; 
 String num ="";

%>

You entered:<% num =request.getParameter("a_num") ;%>

<% i = Double.parseDouble(num) ;%>

<h3><i>Square root of entered value is:</i></h3><%=Math.sqrt(i) %>



</body>
</html>