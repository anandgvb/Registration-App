<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="springform"
	uri="http://www.springframework.org/tags/form"%>
<%@ include file="header.html"%>
<!DOCTYPE html>
<html>
<head>
<%@ page isELIgnored="false" %>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
<style type="text/css">
.error {
	color: #ff0000;
	font-style: italic;
	font-weight: bold;
}
</style>
</head>
<body>
<springform:form modelAttribute="customerObj" action="submit" method="POST">
	<table>
		<tr>
			<td>First Name: </td>
			<td><springform:input path="firstName"/></td>
		<td><springform:errors path="firstName" cssClass="error"/></td>
		</tr>
		<tr>
			<td>Last Name: </td>
			<td><springform:input path="lastName"/></td>
		<td><springform:errors path="lastName" cssClass="error"/></td>
		</tr>
		<tr>
			<td>Age: </td>
			<td><springform:input path="age"/></td>
		<td><springform:errors path="age" cssClass="error"/></td> 
		</tr>
		<tr>
			<td><input type="submit" value="Register"></td>
			<td><input type="reset" value="Reset"></td>
		</tr>
	</table>
</springform:form>
   <p class="error">${custError}</p>
</body>
</html>