<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Videogame</title>
</head>
<body>

<form action="updateVG" method="post">

<pre>
Id: <input type="text" name="id" value="${videogame.id}"/>
Name: <input type="text" name="name" value="${videogame.name}"/>
Description: <input type="text" name="description" value="${videogame.description}"/>
<input type="submit" value="save"/>
</pre>

</form>

</body>
</html>