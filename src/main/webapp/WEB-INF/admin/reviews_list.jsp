<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="/WEB-INF/common/include.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reviews List</title>
<%@ include file="/WEB-INF/common/bootstrap.jsp" %>
</head>
<body>
<div class="container">
<h2>Review List</h2>
<table class="table table-hover">
	<thead class="thead-dark">
		<tr>
			<th>Hospital Name</th>
			<th>Description</th>
			<th>Rating</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${reviewList}" var="r">
			<tr>
				<td>${r.hospitalName}</td>
				<td>${r.description }</td>
				<td>${r.rating }</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
</div>
</body>
</html>