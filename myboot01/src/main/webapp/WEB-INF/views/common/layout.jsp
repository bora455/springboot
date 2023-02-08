<%@ page language="java" contentType="text/html; charset=UTF-8"
    isELIgnored="false"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- 기준이 되는 jsp에 반드시 필요 -->
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%
	request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
	#container{
		width: 100%;
		margin: 0px auto;
		text-align: center;
		border: 0px solid #bcbcbc;
	}
	#header{
		padding: 5px;
		margin-bottom: 5px;
		border: 0px solid #bcbcbc;
		background-color:#B1D3C5;
	}
	#sidebar-left{
		width: 15%;
		height: 700px;
		padding: 5px;
		margin-right: 5px;
		margin-bottom: 5px;
		float:left;
		background-color:#E1F1E7;
		border: 0px solid #bcbcbc;
		font-size: 10px;
	}
	#content{
		width: 75%;
		padding: 5px;
		margin-right: 5px;
		float: left;
		border: 0px solid #bcbcbc;
	}
	#footer{
		clear: both;
		padding: 5px;
		border: 0px solid #bcbcbc;
		background-color:#B1D3C5;
	}
</style>
<title><tiles:insertAttribute name="title"/></title>
</head>
<body>
	<div id="container">
		<div id="header">
			<tiles:insertAttribute name="header"/>
		</div>
		<div id="sidebar-left">
			<tiles:insertAttribute name="side"/>
		</div>
		<div id="body">
			<tiles:insertAttribute name="body"/>
		</div>
		<div id="footer">
			<tiles:insertAttribute name="footer"/>
		</div>
	</div>
</body>
</html>