<<<<<<< HEAD
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="google-signin-client_id" content="30081514308-nsdkis6qpuda4f9vr2mb2d3aeg0otqgq.apps.googleusercontent.com">
<script src="https://apis.google.com/js/platform.js" async defer></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
</head>
<script>
function onSignIn(googleUser) {
  var profile = googleUser.getBasicProfile();
  console.log('ID: ' + profile.getId());
  // Do not send to your backend! Use an ID token instead.
  console.log('Name: ' + profile.getName());
  console.log('Image URL: ' + profile.getImageUrl());
  console.log('Email: ' + profile.getEmail());
 
  var id_token = googleUser.getAuthResponse().id_token;
  console.log("ID Token: " + id_token);
 
  var redirectUrl ='hello';
  
  var form = $('<form action="' + redirectUrl + '" method="post">' +
                   '<input type="text" name="user_id" value="' +
                    googleUser.getAuthResponse().id_token + '" />' +
                                                         '</form>');
  $('body').append(form);
  form.submit();

 
}
</script>
<body>
<div class="g-signin2" data-onsuccess="onSignIn"></div>

<a href="#" onclick="signOut();">Sign out</a>
<br>
<%  %>
<script>
  function signOut() {
    var auth2 = gapi.auth2.getAuthInstance();
    auth2.signOut().then(function () {
      console.log('User signed out.');
    });
  }
</script>
<br>

</body>
=======
<<<<<<< HEAD
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="google-signin-client_id" content="50376313406-hp2i1too98fc8nbgpd9cd0bvs0j4s0qj.apps.googleusercontent.com">
<script src="https://apis.google.com/js/platform.js" async defer></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
</head>
<script>
function onSignIn(googleUser) {
  var profile = googleUser.getBasicProfile();
  console.log('ID: ' + profile.getId());
  // Do not send to your backend! Use an ID token instead.
  console.log('Name: ' + profile.getName());
  console.log('Image URL: ' + profile.getImageUrl());
  console.log('Email: ' + profile.getEmail());
  var redirectUrl = 'login';
  var form = $('<form action="' + redirectUrl + '" method="post">' +
                      '<input type="text" name="t2" value="' +
                       googleUser.getAuthResponse().id_token + '" />' +
                                                            '</form>');
$('body').append(form);
form.submit();
 
}
</script>
<body>
<div class="g-signin2" data-onsuccess="onSignIn"></div>

<a href="#" onclick="signOut();">Sign out</a>
<script>
  function signOut() {
    var auth2 = gapi.auth2.getAuthInstance();
    auth2.signOut().then(function () {
      console.log('User signed out.');
    });
  }
</script>
<br>

</body>
=======
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="google-signin-client_id" content="30081514308-nsdkis6qpuda4f9vr2mb2d3aeg0otqgq.apps.googleusercontent.com">
<script src="https://apis.google.com/js/platform.js" async defer></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
</head>
<script>
function onSignIn(googleUser) {
  var profile = googleUser.getBasicProfile();
  console.log('ID: ' + profile.getId());
  // Do not send to your backend! Use an ID token instead.
  console.log('Name: ' + profile.getName());
  console.log('Image URL: ' + profile.getImageUrl());
  console.log('Email: ' + profile.getEmail());
  $.ajax({
		url: 'profile.jsp',
		type: 'POST',
		dataType : "html",
		data: {
			'user_id':profile.getName(),
			'user_email':profile.getEmail(),
			'user_img':profile.getImageUrl(),
			
		},
		
		success: function(data){
			console.log(data);
			location.href="profile.jsp";
			
						
		}
	});

 
}
</script>
<body>
<div class="g-signin2" data-onsuccess="onSignIn"></div>

<a href="#" onclick="signOut();">Sign out</a>
<script>
  function signOut() {
    var auth2 = gapi.auth2.getAuthInstance();
    auth2.signOut().then(function () {
      console.log('User signed out.');
    });
  }
</script>
<br>

</body>
>>>>>>> refs/remotes/origin/master
>>>>>>> branch 'master' of https://github.com/sarthak-97/google-login.git
</html>