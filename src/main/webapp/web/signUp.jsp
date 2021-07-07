 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sign up page</title>
</head>
<style>
body{
    height: 100vh;
} 
.container{
    height: 100%;
}
</style>
<body class="p-3 mb-2 bg-dark">
<div class="container d-flex align-items-center justify-content-center ">
<div class="card rounded" style="width: 18rem;">
 <div class="badge bg-primary text-wrap" style="width:8rem;">
  Sign Up..
</div>
<div class="card-body">
	<div class="mb-3">
<form action="showNew" method="post" class="login-form" name="login" onsubmit="return check()">
  <div class="mb-3">
    <label for="name" class="form-label">Enter Name</label>
    <input type="text" for="name" class="form-control" name="name" aria-describedby="emailHelp" required="" .../>
    ${error}
  </div>
  <div class="mb-3">
    <label for="password" class="form-label">Enter Password</label>
    <input type="password" class="form-control"  for="password" name="password">
  </div>
    <div class="mb-3">
    <label for="password" class="form-label">Re-Enter Password</label>
    <input type="password" class="form-control"  for="password" name="password1" >
    <div id="error" class="form-text"></div>
  </div>
    <div class="mb-3">
    <input type="checkbox" onclick="on()"  > Terms & condition
    </div>
  <button type="submit" id='submit' class="btn btn-success" onclick="error()" disabled >Submit</button>
</form>
</div>
</div>
</div>
</div>

<script>
function on()
{
	if(document.getElementById("submit").disabled)
	document.getElementById("submit").disabled=false;
	else
		document.getElementById("submit").disabled=true;
	}
function check()
{ let password= document.forms["login"]["password"].value;
let password1= document.forms["login"]["password1"].value;
if(password===password1)
		return true;
	else
		{
		document.getElementById("error").innerHTML="Password incorrect!";
		return false;
		}
}
</script>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</body>
</html>