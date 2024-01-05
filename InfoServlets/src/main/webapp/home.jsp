<%

String ses_u_name = (String)session.getAttribute("u_name");

out.print("Hello Mr./Mrs. "+ses_u_name);

%>