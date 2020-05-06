<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isELIgnored="false"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
<p><a href="${pageContext.request.contextPath}/contact/getContacts">Show the list of Contacts</a></p>
</body>
</html>