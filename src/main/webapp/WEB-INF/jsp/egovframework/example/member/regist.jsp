<%@ page contentType="text/html; charset=UTF-8"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
function regist(){
	form1.action="/member/regist";	
	form1.submit();
}
</script>
</head>
<body>
	<form name="form1" method="post">
		<input type="text" name="id"/>
		<input type="text" name="pass"/>
		<input type="text" name="name"/>
		<button type="button" onClick="regist()">등록</button>
	</form>
</body>
</html>