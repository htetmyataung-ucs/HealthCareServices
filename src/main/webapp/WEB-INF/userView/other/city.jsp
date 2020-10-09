<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="/WEB-INF/common/include.jsp"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <%@ include file="/WEB-INF/common/bootstrap.jsp"%>
</head>
<body>
  <h2>Insert City</h2>
  <form:form action="create_city" method="POST" modelAttribute="city">
    <div class="form-group">
      <form:label path="name">City Name:</form:label>
      <form:input type="text" class="form-control" placeholder="Enter City Name" path="name"></form:input>
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
  </form:form>

</body>
</html>