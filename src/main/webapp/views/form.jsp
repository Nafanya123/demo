<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="/resources/css/home.css" rel="stylesheet"/>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<body>
<center>
	<form:form method="POST" commandName="city" action="result" class="box login">

		<fieldset class="boxBody" style="width: 200px;">

			<form:label path="cityName">Название города:</form:label>
			<form:input path="cityName" />

		</fieldset>

		<footer>
			<input type="submit" class="btnLogin" value="Добавить" tabindex="4">
		</footer>


	</form:form>
	</center>
</body>
</html>