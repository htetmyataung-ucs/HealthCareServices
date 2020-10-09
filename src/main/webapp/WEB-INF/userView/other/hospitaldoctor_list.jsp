<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="/WEB-INF/common/include.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HospitalDoctor List</title>
<%@ include file="/WEB-INF/common/bootstrap.jsp" %>
</head>
<body>
<div class="container">
<h2>Hospital Doctor List</h2>
<table class="table table-hover">
	<thead class="thead-dark">
		<tr>
			<th>Hospital Name</th>
		    <th>Doctor Name</th>
			<th>StartDate</th>
			<th>EndDate</th>
			<th>StartTime</th>
			<th>EndTime</th>
			<th>Status</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${hospitaldoctor}" var="hd">
			<tr>
				<td>${hd.hospitalName}</td>
				<td>${hd.doctorName}</td>
				<td>${hd.startDate }</td>
				<td>${hd.endDate}</td>
				<td>${hd.startTime}</td>
				<td>${hd.endTime}</td>
				<td>${hd.status }</td>  			
			</tr>
		</c:forEach>
	</tbody>
</table>
</div>
</body>
</html>