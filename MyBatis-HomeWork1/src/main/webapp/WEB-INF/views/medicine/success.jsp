<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>성공</title>
</head>
<body>
    <h2 style="color: green">${msg}</h2>
    <button onclick="location.href='${pageContext.request.contextPath}${redirectUrl}'">이동</button>
</body>
</html>
