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
<title>Login Page</title>
<style type="text/css">
.error {
	color: #ff0000;
	font-style: italic;
	font-weight: bold;
}
</style>
</head>
<body>
<h2>Login Page</h2>
<springform:form modelAttribute="customerloginObj" action="submitlogin" method="POST">
	<table>
		<tr>
			<td>User Id: </td>
			<td><springform:input path="userId"/></td>
		<td><springform:errors path="userId" cssClass="error"/></td>
		</tr>
		<tr>
			<td>Password: </td>
			<td><springform:input path="password"/></td>
		<td><springform:errors path="password" cssClass="error"/></td>
		</tr>
		<tr>
			<td><input type="submit" value="Login"></td>
			<td><input type="reset" value="Reset"></td>
		</tr>
	</table>
</springform:form>
<springform:form modelAttribute="customerObj" action="register" method="GET">
<table>
<tr>
<td>
<button type="submit" name="register" id="Registerbutton"
        class="btn btn-lg myBtn_accept">Register</button>
    </td>
    </tr>
    </table>

</springform:form>

   <p class="error">${custError}</p>
</body>
</html>