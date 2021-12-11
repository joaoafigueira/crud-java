<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:url value="/enter" var="enterLinkFilter" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Change company</title>
</head>
<body>

 <form action="${enterLinkFilter}" method="post">
           
        Name: <input type="text" name="name" value="${company.companyName}" />  
        <Input type="hidden" name="id" value="${company.id}"/>
        <Input type="hidden" name="action" value="ChangeCompany"/>
        <Input type="submit" />
        
 
 </form>


</body>
</html>