<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Associer une adresse à une personne</h3>
	<form action="controleur" method="Post" >
	<label>id de la personne:</label>
	<input type="text" name="idP"><br>
	<label>id de l'adresse:</label>
	<input type="text" name="idA"><br>
	<input type="submit" value="ok">
	<input type="hidden" name="id" value="4" />
	</form>
	
</body>
</html>