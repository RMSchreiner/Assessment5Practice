<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2> Select a door to receive a prize!</h2>

<form action="/choice" method = "Post">
  <input type="radio" id="Door#1" name="door" value="Door#1">
  <label for="Door#1">Door#1</label><br>
  <input type="radio" id="Door#2" name="door" value="Door#2">
  <label for="Door#2">Door#2</label><br>
  <input type="submit">
</form>
</body>
</html>