<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta  charset="UTF-8">
<title>답글 페이지</title>
</head>
<body>
<div align="center">
	<hr width="500" color="green">
	<h2>답글 페이지</h2>
	<hr width="500" color="green">

	<table width="500" cellpadding="0" cellspacing="0" border="1" >
		<form action="replyOk" method="post">
			<input type="hidden" name="bNo" value="${replyForm.bNo}" />
			<input type="hidden" name="bGroup" value="${replyForm.bGroup}" />
			<input type="hidden" name="bStep" value="${replyForm.bStep}" />
			<input type="hidden" name="bIndent" value="${replyForm.bIndent}" />
			
			<tr>
				<td>번호</td>
				<td>${replyForm.bNo}</td>
			</tr>
			<tr>
				<td>조회수</td>
				<td>${replyForm.bHit}</td>
			</tr>
			<tr>
				<td>작성자</td>
				<td><input type="text" name="bName" /></td>
			</tr>
			<tr>
				<td>제목</td>
				<td><input type="text" name="bSubject" value="[re] ${replyForm.bSubject}" readonly/></td>
			</tr>
			<tr>
				<td>답변</td>
				<td><textarea rows="10" name="bContent"></textarea></td>
			</tr>
			<tr>
				<td colspan = "2" align="center">
					<input type="submit" value="답변전송">&nbsp;&nbsp;&nbsp;<a href="list">목록으로</a>
				</td>
			</tr>
		</form>	
	</table>
</div>
</body>
</html>