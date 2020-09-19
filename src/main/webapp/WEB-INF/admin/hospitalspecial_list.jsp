<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="/WEB-INF/common/include.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HospitalSpecial List</title>
<%@ include file="/WEB-INF/common/bootstrap.jsp" %>

</head>
<body>
<div class="container">
<h2>HospitalSpecial List</h2>
<table class="table table-hover">
	<thead class="thead-dark">
		<tr>
		    <th>Speciality Name</th>
			<th>Hospital  Name</th>
			<th>Status</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${hospitalspecial}" var="hs">
			<tr>
				<td>${hs.specialityName}</td>
				<td>${hs.hospitalName}</td>
			    <td>${hs.status }</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
</div>
</body>
</html>