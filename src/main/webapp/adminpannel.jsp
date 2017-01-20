<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form name=frm action=FileUploadServlet method=post enctype="multipart/form-data">
enter question title<input type=text name=t1><br>
enter ques detail<textarea name=t2>
</textarea><br>
enter constraints<textarea name=t3>

</textarea><br>
enter input format<textarea name=t7>

</textarea><br>
enter sample test case<textarea name=t4>
</textarea><br>
enter input test case<input type=file name=file><br>
enter output test case<input type=file name=file1 ><br>
<input type=submit>
</form>
</body>
</html>