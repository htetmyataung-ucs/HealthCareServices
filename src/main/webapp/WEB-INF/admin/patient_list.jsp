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
<h2>Patient List</h2>
<table>
	<thead>
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
</body>
</html>