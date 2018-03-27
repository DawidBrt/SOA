<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>Setting orders</title>
	</head>
	<body>
		<jsp:useBean id="order" class="shop.Orders" scope="session"/>
		<%
		int amount;
		try{
			amount = Integer.parseInt(request.getParameter("amount"));
		} catch(Exception e){
			amount = 1;
		}
		try{
			order.setOrder(Integer.parseInt(request.getParameter("id")), amount);
		}catch(Exception e){
			%>
			<c:redirect url="shop.jsp"/>
			<%
		}
		%>
		<c:redirect url="orders.jsp"/>
	</body>
</html>