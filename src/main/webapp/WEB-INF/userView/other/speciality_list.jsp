<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="/WEB-INF/common/include.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Speciality List</title>
<%@ include file="/WEB-INF/common/bootstrap.jsp" %>
</head>
<body>
<div class="container">
<h2>Speciality List</h2>
<table  class="table table-hover">
	<thead class="thead-dark">
		<tr>
			<th>Speciality Name</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${speciality}" var="s">
			<tr>
				<td>${s.name }</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
</div>
</body>
</html>