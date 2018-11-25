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
<form action ="/result">

<select path="Hotels" items="${hotel}"/>

    <option items=${hotel }>Volvo</option>
    <option value="saab">Saab</option>
    <option value="fiat">Fiat</option>
    <option value="audi">Audi</option>
    
  </select>
  <br><br>
  
  
  <input type="submit">


</form>






</body>
</html>