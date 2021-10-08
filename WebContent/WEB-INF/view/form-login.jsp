<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:url value="enter" var="enterLinkFilter"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="css/style.css">
<title>Login</title>
</head>
<body>

	<form action="${enterLinkFilter}" method="post">
	   
	   <div class="input-format">
	      <label  for="email">Email: </label> 
	    <input type="email" name="email" autocomplete="off" required/>
	    
	   <label  for="senha">Senha: </label> 
	    <input type="password" name="password" autocomplete="off" required/>
	 
	  <input type="hidden" name="action" value="Login"/>
	  <button class="input-button" type="submit">Login</button>
	   </div>
	
	
	
	</form>




</body>
</html>