<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="/WEB-INF/common/include.jsp"%>

<div style="background-color:#EFF8FB">
<h2>Disease List</h2>
<table class="table">
	<thead class="thead-dark">
		<tr>
			<th>Name</th>
			<th>Gender</th>
			<th>Description</th>
			<th>Article Type</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${diseaseList}" var="d">
			<tr>
				<td>${d.name }</td>
				<td>${d.gender }</td>
				<td>${d.description }</td>
				<td>${d.articleName}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
</div>

