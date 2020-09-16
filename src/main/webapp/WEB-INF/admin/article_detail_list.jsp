<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
<%@ include file="/WEB-INF/common/include.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1">
	<thead>
		<tr>
			<th>Name</th>
			<th>Gender</th>
			<th>Description</th>
			<th>Article Type</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${article_details}" var="ads">
			<tr style="text-align:center;">
				<td>${ads.name }</td>
				<td>${ads.gender }</td>
				<td>${ads.description }</td>
				<td>${ads.article.name }</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
</body>
</html>