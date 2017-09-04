<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
   
    <title>hello</title>
    
</head>
<body>
<h2>Register</h2>
<form action="/employee1/save" method="POST">
    <table >
        <tbody>
           
            <tr><td>Firstname</th><td><input type="text" name="firstname" required="required"></td></tr>
            <tr><td>Lastname</th><td><input type="text" name="lastname" required="required"></td></tr>
            <tr><td>Phonenumber</th><td><input type="text" name="phonenumber" required="required"></td></tr>
            <tr><td>Email</td><td><input type="email" name="email" required="required"></td></tr>  
            <tr><td>Duration</td><td><input type="text" name="duration" required="required"></td></tr>  
             <tr><td>Title</td><td><input type="text" name="title" required="required"></td></tr>  
             <tr><td>Company</td><td><input type="text" name="company" required="required"></td></tr>  
          
           <tr><td><input type="submit" value="Register" class="btn btn-success"></tr>
        </tbody>
    </table>
</form>


<script type="application/javascript" src="js/jquery.js"></script>



</body>
</html>