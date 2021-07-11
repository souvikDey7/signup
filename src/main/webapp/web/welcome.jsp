<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
.container{
    height: 100%;
}
body{
    height: 100vh;
} 
</style>
</head>
<body class="bg-dark">
<!-- <div class="container-fluid"> -->
<!-- <nav class="navbar navbar-dark bg-dark"> -->
<!--     	<a class="navbar-brand nav-item">SD_7</a> -->
<!--     	<form class="d-flex justify-content-center"> -->
<%--     		<a class="navbar-brand nav" aria-current="page">${status}</a> --%>
<%--     		<a class=" navbar-brand active" aria-current="page" >${name}</a> --%>
<%--       		<a class="navbar-brand active" >${m}</a> --%>
<!--    	     </form> -->
<!--  </nav> -->
<!--  </div> -->

<div class="container align-items-center justify-content-center ">
<form  action="save" method="post">
	<div class="card w-75 d-grid gap-2 col-6 mx-auto">
  		<div class="card-body">
    			<h5 class="card-title display-5">Todo update</h5>
    			<h3 class="blockquote-footer display-6">write whatever u want next to do..</h3>
   				 <div class="d-grid gap-2">
    					<textarea class="d-grid gap-2 shadow p-3 mb-5 bg-body rounded"  name="todo" type="textbox" value="${i}" required="" ></textarea>
    			</div>
    			<button class="btn btn-outline-success btn-lg">Save</button>
  		</div>
	</div>
</form>
		<form action="todo" method="get">
		<div class="d-grid gap-2 w-75 col-6 mx-auto">
			<input class="btn btn-lg btn-outline-info" type="submit" value="Check List">
		</div>
		</form>
</div>

</body>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</html>


