<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="/WEB-INF/common/include.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hospital List</title>
<%@ include file="/WEB-INF/common/bootstrap.jsp" %>
</head>
<body>
<div class="container">
<h2>Hospital List</h2>
<table class="table table-hover">
	<thead class="thead-dark">
		<tr>
		    <th>Hospital Name</th>
			<th>Hospital Category Name</th>
			<th>Hospital Type Name</th>
			<th>Township Name</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${hospital}" var="h">
			<tr>
				<td>${h.name }</td>
				<td>${h.hospitalCategoryName }</td>
			    <td>${h.hospitalTypeName }</td>
				<td>${h.townShipName }</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
</div>
</body>
</html>