<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="css/style.css">
<title>Manage Company</title>
</head>
<body>

<%response.setHeader("Cache-control", "no-store, must-revalidate"); %> 
    
	<h1>Welcome Admin!<c:import url="parcial-logout-admin.jsp"/></h1>
    <h3 >Manage the companys:</h3>
    <ul>
         <c:forEach items="${companys}" var="company">
         <li class="company-list">
         ${company.companyName}
         <a href="/simple-crud-java/enter?action=ShowCompany&id=${company.id}">[EDIT</a>
         <a href="/simple-crud-java/enter?action=CompanyRemove&id=${company.id}">REMOVE]</a>
         
         
         </li>
         </c:forEach>    
    
    
    </ul>


</body>
</html>