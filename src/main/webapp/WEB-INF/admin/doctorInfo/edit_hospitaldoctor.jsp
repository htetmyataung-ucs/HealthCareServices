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

  <form:form action="${pageContext.request.contextPath}/admin/editHospitalDoctor" method="POST" modelAttribute="hospitaldoctor">
  <div class="container">
  <h2>Edit Hospital Doctor</h2>
  <form:hidden path="id"/>
  
  <div class="form-group">
    <form:label path="hospital">Hospital Name:</form:label>
     <form:select path="hospitalId" class="form-control">
        <c:forEach items="${hospitalList}" var="h">
           <form:option value="${h.id }">${h.name }</form:option>
        </c:forEach>
     </form:select>
     </div>
  
  <div class="form-group">
    <form:label path="doctor">Doctor Name:</form:label>
     <form:select path="doctorId" class="form-control">
        <c:forEach items="${doctorList}" var="doctor">
           <form:option value="${doctor.id }">${doctor.name }</form:option>
        </c:forEach>
     </form:select>
     </div>
     
  <div class="form-group">
     <form:label path="startDate">StartDate:</form:label>
      <form:input class="form-control" placeholder="Enter startDate" path="startDate" type="Date"></form:input>
    </div>
    <div class="form-group">
     <form:label path="endDate">EndDate:</form:label>
      <form:input class="form-control" placeholder="Enter endDate" path="endDate" type="Date"></form:input>
    </div>
    
    
    <div class="form-group">
     <form:label path="startTime">StartTime:</form:label>
      <form:input class="form-control" placeholder="Enter startTime" path="startTime" type="text"></form:input>
    </div>
  	<div class="form-group">
     <form:label path="endTime">EndTime:</form:label>
      <form:input class="form-control" placeholder="Enter endTime" path="endTime" type="text"></form:input>
    </div>
    
    
    <div class="form-group">
     <form:label path="status">Status:</form:label>
      <form:input type="text" class="form-control" placeholder="Enter Status" path="status"></form:input>
    </div>
     
    <button type="submit" class="btn btn-primary">Submit</button>
    <button type="reset" class="btn btn-primary">Reset</button>
    </div>
  </form:form>
</body>
</html>