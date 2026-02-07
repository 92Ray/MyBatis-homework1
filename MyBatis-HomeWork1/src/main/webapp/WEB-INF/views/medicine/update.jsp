<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>약품 수정</h2>

	<form action="${pageContext.request.contextPath}/medicine/update"
		method="post">

		<input type="hidden" name="medId" value="${medicine.medId}">

		<table border="1">
			<tr>
				<th>약품명</th>
				<td><input type="text" name="medName"
					value="${medicine.medName}" required></td>
			</tr>

			<tr>
				<th>제조사</th>
				<td><input type="text" name="manufacturer"
					value="${medicine.manufacturer}"></td>
			</tr>

			<tr>
				<th>재고 수량</th>
				<td><input type="number" name="stockQty"
					value="${medicine.stockQty}" min="0"></td>
			</tr>
		</table>

		<br>
		<button type="submit">수정</button>
		<button type="button"
			onclick="location.href='${pageContext.request.contextPath}/medicine/read?medId=${medicine.medId}'">
			취소</button>

	</form>

</body>
</html>