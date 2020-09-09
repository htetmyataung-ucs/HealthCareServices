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
		    <th>HospitalType Name</th>
			
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${hospitaltype}" var="ht">
			<tr>
				
			    <td>${ht.name }</td>
				
			</tr>
		</c:forEach>
	</tbody>
</table>
</body>
</html>