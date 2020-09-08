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
			<th>Sama No</th>
			<th>Speciality Name</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${doctor}" var="d">
			<tr>
				<td>${d.name }</td>
				<td>${d.sama_no }</td>
				<td>${d.speciality.name }</td>
			    
				
			</tr>
		</c:forEach>
	</tbody>
</table>
</body>
</html>