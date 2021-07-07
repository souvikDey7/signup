<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login page</title>
</head>
<style>
body{
    height: 100vh;
} 
.container{
    height: 100%;
}
</style>
<body class="p-3 mb-2 bg-dark bg-gradient">
<div class="container d-flex align-items-center justify-content-center ">
<div class="card" style="width: 18rem;">
  <img src="https://www.istockphoto.com/resources/images/HomePage/Hero/1204187820.jpg" class="card-img-top" alt="...">
<div class="card-body ">
<h5 class="card-title text-center">${error}</h5>
	<div class="mb-3">
<form class="login-form" action="show" method="post">
  <div class="mb-3">
    <label for="InputName" class="form-label">Name</label>
    <input type="text" class="form-control shadow p-2 mb-4 bg-body rounded" placeholder="Name" name="name" aria-describedby="emailHelp" required="" .../>
    ${status }
  </div>
  <div class="mb-3">
    <label for="InputName" class="form-label">Password</label>
    <input type="password" class="form-control" placeholder="password" name="password" required="" .../>
  </div>
  <button type="submit" class="btn btn-primary">Submit</button>
</form>
</div>
</div>
</div>
</div>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<!-- <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script> -->
</body>
</html>