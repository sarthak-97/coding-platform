<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<input type="text" size="30"  name="t2" id="t5" value="  <%= request.getAttribute("t2") %> " hidden >
<input type="text" size="30"  name="t3" id="t7" value="  <%= request.getAttribute("t3") %> " hidden >
#! -*- coding: utf-8 -*-

import requests

# constants
RUN_URL = u'http://api.hackerearth.com/code/run/'
CLIENT_SECRET = 'd3b123352fe58645fa163ce7b6df947e877209ed'

source = <%=request.getParameter("t3")%>


data = {
    'client_secret': CLIENT_SECRET,
    'async': 0,
    'source': source,
    'lang': " <%=request.getAttribute("t2")%> ",
    'time_limit': 5,
    'memory_limit': 262144,
}


r = requests.post(RUN_URL, data=data)
print r.json()
</body>
</html>