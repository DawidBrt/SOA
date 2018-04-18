<%@ page import="com.client.*" import="com.library.*" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% out.print("<h1> Library </h1>"); %>
	<hr/>
	
	<%
	javax.naming.InitialContext ic = new javax.naming.InitialContext();
	
	LibraryInfo li=(LibraryInfo)ic.lookup("ejb:/LibraryEJB//LibraryInfoBean!com.library.LibraryInfo");
	BookBooker bb=(BookBooker)ic.lookup("ejb:/LibraryEJB//BookBookerBean!com.client.BookBooker?stateful");
	
	out.print(li.printBookList());
	%>
	
	<form method="post" action="index.jsp">
    Ksiazka: <input type="text" name="book"><br>
    <input type="radio" name="todo" value="return"/> Zwroc
    <input type="radio" name="todo" value="boorow"/> Wypozycz<br>
    <input type="submit"/>
	</form>
	
	
	<%
	try{
		String theBook = request.getParameter("book");
		if(theBook.isEmpty()){}
		else{
			if(request.getParameter("todo").equals("return")){
				out.print(bb.returnBook(theBook));
			}
			else if(request.getParameter("todo").equals("boorow")){
				out.println(bb.borrowBook(theBook));
			}
		}
	}catch(Exception e){		
	}
	%>
</body>
</html>