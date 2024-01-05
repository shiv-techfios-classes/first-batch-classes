<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to JSP</title>

</head>
<body>
<h3>Welcome User</h3>

<p>Random decimals:</p><%= Math.random()%><br><br>

<form action="next.jsp">

Enter a number:<input type="text" name="a_num">
               <input type="submit" title="Submit"> 

</form>

<%@include file="/jsp/footer.jsp"%>


</body>
</html>