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
	<form:form action="${pageContext.request.contextPath}/role" method="post" modelAttribute="role">
		<div class="container">
			<h3>Create Role</h3>
			<div class="form-group">
				<form:label path="role">Role</form:label>
				<form:input type="text" path="role" class="form-control"
					placeholder="Enter role.."></form:input>
			</div>
			<button type="submit" class="btn btn-primary">Insert</button>
			<button type="reset" class="btn btn-primary">Reset</button>
		</div>
	</form:form>
</body>
</html>