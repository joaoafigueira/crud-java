<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:url value="/enter" var="enterLinkFilter" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="css/style.css">
<title>Change company</title>
</head>
<body>

<%response.setHeader("Cache-control", "no-store, must-revalidate"); %> 

 <form action="${enterLinkFilter}" method="post">
           
      
        <label style="margin-left:430px;" for="name">Company's Name </label> 
        <input style="margin-top: 250px;" name="name" value="${company.companyName}" />  
        <Input type="hidden" name="id" value="${company.id}"/>
        <Input type="hidden" name="action" value="ChangeCompany"/>
        <Input  type="submit" value="change" />
        
 
 </form>


</body>
</html>