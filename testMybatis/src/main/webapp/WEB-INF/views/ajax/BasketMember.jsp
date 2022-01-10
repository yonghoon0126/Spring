<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>

<script type="text/javascript" src="../resources/js/jquery-2.1.1.js"></script>

<script type="text/javascript">
	$(function() {
		$("#btnOk").click(
				function() {
					$.getJSON('basketMemberJSON', function(data) {

						var html = '<table border="1"><tr>'
								+ '<th>번호</th><th>이름</th><th>별명</th></tr>';

						$.each(data, function() {
							html += '<tr>';
							html += '<td>' + this['num'] + '</td>';
							html += '<td>' + this['name'] + '</td>';
							html += '<td>' + this['nick'] + '</td>';
							html += '</tr>';
						});

						html += '</table>';
						$('input').hide();
						$("#result").html(html);

					});//getJSON

				});//Click

	});
</script>
</head>



<body>

	<input type="button" value="확인" id="btnOk">

	<div id="result"></div>

</body>
</html>