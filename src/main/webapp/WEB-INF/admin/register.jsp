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

	<form:form action="${pageContext.request.contextPath}/register" method="POST" modelAttribute="user">
		<div class="container">
			<h3>Registration Form</h3>
			
			<div class="form-group">
				<form:label path="roleId">Role:</form:label>
				<form:select path="roleId" class="form-control">
					<c:forEach items="${roleList }" var="r">
						<option value="${r.id }">${r.role }</option>
					</c:forEach>
				</form:select>
			</div>
			
			<div class="form-group">
				<form:label path="name">Name:</form:label>
				<form:input type="text" class="form-control"
					placeholder="Enter name" path="name"></form:input>
			</div>

			<div class="form-group">
				<form:label path="phone">Phone:</form:label>
				<form:input type="text" class="form-control"
					placeholder="Enter phone" path="phone"></form:input>
			</div>

			<div class="form-group">
				<form:label path="email">Email:</form:label>
				<form:input type="text" path="email" class="form-control"
					placeholder="Enter Email.."></form:input>
			</div>

			<div class="form-group">
				<form:label path="nrc">NRC:</form:label>
				<form:input type="text" class="form-control" placeholder="Enter nrc"
					path="nrc"></form:input>
			</div>

			<div class="form-group">
				<form:label path="age">Age:</form:label>
				<form:input type="text" class="form-control" placeholder="Enter age"
					path="age"></form:input>
			</div>

			<div class="form-group">
				<form:label path="address">Address:</form:label>
				<form:input type="text" class="form-control"
					placeholder="Enter address" path="address"></form:input>
			</div>

			<div class="form-group">
				<form:label path="bloodType">Blood Type:</form:label>
				<form:input type="text" class="form-control"
					placeholder="Enter blood type" path="bloodType"></form:input>
			</div>

			<div class="form-group">
				<form:label path="password">Password:</form:label>
				<form:input type="password" class="form-control"
					placeholder="Enter password" path="password"></form:input>
			</div>

			<button type="submit" class="btn btn-primary">Insert</button>
			<button type="reset" class="btn btn-primary">Reset</button>
		</div>
	</form:form>
</body>
</html>