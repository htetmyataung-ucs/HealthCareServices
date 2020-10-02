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
<h2>Insert Hospital Type</h2>
  <form:form action="${pageContext.request.contextPath}/admin/create_hospitalType" method="POST" modelAttribute="hospitaltype">
   <div class="container">
   <div class="form-group">
   <form:label path="name">Enter Hospital Type:</form:label>
     <form:input type="text" class="form-control" path="name"/>
     </div>
    <button type="submit" class="btn btn-primary">Submit</button>
    <button type="reset" class="btn btn-primary">Reset</button>
    </div>
  </form:form>

</body>
</html>