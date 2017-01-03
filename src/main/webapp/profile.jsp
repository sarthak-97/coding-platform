
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
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
<a href=profile.jsp>edit profile</a>
<a href=#>successful submission</a>
<a href=#>logout</a>
</nav>
</div>
<div>
</div>





<br>
<form name=frm action="hello">
enter your name<input type=text name=t1 value="<%= request.getAttribute("t4") %>"><br>


enter your admno<input type=text name=t2><br>
enter you year<input type=text name=t3><br>
<input type="submit">
</form>
</div>
</body>
</html>