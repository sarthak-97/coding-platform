<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<script>



RUN_URL = 'http://api.hackerearth.com/code/run/'
CLIENT_SECRET = '5db3f1c12c59caa1002d1cb5757e72c96d969a1a'

source = "<%= request.getAttribute("t2") %>"

data = {
    'client_secret': CLIENT_SECRET,
    'async': 0,
    'source': source,
    'lang': "<%= request.getAttribute("t1") %>",
    'time_limit': 5,
    'memory_limit': 262144,
}


r = requests.post(RUN_URL, data=data)

</script>
hello api
System.out.println( r.json());
</body>
</html>