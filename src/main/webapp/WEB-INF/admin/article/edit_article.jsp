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
<h3>Edit Article</h3>
<form:form action="${pageContext.request.contextPath}/admin/edit_article" method="POST" modelAttribute="article">
	<div class="form-group">
	  <form:hidden path="id"/>
      <form:label path="name">Article Name:</form:label>
      <form:input type="text" path="name" class="form-control" placeholder="Enter Article Name" ></form:input>
    </div>
	<button type="submit" class="btn btn-primary">Submit</button>
    <button type="reset" class="btn btn-primary">Reset</button>
</form:form>
</body>
</html>