<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add or Edit Book</title>
</head>
<body>
	<div align="center">
		<h1>Add/Edit Book</h1>
		<table>
			<form:form action="update" method="post" modelAttribute="book">
			<form:hidden path="id"/>
			<tr>
				<td>Author, Last Name:</td>
				<td><form:input path="authorln"/></td>
			</tr>
			<tr>
				<td>Author, First Name:</td>
				<td><form:input path="authorfn"/></td>
			</tr>
			<tr>
				<td>Title:</td>
				<td><form:input path="title"/></td>
			</tr>
			<tr>
				<td>Year:</td>
				<td><form:input path="year"/></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="Update">
				</td>
			</tr>			
			</form:form>
		</table>
	</div>
	
</body>
</html>