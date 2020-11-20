<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ajout</title>
</head>
<body>
<P> Please fill out this form !
<p style="color:red;">${echecAdd}</p>
<FORM METHOD="GET" action="ajouter">
<P> Please enter your login and password:
<P> name: <INPUT NAME="name" TYPE=" TEXT" SIZE=" 12" MAXLENGTH=" 20">
<P> login: <INPUT NAME="login" TYPE=" TEXT" SIZE=" 12" MAXLENGTH=" 20">
<P> password: <INPUT NAME="password" TYPE=" TEXT" SIZE=" 12" MAXLENGTH=" 20">
<P> email: <INPUT NAME="email" TYPE=" TEXT" SIZE=" 12" MAXLENGTH=" 20">
<P> ville: <INPUT NAME="ville" TYPE=" TEXT" SIZE=" 12" MAXLENGTH=" 20">
<P> Thank you! <INPUT TYPE="SUBMIT">
</body>
</html>