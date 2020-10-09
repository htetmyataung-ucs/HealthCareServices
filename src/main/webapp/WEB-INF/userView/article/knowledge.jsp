<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="/WEB-INF/common/include.jsp"%>

<div class="container">
<h2>Knowledge List</h2>
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
		<c:forEach items="${knowledgeList}" var="k">
			<tr>
				<td>${k.name }</td>
				<td>${k.gender }</td>
				<td>${k.description }</td>
				<td>${k.articleName}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
</div>
