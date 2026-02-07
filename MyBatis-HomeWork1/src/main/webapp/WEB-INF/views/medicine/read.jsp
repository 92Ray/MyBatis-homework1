<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>약품 상세</h2>

	<table border="1">
		<tr>
			<th>ID</th>
			<td>${medicine.medId}</td>
		</tr>
		<tr>
			<th>약품명</th>
			<td>${medicine.medName}</td>
		</tr>
		<tr>
			<th>제조사</th>
			<td>${medicine.manufacturer}</td>
		</tr>
		<tr>
			<th>재고</th>
			<td>${medicine.stockQty}</td>
		</tr>
		<tr>
			<th>등록일</th>
			<td>${medicine.regDate}</td>
		</tr>
	</table>

	<br>
	<button
		onclick="location.href='${pageContext.request.contextPath}/medicine/list'">목록</button>

	<button
		onclick="location.href='${pageContext.request.contextPath}/medicine/update?medId=${medicine.medId}'">수정</button>

	<button
		onclick="location.href='${pageContext.request.contextPath}/medicine/delete?medId=${medicine.medId}'">삭제</button>



</body>
</html>