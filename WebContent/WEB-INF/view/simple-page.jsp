<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html>


<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="css/style.css">
<title>Simple page</title>

</head>
<body onload="">
   
   
       

	<h1 class="main-title">Welcome...${companyLogged.companyName}</h1>

 <c:import url="parcial-logout.jsp"/>

</body>
</html>