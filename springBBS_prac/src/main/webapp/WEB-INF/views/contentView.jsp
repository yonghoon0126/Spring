<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>글내용 보기</title>
</head>
<body>
	<div align="center">
		<h2>글내용 확인</h2>
		<hr width="500" color="green" />
		<table width="500" cellpadding="0" cellspacing="0" border="1">
		<form action="modify" method="post">
			<input type="hidden" name="bNo" value="${contentView.bNo}"/> 
			<tr>
				<td>번호</td>
				<td>${contentView.bNo}</td>
			</tr>
			<tr>
				<td>조회수</td>
				<td>${contentView.bHit}</td>
			</tr>
			<tr>
				<td>작성자</td>
				<td><input type="text" name="bName" value="${contentView.bName}"/></td>
			</tr>
			<tr>
				<td>제목</td>
				<td><input type="text" name="bSubject" value="${contentView.bSubject}" /></td>
			</tr>
			<tr>
				<td>내용</td>
				<td><textarea rows="10" name="bContent">${contentView.bContent}</textarea></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="수정하기"/>
								&nbsp;&nbsp;&nbsp;<a href ="list">목록보기</a>
								&nbsp;&nbsp;&nbsp;<a href="delete?bNo=${contentView.bNo}">삭제</a>
								&nbsp;&nbsp;&nbsp;<a href="replyForm?bNo=${contentView.bNo}">답변</a>
				</td>
			</tr>
		</form>		
		</table>	
		
	
	</div>
</body>
</html>