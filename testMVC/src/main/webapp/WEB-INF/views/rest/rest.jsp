<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>

<script src="http://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.js">
</script>

<script type="text/javascript">
$(function(){
	$('#btnOk').click(function(){
		$('#restform').attr('action',$('#_method').val());
		$('#restform').submit();
	});
});
</script>
</head>


<body>

<h1>${msg}</h1>

<form action="action" id="restform">
	<select id="_method">
		<option value="get">GET</option>
		<option value="post">POST</option>
		<option value="put">PUT</option>
		<option value="delete">DELETE</option>
	</select>
	
	<input type="button" value="확인" id="btnOk">
</form>

</body>
</html>