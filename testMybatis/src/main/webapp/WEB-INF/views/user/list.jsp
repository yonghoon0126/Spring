<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>


<body>

	<table border="1">
		<thead>
			<tr>
				<th>#번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>작성일</th>
				<th>수정일</th>
			</tr>
		</thead>
	
		<c:forEach items="${list} var="board">
			<tr>
				<td><c:out value="$(board.bno)"/></td>
				<td><c:out value="$(board.title)"/></td>
				<td><c:out value="$(board.writer)"/></td>
				<td><fmt:formatDate pattern="yyyy-MM-dd" value="${board.regdate}"/></td>
				<td><fmt:formatDate pattern="yyyy-MM-dd" value="${board.update}"/></td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>