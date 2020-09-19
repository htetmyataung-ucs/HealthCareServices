<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="/WEB-INF/common/include.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HospitalType List</title>
<%@ include file="/WEB-INF/common/bootstrap.jsp" %>
</head>
<body>
<div class="container">
<h2>HospitalType List</h2>
<table class="table table-hover">
	<thead class="thead-dark">
		<tr>
			<th>Type Id</th>
		    <th>HospitalType</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${hospitaltype}" var="ht">
			<tr>
				<td>${ht.id }</td>	
			    <td>${ht.name }</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
</div>
</body>
</html>