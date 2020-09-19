<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ include file="/WEB-INF/common/include.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Article List</title>
<%@ include file="/WEB-INF/common/bootstrap.jsp" %>
</head>
<body>
<div class="container">
<h2>Article List</h2>
<table class="table table-hover">
	<thead class="thead-dark">
		<tr>
			<th>Name</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${articles}" var="art">
			<tr>
				<td>${art.name }</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
</div>
</body>
</html>