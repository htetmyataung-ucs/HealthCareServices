<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ include file="/WEB-INF/common/include.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Manage Hospital Service</title>
</head>
<body>
<h3>Manage Hospital Service</h3>
<div class="row">
	<form action="${pageContext.request.contextPath}/admin/manageHospitalService" method="post">
		<h6>Hospital</h6>
		<select name="hospitalId">
			<c:forEach items="${hospitalList}" var="h">
				<option value="${h.id }">${h.name }</option>
			</c:forEach>
		</select>
		<br>
		<br>
		
		<h6>Service</h6>
		<div>
			<c:forEach items="${serviceList }" var="p" varStatus="row">
			<div>
				<input type="hidden" name="serviceList[${row.index}].id" value="${p.id }" />
				<input type="checkbox" name="serviceList[${row.index}].selected" /><label>${p.name}</label>
			</div>
			</c:forEach>
		</div>
		<div>
			<input type="submit" value="Save"/>
			<input type="reset" value="Reset" />
		</div>
	</form>
</div>
</body>
</html>