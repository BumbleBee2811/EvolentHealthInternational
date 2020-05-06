<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isELIgnored="false"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact Form</title>
</head>
<body>
	<h2>Add/Edit Contacts</h2>
	
	<form:form action="saveContact" modelAttribute="contact" method="POST">
		
			<form:hidden path="id"/>
			<table>
				<tbody>
					<tr>
						<td><label>First Name : </label></td>
						<td><form:input  title="Enter First Name" path="firstName"/></td>
						<td><form:errors path="firstName" cssClass="error"/></td>
					</tr>
					<tr>
						<td><label>Last Name : </label></td>
						<td><form:input title="Enter Last Name" path="lastName"/></td>
						<td><form:errors path="lastName" cssClass="error"/></td>
					</tr>
					<tr>
						<td><label>Email : </label></td>
						<td><form:input title="Enter Email Address" path="email"/></td>
						<td><form:errors path="email" cssClass="error"/></td>
					</tr>
					<tr>
						<td><label>Phone Number : </label></td>
						<td><form:input maxlength="10" title="Enter Phone Number" path="phoneNumber"/></td>
						<td><form:errors path="phoneNumber" cssClass="error"/></td>
					</tr>
					<tr>
						<td><label>Status : </label></td>
						<td>Active<form:radiobutton path="status" value="Active"/></td>
						<td>Inactive<form:radiobutton path="status" value="Inactive"/></td>
						<td><form:errors path="status" cssClass="error"/></td>
					</tr>
					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Save"/></td>
					</tr>
				</tbody>
			</table>
		
		</form:form>
		
		<p><a href="${pageContext.request.contextPath}/contact/getContacts">Back to List</a></p>
</body>
</html>