<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Videogames</title>
</head>
<body>

<h2>Videogames:</h2>

<table>

<tr>
<th>id</th>
<th>name</th>
<th>description</th>
</tr>

<c:forEach items="${videogames}" var="videogame">
<tr>
<td>${videogame.id}</td>
<td>${videogame.name}</td>
<td>${videogame.description}</td>
<td><a href="deleteVG?id=${videogame.id}">Delete</a> </td>
<td><a href="showUpdate?id=${videogame.id}">Edit</a> </td>
</tr>
</c:forEach>

</table>

<a href="showCreate">Add Videogame</a>
</body>
</html>