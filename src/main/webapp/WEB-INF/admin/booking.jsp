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
 <form:form action="save_booking" method="POST" modelAttribute="booking">
 <div class="form-group">
    <form:label path="patient">Patient Name:</form:label>
     <form:select path="patient.id" class="form-control">
        <c:forEach items="${patient }" var="patient">
           <form:option value="${patient.id }">${patient.name }</form:option>
        </c:forEach>
     </form:select>
     </div>
     
   <div class="form-group">
    <form:label path="hospital">Hospital Name:</form:label>
     <form:select path="hospital.id" class="form-control">
        <c:forEach items="${hospital }" var="hospital">
           <form:option value="${hospital.id }">${hospital.name }</form:option>
        </c:forEach>
     </form:select>
     </div>  
     
 
  <div class="form-group">
     <form:label path="date">Date:</form:label>
      <form:input type="text" class="form-control" placeholder="Enter date" path="date" type="date"></form:input>
    </div>
    
    <div class="form-group">
     <form:label path="time">Time:</form:label>
      <form:input type="text" class="form-control" placeholder="Enter time" path="time"></form:input>
    </div>
  
   
     
    <button type="submit" class="btn btn-primary">Insert</button>
  </form:form>
</body>
</html>