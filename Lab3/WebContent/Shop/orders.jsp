<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "x" uri = "http://java.sun.com/jsp/jstl/xml" %>

<html>
	<head>
		<title>Your orders</title>
	</head>
<body>
<jsp:useBean id="order" class="shop.Orders" scope="session"/>
	<h3>Orders</h3>

	<c:import var = "staff" url = "http://localhost:8080/Lab3/Shop/staff.xml"/>
	<x:parse xml = "${staff}" var = "output"/>
    
    <table border=1>
        <tr>
            <th>Name</th>
            <th>Amount</th>
            <th>Cost</th>
            <th>Add</th>
            <th>Remove</th>
            <th>Delete</th>
        </tr>
        <c:forEach var="orderID" items="${order.orders.keys()}" >
            <tr>
                <td><x:out select="$output/computer_parts/part[$orderID]/name" /></td>
                <td><c:out value="${order.orders.get(orderID)}"/></td>
                <td><x:out select="$output/computer_parts/part[$orderID]/price" /></td>
                <td>
                    <form method="POST" action="set.jsp">
                    	<input type="hidden" name="amount" value="${order.orders.get(orderID)+1}"/>
                        <input type="hidden" name="id" value = <c:out value = "${orderID}"/> >
                        <input type="submit" value="+">
                    </form>
                </td>
                <td>
                    <form method="POST" action="set.jsp">
                    	<input type="hidden" name="amount" value="${order.orders.get(orderID)-1}"/>
                        <input type="hidden" name="id" value = <c:out value = "${orderID}"/> >
                        <input type="submit" value="-">
                    </form>
                </td>
                <td>
                    <form method="POST" action="set.jsp">
                    	<input type="hidden" name="amount" value="0"/>
                        <input type="hidden" name="id" value = <c:out value = "${orderID}"/> >
                        <input type="submit" value="x">
                    </form>
                </td>
            </tr>
        </c:forEach>
</table>
<a href="/Lab3/Shop/shop.jsp">Back to shop</a>
</body>
</html>