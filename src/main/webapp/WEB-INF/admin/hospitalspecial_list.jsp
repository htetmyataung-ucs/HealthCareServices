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
		    <th>Speciality Name</th>
			<th>Hospital  Name</th>
			<th>Status</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${hospitalspecial}" var="hs">
			<tr>
				<td>${hs.speciality.name }</td>
				<td>${hs.hospital.name }</td>
			    <td>${hs.status }</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
</body>
</html>