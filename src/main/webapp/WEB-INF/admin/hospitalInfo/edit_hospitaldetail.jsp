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

 <form:form action="${pageContext.request.contextPath}/admin/edit_hospitalDetail" method="POST" enctype="multipart/form-data" modelAttribute="hospitalDetail">
 <div class="container">
 <h2>Edit Hospital Detail</h2>
 <form:hidden path="id"/>
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
    
     <div class="form-group">
     <form:label path="file">File:</form:label>
      <form:input  path="file" type="file" class="form-control" placeholder="Choose File:"></form:input>
    </div>
    
    <div class="form-group">
     <form:label path="latitude">Latitude for Map:</form:label>
      <form:input type="text" class="form-control" placeholder="Enter latitude" path="latitude"></form:input>
    </div>
    
    <div class="form-group">
     <form:label path="longitude">Longitude for Map:</form:label>
      <form:input type="text" class="form-control" placeholder="Enter longitude" path="longitude"></form:input>
    </div>
    
    <button type="submit" class="btn btn-primary">Insert</button>
    <button type="reset" class="btn btn-primary">Reset</button>
    </div>
  </form:form>
  
</body>
</html>