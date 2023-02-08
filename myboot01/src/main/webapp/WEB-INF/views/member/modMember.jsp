<%@ page language="java" contentType="text/html; charset=UTF-8"
    isELIgnored="false"
    pageEncoding="UTF-8"%>
<%@ taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<% request.setCharacterEncoding("utf-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보 수정창</title>
</head>
<body>
	<form name="frmMember" method="post" action="${contextPath}/member/updateMember.do"> 
	<h1 style="text-align:center;">회원 정보 수정창</h1>
	<table align="center">
		<th>회원 정보 수정창</th>
		<tr>
			<td>아이디</td>
			<td><input type="text" name="id" readonly="readonly" value="${memInfo.id}"></td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td><input type="password" name="pwd" value="${memInfo.pwd}"></td>
		</tr>
		<tr>
			<td>이름</td>
			<td><input type="text" name="name" value="${memInfo.name}"></td>
		</tr>
		<tr>
			<td>이메일</td>
			<td><input type="text" name="email" value="${memInfo.email}"></td>
		</tr>
		<tr>
			<td>
			<input type="submit" value="수정하기" >
			<input type="reset" value="다시입력">
			</td>
		</tr>
	</table>
	</form>
</body>
</html>