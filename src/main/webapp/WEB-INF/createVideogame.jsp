<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset="UTF-8">
<title>Create Videogame</title>
</head>
<body>

<form action="saveVG" method="post">

<pre>
Id: <input type="text" name="id"/>
Name: <input type="text" name="name"/>
Description: <input type="text" name="description"/>
<input type="submit" value="save"/>
</pre>
</form>

${msg}

<a href="displayVG">View All</a>

</body>
</html>