<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>My Bookshelf</title>
    </head>
    <body>
        <div align="center">
	        <h1>Books</h1>
	        <h2><a href="new">Add Book</a></h2>
	        
        	<table border="1">
                
                <th>Author</th>
                <th>Title</th>
                <th>Year</th>
                <th>Actions</th>
	        	
				<c:forEach var="book" items="${bookList}" varStatus="status">
	        	<tr>
	        		
	        		<td>${book.authorln}, ${book.authorfn}</td>
					<td>${book.title}}</td>
					<td>${book.year}.email}</td>
					<td>
						<a href="edit?id=${book.id}">Edit</a>
						&nbsp;&nbsp;&nbsp;&nbsp;
						<a href="delete?id=${book.id}">Delete</a>
					</td>
	        	</tr>
				</c:forEach>	        	
        	</table>
        </div>
    </body>
</html>
