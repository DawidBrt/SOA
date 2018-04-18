<%@ page import="com.myconv.*" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Temperature Converter</title>
</head>
<body>
	<% out.print("<h1>Temperature converter</h1>"); %>
<hr>
<form method="post" action="index.jsp">
    Temperature: <input type="text" name="temp"><br>
    Convert to:
    <input type="radio" name="conv" value="F"/> Fahrenheit
    <input type="radio" name="conv" value="C"/> Celsius<br>
    <input type="submit"/>
</form>
	<%
	try{
		double yourTemp = Double.parseDouble(request.getParameter("temp"));
		javax.naming.InitialContext ic = new javax.naming.InitialContext();
		TemperatureConverterRemote tcr=(TemperatureConverterRemote)ic.lookup("ejb:/TemperatureConverterEJB//TemperatureConverter!com.myconv.TemperatureConverterRemote"); 	
		if(request.getParameter("conv").equals("F")){
			double result = tcr.fromCtoF(yourTemp);
			out.println(yourTemp + " Celsius is: "+result + " Fahrenheit");
		}
		else if(request.getParameter("conv").equals("C")){
			double result = tcr.fromFtoC(yourTemp);
			out.println(yourTemp + " Fahrenheit is: "+result + " Celsius");
		}
	}catch(Exception e){		
	}
%>
</body>
</html>