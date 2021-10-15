<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

<c:url value="enter" var="enterLinkFilter"/>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="css/style.css">
<title>Register</title>
</head>
<body>



  <form action="${enterLinkFilter }" method="post">
  
      <div class="input-format">
           <label for="email">Email: </label>
        <input type="email" name="email" autocomplete="off" required> 
      
        <label for="companyName">Co name: </label>
        <input type="text" name="companyName" autocomplete="off" required> 
      
        <label for="passoword">Password: </label>
        <input type="password" name="passoword" autocomplete="off" required> 
      
      <input type="hidden" name="action" value="NewCompany">
      <button class="input-button" type="submit">Register</button>
      </div>
   <a  class="page-links" href="/simple-crud-java/enter?action=LoginForm">Login</a>
  </form>

         



</body>
</html>