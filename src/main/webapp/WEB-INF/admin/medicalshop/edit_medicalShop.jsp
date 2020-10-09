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
<h3>Edit MedicalShop</h3>
<form:form action="${pageContext.request.contextPath}/admin/editShop" method="POST" enctype="multipart/form-data" modelAttribute="medicalshop">
<div class="form-group">
	 <form:hidden path="id"/>
	 
   <form:label path="townshipId">Choose Township Name:</form:label>
     <form:select path="townshipId" items="${townshipList}" itemValue="id" itemLabel="name" class="form-control">
       
     </form:select>
     </div>
    
     <div class="form-group">
      <form:label path="name">MedicalShop Name:</form:label>
      <form:input type="text" class="form-control" placeholder="Enter MedicalShop Name" path="name"></form:input>
    </div>
    <div class="form-group">
      <form:label path="phone">Phone NO:</form:label>
      <form:input type="text" class="form-control" placeholder="Enter Shop PhoneNO:" path="phone"></form:input>
    </div>
    <div class="form-group">
     <form:label path="email">Email:</form:label>
      <form:input type="text" path="email" class="form-control" placeholder="Enter Shop Mail:" ></form:input>
    </div>
    <div class="form-group">
     <form:label path="latitude">Latitude:</form:label>
      <form:input type="text" path="latitude" class="form-control" placeholder="Enter Latitude:" ></form:input>
    </div>
    <div class="form-group">
     <form:label path="longitude">Longitude:</form:label>
      <form:input type="text" path="longitude" class="form-control" placeholder="Enter Longitude:" ></form:input>
    </div>
    <div class="form-group">
      <form:label path="address">Address:</form:label>
      <form:input type="text" class="form-control" placeholder="Enter Shop Address" path="address"></form:input>
    </div>
    <div class="form-group">
     <form:label path="file">Photo:</form:label>
      <form:input type="file" path="file" class="form-control" placeholder="Choose photo." ></form:input>
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
    <button type="reset" class="btn btn-primary">Reset</button>
</form:form>
</body>
</html>