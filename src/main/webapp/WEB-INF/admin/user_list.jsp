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
		    <th>User Name</th>
		    <th>Phone No</th>
		    <th>NRC</th>
		    <th>Age</th>
		    <th>Address</th>
		    <th>Blood Type</th>
			
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${user}" var="u">
			<tr>
				
			    <td>${u.name }</td>
			    <td>${u.phone }</td>
			    <td>${u.nrc }</td>
			    <td>${u.address }</td>
			    <td>${u.age }</td>
			    <td>${u.bloodType }</td>
				
			</tr>
		</c:forEach>
	</tbody>
</table>
</body>
</html>