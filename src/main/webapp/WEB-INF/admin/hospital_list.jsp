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
		    <th>Hospital Name</th>
			<th>Hospital Category Name</th>
			<th>Hospital Type Name</th>
			<th>Township Name</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${hospital}" var="h">
			<tr>
				<td>${h.name }</td>
				<td>${h.hospitalCategory.name }</td>
			    <td>${h.hospitalType.name }</td>
				<td>${h.townShip.name }</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
</body>
</html>