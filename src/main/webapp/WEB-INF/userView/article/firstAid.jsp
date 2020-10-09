<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="/WEB-INF/common/include.jsp"%>
    
<div class="container">
<h2>First Aid List</h2>
<table class="table table-hover">
	<thead class="thead-dark">
		<tr>
			<th>Name</th>
			<th>Gender</th>
			<th>Description</th>
			<th>Article Type</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${firstAidList}" var="fa">
			<tr>
				<td>${fa.name }</td>
				<td>${fa.gender }</td>
				<td>${fa.description }</td>
				<td>${fa.articleName}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
</div>
