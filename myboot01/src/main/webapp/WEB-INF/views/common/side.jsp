<%@ page language="java" contentType="text/html; charset=UTF-8"
    isELIgnored="false"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
	request.setCharacterEncoding("utf-8");
%>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<style>
	.no-underline{
		text-decoration:none;
	}
</style>
<meta charset="UTF-8">
<title>사이드 메뉴</title>
</head>
<body>
	<h1>사이드 메뉴</h1>
	<h1>
		<a href="${contextPath}/member/listMembers.do" class="no-underline">회원관리</a><br>
		<a href="${contextPath}/board/listBoards.do" class="no-underline">게시판관리</a><br>
		<a href="#" class="no-underline">상품관리</a><br>
	</h1>
</body>
</html>