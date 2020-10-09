<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="/WEB-INF/common/include.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<meta charset="utf-8">
 <%@ include file="/WEB-INF/common/bootstrap.jsp"%>
</head>
<body>
<div class="container">
<h2>Role List</h2>
<table class="table table-hover">
	<thead class="thead-dark">
		<tr>
		    <th>No</th>
		    <th>Role</th>		   
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${roleList}" var="r" varStatus="row">
			<tr>	
			    <td>${row.count}</td>
			    <td>${r.role}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
</div>
</body>
</html>