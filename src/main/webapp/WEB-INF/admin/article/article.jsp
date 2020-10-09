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
<h3>Insert Article</h3>
<form:form action="${pageContext.request.contextPath}/admin/create_article" method="POST" modelAttribute="article">
	 
    <div class="form-group">
    	<form:label path="name">Article Name:</form:label>
    	<form:select path="name" class="form-control">
    		<option value="Knowledge">Knowledge</option>
    		<option value="FirstAid">FirstAid</option>
    		<option value="Diseases">Diseases</option>
    	</form:select>
    </div>
	 <button type="submit" class="btn btn-primary">Submit</button>
    <button type="reset" class="btn btn-primary">Reset</button>
</form:form>
</body>
</html>