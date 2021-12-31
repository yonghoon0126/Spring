<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
	<h2>글쓰기 페이지</h2>
	<hr width="500" />
	<a href="list">목록</a> 
	<table width="500" cellpadding="0" cellspacing="0" border="1">
		<form:form commandName="BVO" action="writeOk" method="post" >
			<tr>
				<td>작성자</td>
				<td><form:input path="bName" size="20"/></td>
			</tr>
		    <tr>
				<td>제목</td>
				<td><form:input path="bSubject" size="50"/></td>
			</tr>
			<tr>
				<td>내용</td>
				<td><form:textarea path="bContent" cols="60" rows = "8"/></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="등록"/></td>
			</tr>			
		</form:form>	
	</table>
</div>	
</body>
</html>