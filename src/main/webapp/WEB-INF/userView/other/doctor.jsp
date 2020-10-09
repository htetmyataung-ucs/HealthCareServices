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

  <form:form action="create_doctor" method="POST" modelAttribute="doctor" enctype="multipart/form-data">
 	<div class="container">
 	<h2>Insert Doctor</h2>
  <div class="form-group">
     <form:label path="name">Doctor Name:</form:label>
      <form:input type="text" class="form-control" placeholder="Enter doctor name" path="name"></form:input>
    </div>
    
    <div class="form-group">
     <form:label path="sama_no">Sama No:</form:label>
      <form:input type="text" class="form-control" placeholder="Enter Sama No" path="sama_no"></form:input>
    </div>
  
    <div class="form-group">
    <form:label path="speciality">Speciality Name:</form:label>
     <form:select path="speciality.id" class="form-control">
        <c:forEach items="${speciality }" var="speciality">
           <form:option value="${speciality.id }">${speciality.name }</form:option>
        </c:forEach>
     </form:select>
     </div>
     
      <div class="form-group">
     <form:label path="file">Photo:</form:label>
      <form:input type="file" path="file" class="form-control" placeholder="Choose photo." ></form:input>
    </div>
    
    <button type="submit" class="btn btn-primary">Insert</button>
    </div>
  </form:form>
</body>
</html>