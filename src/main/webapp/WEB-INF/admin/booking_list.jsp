<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ include file="/WEB-INF/common/include.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Booking List</h2>
<table>
	<thead>
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
			    <td>${b.patient.name}</td>
			    <td>${b.date}</td>
			    <td>${b.time}</td>
			    <td>${b.hospital.name}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
</body>
</html>