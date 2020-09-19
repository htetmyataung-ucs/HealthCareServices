<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ include file="/WEB-INF/common/include.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@ include file="/WEB-INF/common/bootstrap.jsp" %>
</head>
<body>
<div class="container">
<h2>Hospital Detail List</h2>
<table class="table table-hover">
	<thead class="thead-dark">
		<tr>
		    <th>Hospital Name</th>
			<th>Open Date</th>
			<th>Open Time</th>
			<th>Phone</th>
			<th>Address</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${hospitalDetailList}" var="hd">
			<tr>
				<td>${hd.hospitalName }</td>
				<td>${hd.date }</td>
				<td>${hd.time }</td>
				<td>${hd.phone }</td>
			    <td>${hd.address }</td>
		   </tr>
		</c:forEach>
	</tbody>
</table>
</div>
</body>
</html>