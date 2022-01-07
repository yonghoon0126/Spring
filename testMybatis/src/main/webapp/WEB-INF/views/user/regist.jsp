<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style type="text/css">
	img{
		width:200px; height:200px;
	}
</style>

<script type="text/javascript" src="../resources/js/jquery-2.1.1js"></script>

<script type="text/javascript">
	$(function(){
		$('#btnSearchZipcode').click(function(){
			window.open('zipcode','zipcode','width=400,height=400');
		});
	});

</script>

</head>



<body>

<form:form method="post" commandName="userVO" action="regist">

	<table>
		<caption>회원가입</caption>
		
		<tr>
			<td>아이디</td>
			<td><input type="text" name="user_id" value="${userVO.user_id}">
				<div id="user_id_msg">
					<form:errors path="user_id"/>
				</div>
			</td>
		</tr>
		
		<tr>
			<td>비밀번호</td>
			<td><input type="password" name="user_pwd" value="${userVO.user_pwd}">
				<div id="user_id_msg">
					<form:errors path="user_pwd"/>
				</div>
			</td>
		</tr>
		
		
		<tr>
			<td>비밀번호 질문</td>
			<td><input type="password" name="user_pwd_hint" value="${userVO.user_pwd_hint}">
				<div id="user_id_msg">
					<form:errors path="user_pwd_hint"/>
				</div>
			</td>
		</tr>
		
		
		<tr>
			<td>비밀번호 답</td>
			<td><input type="password" name="user_pwd_answer" value="${userVO.user_pwd_answer}">
				<div id="user_id_msg">
					<form:errors path="user_pwd_answer"/>
				</div>
			</td>
		</tr>
		
		<tr>
			<td>성별</td>
			<td><input type="radio" name="user_gender" value="1">남자
				<input type="radio" name="user_gender" value="2">여자
			
				<div id="user_id_msg">
					<form:errors path="user_gender"/>
				</div>
			</td>
		</tr>
		
		<tr>
			<td>이메일</td>
			<td><input type="text" name="user_email" value="${userVO.user_email}">
				<div id="user_id_msg">
					<form:errors path="user_email"/>
				</div>
			</td>
		</tr>
		
		<tr>
			<td>전화</td>
			<td><input type="text" name="user_phone" value="${userVO.user_phone}">
				<div id="user_id_msg">
					<form:errors path="user_phone"/>
				</div>
			</td>
		</tr>
		
		<tr>
			<td>우편번호</td>
			<td><input type="text" name="user_zipcode" id="user_zipcode" value="${userVO.user_zipcode}">
				<input type="button" value="검색" id="btnSearchZipcode">
				<div id="user_id_msg">
					<form:errors path="user_zipcode"/>
				</div>
			</td>
		</tr>
		
		<tr>
			<td>주소</td>
			<td><input type="text" name="user_addr1" id="user_addr" value="${userVO.user_addr1}">
				<div id="user_id_msg">
					<form:errors path="user_addr1"/>
				</div>
			</td>
		</tr>
		
		<tr>
			<td>상세주소</td>
			<td><input type="text" name="user_addr2" value="${userVO.user_addr2}">
				<div id="user_id_msg">
					<form:errors path="user_addr2"/>
				</div>
			</td>
		</tr>
		
		<tr>
			<td colspan="2">
				<input type="submit" value="가입완료">
			</td>
		</tr>
	</table>
</form:form>

<br>

<h1>나는 해바라기 지요.</h1>

	<img alt="그림을 넣어보자" src="../resources/image/SUnflower.jpg">
	<a href="../ajax/basketMember">바구니</a>

</body>
</html>