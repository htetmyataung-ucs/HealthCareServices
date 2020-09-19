<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ include file="/WEB-INF/common/include.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Patient List</title>
<%@ include file="/WEB-INF/common/bootstrap.jsp" %>
</head>
<body>
<div class="container">
<h2>Patient List</h2>
<table class="table table-hover">
	<thead class="thead-dark">
		<tr>
		    <th>Patient Name</th>
		    <th>Phone No:</th>
		    <th>NRC</th>
		    <th>Age</th>
		    <th>Address</th>
		    <th>Blood Type</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${patientList}" var="p">
			<tr>	
			    <td>${p.name}</td>
			    <td>${p.phone }</td>
			    <td>${p.nrc }</td>
			    <td>${p.age }</td>
			    <td>${p.address }</td>
			    <td>${p.bloodType }</td>			 	
			</tr>
		</c:forEach>
	</tbody>
</table>
</div>
</body>
</html>