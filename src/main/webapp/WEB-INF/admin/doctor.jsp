<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="/WEB-INF/common/include.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<meta charset="utf-8">
     <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
<h2>Insert Doctor</h2>
  <form:form action="create_doctor" method="POST" modelAttribute="doctor">
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
     
    <button type="submit" class="btn btn-primary">Insert</button>
  </form:form>
</body>
</html>