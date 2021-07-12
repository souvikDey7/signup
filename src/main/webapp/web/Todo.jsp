<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
body{
    height: 100vh;
} 
.container{
    height: 100%;
}
</style>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Todo Site</title>
</head>
<body class="p-3 mb-2 bg-dark">
	<div class="container d-flex  img-fluid align-items-center justify-content-center ">
		<div class="card-body">
			<table class="table table-dark table-hover">
				<th>
					<span class="display-3">ToDo list</span>
				<td class="align-middle">
						<form action="save" method="post" >
							<button name="todo" value="null" class="btn btn-outline-warning display-8 shadow"  aria-current="page">Home</button>
						</form>
				</td>
				</th>
					<c:forEach var="i" items="${list}">
 					<tr>
						 <td style="max-width: 400px;" class="lead d-inline-block text-truncate">${i.getValue()}</td>
 						<form action="delete" method="post">
 							<td><button name="delete" value="${i.getKey()}" class="btn btn-danger">Delete</button></td>
 						</form>
 						<form action="update" method="post">
 							<td><button name="update" value="${i.getKey()}" class="btn btn-success">Update</button></td>
 						</form>
 					</tr>
					</c:forEach>
			</table>
		</div>
	</div>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</body>
</html>