<%@ page import="ex.soa.*" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Temperature Converter</title>
</head>
<body>
	<h1>Temperature Converter</h1>
	<hr>
	<form action="index.jsp" method="post">
		Temperature: <input type="text" name="temp"><br/>
		From: 
	</form>
	<%
		TempCalc test = new TempCalc();
		double x = test.CtoF(0.0);
		out.println("Result is: " + x);
	%>

</body>
</html>