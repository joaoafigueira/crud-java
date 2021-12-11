<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Manage Company</title>
</head>
<body>

	<h1>Welcome!<c:import url="parcial-logout-admin.jsp" /></h1>

    <ul>
         <c:forEach items="${companys}" var="company">
         <li>
         ${company.companyName}
         <a href="/simple-crud-java/enter?action=ShowCompany&id=${company.id}">Edit</a>
         <a href="/simple-crud-java/enter?action=CompanyRemove&id=${company.id}">Remove</a>
         
         
         </li>
         </c:forEach>    
    
    
    </ul>


</body>
</html>