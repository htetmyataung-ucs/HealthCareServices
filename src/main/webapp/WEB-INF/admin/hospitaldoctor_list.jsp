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
<table>
	<thead>
		<tr>
		    <th>Doctor Name</th>
			<th>Date</th>
			<th>Time</th>
			<th>Status</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${hospitaldoctor}" var="hd">
			<tr>
				<td>${hd.doctor.name }</td>
				<td>${hd.date }</td>
				<td>${hd.time }</td>
				<td>${hd.status }</td>
			    
				
			</tr>
		</c:forEach>
	</tbody>
</table>
</body>
</html>