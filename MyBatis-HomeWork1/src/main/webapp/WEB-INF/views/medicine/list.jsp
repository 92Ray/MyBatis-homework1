<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>약품 목록</h2>

	<table border="1">
		<tr>
			<th>ID</th>
			<th>약품명</th>
			<th>제조사</th>
			<th>재고</th>
			<th>등록일</th>
		</tr>

		<c:forEach var="m" items="${list}">
			<tr>
				<td>${m.medId}</td>
				<td>${m.medName}</td>
				<td>${m.manufacturer}</td>
				<td>${m.stockQty}</td>
				<td>${m.regDate}</td>
			</tr>
		</c:forEach>
	</table>
	<form action="${pageContext.request.contextPath}/medicine/list"
		method="get">
		약품명: <input type="text" name="medName" value="${medicine.medName}">

		제조사: <input type="text" name="manufacturer"
			value="${medicine.manufacturer}">

		<button type="submit">검색</button>
	</form>

</body>
</html>