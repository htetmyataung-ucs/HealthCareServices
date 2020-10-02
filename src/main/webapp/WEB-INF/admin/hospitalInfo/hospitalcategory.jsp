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
<h2>Insert Hospital Category</h2>
  <form:form action="${pageContext.request.contextPath}/admin/create_hospitalCategory" method="post" modelAttribute="hospitalcategory">
    <div class="form-group">
      <form:label path="name">Hospital Category Name:</form:label>
      <form:input type="text" path="name" class="form-control" placeholder="Enter Hospital Category name" ></form:input>
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
    <button type="reset" class="btn btn-primary">Reset</button>
  </form:form>

</body>
</html>