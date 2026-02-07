<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>약품 등록</h2>

<form action="${pageContext.request.contextPath}/medicine/insert"
      method="post">

    <table border="1">
        <tr>
            <th>약품명</th>
            <td>
                <input type="text" name="medName" required>
            </td>
        </tr>

        <tr>
            <th>제조사</th>
            <td>
                <input type="text" name="manufacturer">
            </td>
        </tr>

        <tr>
            <th>재고 수량</th>
            <td>
                <input type="number" name="stockQty" min="0">
            </td>
        </tr>
    </table>

    <br>

    <button type="submit">등록</button>
    <button type="button"
            onclick="location.href='${pageContext.request.contextPath}/medicine/list'">
        목록
    </button>

</form>

</body>
</html>