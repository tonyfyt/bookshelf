<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bookshelf</title>
    </head>
    <body>
        <div align="center">
            <h1>My Books</h1>
            <table border="1">
                <th>No</th>
                <th>Authorln</th>
                <th>Authorfn</th>
                <th>Title</th>
                <th>Year</th>
                 
                <c:forEach var="book" items="${bookList}" varStatus="status">
                <tr>
                    <td>${status.index + 1}</td>
                    <td>${book.authorln}</td>
                    <td>${book.authorfn}</td>
                    <td>${book.title}</td>
                    <td>${book.year}</td>
                             
                </tr>
                </c:forEach>             
            </table>
        </div>
    </body>
</html>