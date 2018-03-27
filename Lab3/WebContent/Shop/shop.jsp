<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "x" uri = "http://java.sun.com/jsp/jstl/xml" %>

<html>
	<head>
		<title>Shop</title>
	</head>
	<body>
      <c:import var = "staff" url = "http://localhost:8080/Lab3/Shop/staff.xml"/>
      <x:parse xml = "${staff}" var = "output"/>
      <table border=1>
      	<tr>
      		<th>Name</th>
      		<th>Price</th>
      		<th>Amount</th>
      		<th></th>
      	</tr>
      	<x:forEach select = "$output/computer_parts/part" var = "product">
	      	<tr>
	      		<td><x:out select = "$product/name"/></td>
	      		<td><x:out select = "$product/price"/></td>
	      		<form action="set.jsp" method="post">
	      			<td><input type="number" name="amount" min="1" max="100"/>
		      		<input type="hidden" value=<x:out select="$product/@id"/> name="id">
		      		<td><input type="submit" value="Add"></td>
	      		</form>
	      		</td>
	      	</tr>
      	</x:forEach>
      </table>

   </body>
</html>