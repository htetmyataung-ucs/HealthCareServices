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

 <form:form action="create_hospitalDetail" method="POST" modelAttribute="hospitaldetail">
 <div class="container">
 <h2>Insert Hospital Detail</h2>
 <div class="form-group">
    <form:label path="hospitalId">Hospital Name:</form:label>
     <form:select path="hospitalId" class="form-control">
        <c:forEach items="${hospitalList}" var="h">
           <form:option value="${h.id }">${h.name }</form:option>
        </c:forEach>
     </form:select>
     </div>
 
  <div class="form-group">
     <form:label path="phone">Phone:</form:label>
      <form:input type="text" class="form-control" placeholder="Enter phone" path="phone"></form:input>
    </div>
    
    <div class="form-group">
     <form:label path="address">Address:</form:label>
      <form:input type="text" class="form-control" placeholder="Enter Phone" path="address"></form:input>
    </div>
  
    <div class="form-group">
     <form:label path="time">Time:</form:label>
      <form:input type="text" class="form-control" placeholder="Enter Time" path="time" ></form:input>
    </div>
    
    <div class="form-group">
     <form:label path="date">Date:</form:label>
      <form:input type="text" class="form-control" placeholder="Enter Date" path="date"></form:input>
    </div>
     
    <button type="submit" class="btn btn-primary">Insert</button>
    </div>
  </form:form>
  
</body>
</html>