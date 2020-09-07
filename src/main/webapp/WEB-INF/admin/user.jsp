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
<h2>Insert Hospital Detail</h2>
 <form:form action="save_user" method="POST" modelAttribute="user">
 
 <div class="form-group">
     <form:label path="name">Name:</form:label>
      <form:input type="text" class="form-control" placeholder="Enter name" path="name"></form:input>
    </div>
 
  <div class="form-group">
     <form:label path="phone">Phone:</form:label>
      <form:input type="text" class="form-control" placeholder="Enter phone" path="phone"></form:input>
    </div>
    
    <div class="form-group">
     <form:label path="nrc">NRC:</form:label>
      <form:input type="text" class="form-control" placeholder="Enter nrc" path="nrc"></form:input>
    </div>
  
    <div class="form-group">
     <form:label path="age">Age:</form:label>
      <form:input type="text" class="form-control" placeholder="Enter age" path="age"></form:input>
    </div>
    
    <div class="form-group">
     <form:label path="address">Address:</form:label>
      <form:input type="text" class="form-control" placeholder="Enter address" path="address"></form:input>
    </div>
    
    <div class="form-group">
     <form:label path="bloodType">Blood Type:</form:label>
      <form:input type="text" class="form-control" placeholder="Enter blood type" path="bloodType"></form:input>
    </div>
    
    <div class="form-group">
     <form:label path="password">Password:</form:label>
      <form:input type="text" class="form-control" placeholder="Enter password" path="password"></form:input>
    </div>
     
    <button type="submit" class="btn btn-primary">Insert</button>
  </form:form>
</body>
</html>