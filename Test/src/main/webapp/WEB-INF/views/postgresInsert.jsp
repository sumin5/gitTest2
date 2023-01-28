<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
${member} 과연
<form action="postgresInsert" method="post">
	<input type="text" name="userId">ID <br/>
	<input type="text" name="userName">이름 <br/>
	<input type="text" name="userPassword">Password <br/>
	<select name="userAuthority">
		 <option value="1">일반</option>
		 <option value="2">관리자</option>
	</select>
	<input type="submit" value="submit">	
	
</form>


</body>
</html>
