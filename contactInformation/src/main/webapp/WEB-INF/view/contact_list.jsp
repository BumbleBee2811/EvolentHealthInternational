<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
	
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact List</title>
</head>
<body>
	<h1>Contact List</h1>
	
	<input type="button" value="Add a Customer" onclick="window.location.href='showFormForAddition';return false"/>

 	<table>
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>Phone Number</th>
			<th>Status</th>
			<th>Action</th>
		</tr>
		<c:forEach var="tempContact" items="${contact}">

			<c:url var="editLink" value="/contact/showFormForUpdate">
				<c:param name="contactId" value="${tempContact.id}" />
			</c:url>
			<c:url var="deleteLink" value="/contact/delete">
				<c:param name="contactId" value="${tempContact.id}" />
			</c:url>
			<tr>
				<td>${tempContact.firstName}</td>
				<td>${tempContact.lastName}</td>
				<td>${tempContact.email}</td>
				<td>${tempContact.phoneNumber}</td>
				<td>${tempContact.status}</td>
				<td><a href="${editLink}">Edit</a> | <a
					href="${deleteLink}"
					onclick="if(!(confirm('Are you sure you want to delete this Contact?'))) return false">Delete</a>
				</td>
			</tr>
		</c:forEach>
	</table> 
	<p><a href="${pageContext.request.contextPath}">Home</a></p>
</body>
</html>