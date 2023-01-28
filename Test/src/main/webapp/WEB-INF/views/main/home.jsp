<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
<script>
	function loginCheck(){
		document.loginForm.action = '/user/login';
	    document.loginForm.submit();
	}

</script>

	
	
	<form name="loginForm" method="post" class="loginForm" onsubmit="loginCheck()">
	
	<div class="loginFormDivision">
         <div class="idForm"><input type="text" name="userId" id="userId" class="userId" placeholder="아이디를 입력하세요."></div>
         <div class="passwdForm"><input type="password" id="userPassword" name="userPassword" class="userPassword" onkeydown="press(this.form)" placeholder="비밀번호를 입력하세요."></div>
         <input type="button" id="login_btn" class="login_btn" value="로그인" onclick="loginCheck()">
          
     </div> 
     
     </form>
	
	
	
	<div>
		<a href="/user/postgresInsert">postgres회원가입</a>
	</div>
	



</body>
</html>
