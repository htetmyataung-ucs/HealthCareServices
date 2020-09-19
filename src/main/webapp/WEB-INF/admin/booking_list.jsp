<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ include file="/WEB-INF/common/include.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Booking List</title>
<%@ include file="/WEB-INF/common/bootstrap.jsp" %>
</head>
<body>
<div class="container">
<h2>Booking List</h2>
<table class="table table-hover">
	<thead class="thead-dark">
		<tr>
		    <th>Booking ID</th>
		    <th>Patient Name:</th>
		    <th>Booking Date</th>
		    <th>Booking Time</th>
		    <th>Hospital Name</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${bookingList}" var="b">
			<tr>	
			    <td>${b.id}</td>
			    <td>${b.patientName}</td>
			    <td>${b.date}</td>
			    <td>${b.time}</td>
			    <td>${b.hospitalName}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
</div>
</body>
</html>