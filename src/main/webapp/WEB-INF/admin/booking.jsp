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
<h2>Insert Booking</h2>
 <form:form action="create_booking" method="POST" modelAttribute="booking">
 <div class="container">
 <div class="form-group">
    <form:label path="patientId">Patient Name:</form:label>
     <form:select path="patientId" class="form-control">
        <c:forEach items="${patientList}" var="patient">
           <form:option value="${patient.id }">${patient.name }</form:option>
        </c:forEach>
     </form:select>
     </div>
     
   <div class="form-group">
    <form:label path="hospitalId">Hospital Name:</form:label>
     <form:select path="hospitalId" class="form-control">
        <c:forEach items="${hospitalList}" var="hospital">
           <form:option value="${hospital.id }">${hospital.name }</form:option>
        </c:forEach>
     </form:select>
     </div>  
     
 
  <div class="form-group">
     <form:label path="date">Date:</form:label>
      <form:input class="form-control" placeholder="Enter date" path="date" type="date"></form:input>
    </div>
    
    <div class="form-group">
     <form:label path="time">Time:</form:label>
      <form:input type="text" class="form-control" placeholder="Enter time" path="time"></form:input>
    </div>
  
    <button type="submit" class="btn btn-primary">Insert</button>
    </div>
  </form:form>
</body>
</html>