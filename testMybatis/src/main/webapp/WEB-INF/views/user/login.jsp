<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript" src="../resources/js/jquery-2.1.1js"></script>
<script type="text/javascript">
	$(function(){
		$('#btnRegist').click(function(){
			location.href='regist';
		});
	});
</script>

</head>



<body>

<form action="login" method="post">
	
	<table border="1">
		<caption>로그인</caption>
		
		<tr>
			<td>아이디</td>
			<td>
				<input type="text" name="user_id" autofocus> 
			</td>
		</tr>
		
		<tr>
			<td>비밀번호</td>
			<td>
				<input type="password" name="user_pwd"> 
			</td>
		</tr>
		
		<tr>
			<td colspan="2">
				<input type="password" name="user_pwd"> 
			</td>
		</tr>
	</table>
</form>


</body>
</html>