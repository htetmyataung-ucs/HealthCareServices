<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="/WEB-INF/common/include.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Doctor List</title>
<%@ include file="/WEB-INF/common/bootstrap.jsp" %>
</head>
<body>
<div class="container">
<h2>Doctor List</h2>
<table class="table table-hover">
	<thead class="thead-dark">
		<tr>
		    <th>Doctor Name</th>
			<th>Sama No</th>
			<th>Speciality Name</th>
			<th>Photo</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${doctor}" var="d">
			<tr>
				<td>${d.name }</td>
				<td>${d.sama_no }</td>
				<td>${d.speciality.name }</td>
			   <td><img src="/images/${d.photoPath}" width="80" height="80" style="border:1px solid red;" /></td>	
			</tr>
		</c:forEach>
	</tbody>
</table>
</div>
</body>
</html>