<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>login</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>
<body>
	<form action="">
		<table>
			<tr>
				<th>아이디</th>
				<td>
					<input type="text" id="user_id" name="user_id">
				</td>
			</tr>
			<tr>
				<th>비밀번호</th>
				<td>
					<input type="text" id="user_id" name="user_id">
				</td>
			</tr>
			<tr>
				<td><input type="button" id="cre_btn" value="회원가입"></td>
				<td><input type="button" id="login_btn" value="로그인"></td>
			</tr>
		</table>
	</form>
</body>
</html>