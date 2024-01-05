<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@page import = "game.guess.NumberGuessBean" %>
<jsp:useBean id="numguess" class="game.guess.NumberGuessBean" scope="session" />
<%-- This JSP has a form with request parameter "guess=xxx", which matches
     the setGuess() method of the bean  --%>
<jsp:setProperty name="numguess" property="*"/>
  
<html>
<head><title>Number Guess</title></head>
<body>
<%-- For the first access without request parameter "guess", setGuess() did not run.
     For subsequent access with parameter "guess", setGuess() (bound earlier in jsp:setProperty) 
     already run to check the user input. --%>
<%
if (numguess.isSuccess()) {    // correct guess - updated by setGuess() bound earlier
%>
  <p>Congratulations!  You got it, after <%= numguess.getNumGuesses() %> tries.</p>
  <% numguess.reset(); %>
  <p><a href="<%= request.getRequestURI() %>">try again</a></p>
<%
} else {
  if (numguess.getNumGuesses() == 0 ) {   // start a game
%>
    <p>Welcome to the Number Guess game.</p>
<%
  } else {   // in a game, wrong guess
%>
    <p>Good guess, but nope. Try <strong><%= numguess.getHint() %></strong>.</p>
    <p>You have made <%= numguess.getNumGuesses() %> guesses.</p>
<%
  }
%>    
  <%-- Putting up the form to get the user guess  --%>
  <p>I'm thinking of a number between 1 and 100.<p>
  <form method="get">
    <p>What's your guess? <input type="text" name="guess">
    <input type="submit" value="Submit">
  </form>
<%
}
%>
</body>
</html>