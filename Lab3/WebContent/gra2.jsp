<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Try your luck</title>
</head>
<body>
<%
int number;
int tc;
try{
	number = Integer.parseInt(request.getParameter("guessNumber"));
	tc = Integer.parseInt(request.getParameter("tryCounter"));
}
catch(Exception e){
	Random rand = new Random();
	number = rand.nextInt(100); 
	tc=1;
}

try{
	int yourNumber = Integer.parseInt(request.getParameter("number"));
	tc++;
	%>
	<form action="gra2.jsp" method="post">
	Podaj liczbę: <input type="number" name="number" min="0" max="100">
	<input type="hidden" value="<%=number%>" name="guessNumber">
	<input type="hidden" value="<%=tc%>" name="tryCounter">
	<input type="submit" value="Zgaduj">
	</form>
	<%
	if(yourNumber>number){
		out.println("Twoja liczba (" + yourNumber + ") jest ");
		%>
		<b>większa</b> niż zagadka
		<%
	}
	else if(yourNumber<number){
		out.println("Twoja liczba (" + yourNumber + ") jest ");
		%>
		<b>mniejsza</b> niż zagadka
		<%
	}
	else{
		out.println("Brawo, zgadłe(a)ś po "
	+ request.getParameter("tryCounter") + " próbach<br>");
		%>
		Spróbuj <a href="/Lab3/gra2.jsp"> raz jeszcze</a>
		<%
	}
}
catch(Exception e){
	%>
	<form action="gra2.jsp" method="post">
	Podaj liczbę: <input type="number" name="number" min="1" max="100">
	<input type="hidden" value="<%=number%>" name="guessNumber">
	<input type="hidden" value="<%=tc%>" name="tryCounter">
	<input type="submit" value="Zgaduj">
	</form>
	<%
}
%>
	
</body>
</html>