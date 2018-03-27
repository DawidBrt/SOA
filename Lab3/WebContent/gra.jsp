<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Try your luck</title>
</head>
<body>
<%@page import="java.util.*" %>

<form action="gra.jsp" method="post">
Podaj liczbę: <input type="number" name="number" min="1" max="100">
<input type="submit" value="Zgaduj">
</form>

<%
if(session.isNew()){
	session.setAttribute("tryCounter",0);
	
	Random rand = new Random();
	int n = rand.nextInt(100);
	System.out.println(n);
	
	session.setAttribute("guessNumber", n);	
}

try{
	int yourNumber = Integer.parseInt(request.getParameter("number"));
	
	int gc = (Integer)session.getAttribute("tryCounter");
	session.setAttribute("tryCounter", ++gc);
	int randomNumber = (Integer)session.getAttribute("guessNumber");
	
	if(yourNumber>randomNumber){
		out.println("Twoja liczba (" + yourNumber + ") jest ");
%>
		<b>większa</b> niż zagadka
<%
	}
	else if(yourNumber<randomNumber){
		out.println("Twoja liczba (" + yourNumber + ") jest ");
%>
		<b>mniejsza</b> niż zagadka
<%
	}
	else{
		out.println("Brawo, zgadłe(a)ś po " 
	+ session.getAttribute("tryCounter") + " próbach<br>");
		session.invalidate();
		%>
		Spróbuj <a href="/Lab3/gra.jsp"> raz jeszcze</a>
		<%
	}
}
catch(Exception e){
	//out.println("Prosze podac liczbe");
}


%>
	
</body>
</html>