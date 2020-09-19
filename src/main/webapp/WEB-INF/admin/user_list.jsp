<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="/WEB-INF/common/include.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User List</title>
<%@ include file="/WEB-INF/common/bootstrap.jsp" %>
</head>
<body>
<div class="container">
<h2>User List</h2>
<table class="table table-hover">
	<thead class="thead-dark">
		<tr>
		    <th>User Name</th>
		    <th>Phone No</th>
		    <th>NRC</th>
		    <th>Age</th>
		    <th>Address</th>
		    <th>Blood Type</th>
			<th>Password</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${userList}" var="u">
			<tr>
				
			    <td>${u.name }</td>
			    <td>${u.phone }</td>
			    <td>${u.nrc }</td>
			    <td>${u.age }</td>
			    <td>${u.address }</td>
			    <td>${u.bloodType }</td>
			    <td>${u.password }</td>
				
			</tr>
		</c:forEach>
	</tbody>
</table>
</div>
</body>
</html>