<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align=right>
<nav>
<a href="quespage.jsp#ques">ques page</a>
<a href=#>edit profile</a>
<a href=#>successful submission</a>
<a href=#>logout</a>
</nav>
</div>
<div>
<form name=frm action="hello">
<%= request.getParameter("t2") %> 
<br>
enter your name<input type=text name=t1><br>
enter your admno<input type=text name=t2><br>
enter you year<input type=text name=t3><br>
<input type="submit">
</form>
</div>
</body>
</html>