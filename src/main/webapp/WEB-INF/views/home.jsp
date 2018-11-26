<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
	<h1>Home</h1>

	<p>Hotel Search</p>
	<form action="/result">

		<select name="hotels">
			<c:forEach var="hotels" items="${hotellist}">

				<option>${hotels.name }</option>


			</c:forEach>
		</select> <input type="submit">


	</form>






</body>
</html>