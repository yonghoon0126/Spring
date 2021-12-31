<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>게시판 리스트</title>
</head>
<body>
<div align="center">
	<h2>>>>>> 게시판 리스트 <<<<<</h2>
		
	<table border="1" cellpadding="0" cellspacing="0" width="500">
		<tr>
			<td>번호</td>
			<td>제목</td>
			<td>작성자</td>
			<td>날짜</td>
			<td>조회수</td>
		</tr>
		<!-- 게시글 목록 가져오기 -->
		<c:forEach items="${list}" var="vo">
			<tr>
				<td>${vo.bNo}</td>
				<td>
					<c:forEach begin="1" end="${vo.bIndent}">ㄴ</c:forEach>
					<a href="contentView?bNo=${vo.bNo}">${vo.bSubject}</a>
				</td>
				<td>${vo.bName}</td>
				<td>${vo.bDate}</td>
				<td>${vo.bHit}</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="5" align="center"><a href="writeForm">글쓰기</a></td>
		</tr>
	</table>	

</div>
</body>
</html>