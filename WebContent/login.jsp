<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<P> Please fill out this form with your name. Thanks!
<p style="color:red;">${echec}</p>
<FORM METHOD="GET" action="login">
<P> Please enter your login and password:
<P> login: <INPUT NAME="login" TYPE=" TEXT" SIZE=" 12" MAXLENGTH=" 20">
<P> password: <INPUT NAME="password" TYPE=" TEXT" SIZE=" 12" MAXLENGTH=" 20">
<P> Thank you! <INPUT TYPE="SUBMIT">
</FORM>
</body>
</html>