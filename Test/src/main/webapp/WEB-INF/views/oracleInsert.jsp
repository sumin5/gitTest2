<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
	<title>Home</title>
</head>
<body>

<form action="oracleInsert" method="post">
	<input type="text" name="id">ID <br/>
	<input type="text" name="memberId">memberId <br/>
	<input type="text" name="memberPassword">memberPassword <br/>
	<input type="text" name="memberName">memberName <br/>
	<input type="text" name="memberPhone">memberPhone <br/>
	<input type="text" name="memberEmail">memberEmail <br/>
	<input type="submit" value="submit">	
</form>


</body>
</html>
