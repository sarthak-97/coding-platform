<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>dashboard</title>
</head>
<body>
<div align="left">
welcome <%= request.getAttribute("t2") %> to dashboard
</div>
<div align=right>
<nav>
<a href=editor.jsp>editor page</a>
<a href=editor.jsp>edit profile</a>
<a href=editor.jsp>successful submission</a>
<a href=editor.jsp>logout</a>
</nav>
</div>

</body>
</html>