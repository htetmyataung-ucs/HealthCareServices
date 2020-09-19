<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="/WEB-INF/common/include.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>City List</title>
<%@ include file="/WEB-INF/common/bootstrap.jsp" %>
</head>
<body>
<div class="container">
<h2>City List</h2>
<table class="table table-hover">
	<thead class="thead-dark">
		<tr>
			<th>Name</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${city}" var="c">
			<tr>
				<td>${c.name }</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
</div>
</body>
</html>