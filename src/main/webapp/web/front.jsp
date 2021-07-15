<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
 .container{
     height: 80%; 
 } 
 body{
 height: 100vh;
 }
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Todo Site</title>
</head>
<body class="bg-dark">
<nav class="navbar navbar-dark bg-dark bg-gradient">
<div class="container-fluid">
    <a class="navbar-brand">SD_7</a>
    <form class="d-flex">
    <a class="btn btn-outline-info" href="login" aria-current="page">Login</a>
    	<a class="nav-link active" aria-current="page" href="signup">Signup</a>
      <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
      <button class="btn btn-outline-success" type="submit">Search</button>
    </form>
  </div>
</nav>
<br>
<div class="container align-items-center justify-content-center position-relative">
	<div class="position-absolute top-50 start-50 translate-middle">
	
	<div class="card btn-warning bg-gradient" style="width: 22rem;">
  <div class="card-body">
    <h5 class="card-title display-5">Todo List</h5>
    <h3 class="blockquote-footer display-6">Dare to do</p>
  </div>
  <div class="card-body btn-group shadow p-3 mb-5 bg-body rounded display-5" role="group">
    <span class="btn btn-outline-info display-5">Are you a existing user</span>
    <a class="btn btn-outline-info" href="login" aria-current="page">Login</a>
  </div>
   <div class="card-body btn-group shadow p-3 mb-5 bg-body rounded" role="group">
   <span class="btn btn-outline-success display-5">Are you a new User</span>
    <a class="btn btn-outline-success" aria-current="page" href="signup">Signup</a>
  </div>
</div>
</div>
</div>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</body>
</html>