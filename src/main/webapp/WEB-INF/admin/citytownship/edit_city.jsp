<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="/WEB-INF/common/include.jsp"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit City</title>
 <%@ include file="/WEB-INF/common/bootstrap.jsp"%>
</head>
<body>
  <h2>Edit City</h2>
  <form:form action="${pageContext.request.contextPath}/admin/editCity" method="POST" modelAttribute="city">
    <div class="form-group">
      <form:hidden path="id"/>
      <form:label path="name">City Name:</form:label>
      <form:input type="text" class="form-control" path="name"></form:input>
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
    <button type="reset" class="btn btn-primary">Reset</button>
  </form:form>
</body>
</html>