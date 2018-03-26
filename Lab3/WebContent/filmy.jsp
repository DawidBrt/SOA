<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import = "java.util.*, ex5.Film" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<% 
 	ArrayList<Film> filmy = new ArrayList<>();
	filmy.add(new Film("Ojciec chrzestny", "dramat", 1972, "120000000"));
	filmy.add(new Film("Pluton", "wojenny", 1986, "50000000"));
	filmy.add(new Film("Nagi instynkt", "thriller", 1992, "100000000"));
	pageContext.setAttribute("filmy", filmy);
%>

<html>
  <head>
    <title>Filmy</title>
    <style>
table, th, td {
    border: 1px solid black;
    padding: 1px;
}
table {
    border-spacing: 1px;
}
</style>
  </head>
  <body bgcolor="white">
  <h3>Lista filmów</h3>
    <table>
    <tr>
    <th>Tytuł</th>
    <th>Gatunek</th>
    <th>Rok</th>
    <th>Dochod</th>
    </tr>
      <c:forEach items="${filmy}" var="current">
        <tr>
        <td><c:out value="${current.tytul}" /></td>
    	<c:choose>
    		<c:when test="${current.gatunek.equals('wojenny')}">
    		<td bgcolor="#99ccff">
    		<c:out value="${current.gatunek}"/>
    		</td>
    		</c:when>
    		<c:otherwise>
    			<td>
    			<c:out value="${current.gatunek}"/>
    			</td>
    		</c:otherwise>
    	</c:choose>
    	
    	<td><c:out value="${current.rok}"/></td>
    	<td><fmt:formatNumber value="${current.dochod}" type="currency"/></td>
        </tr>
      </c:forEach>
    </table>
  </body>
</html>