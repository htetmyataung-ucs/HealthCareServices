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
<h1>Insert MedicalShop</h1>
<form:form action="${pageContext.request.contextPath}/admin/medicalshop" method="POST" modelAttribute="medicalShop">
<div class="form-group">

   <form:label path="townshipId">Choose Township Name:</form:label>
     <form:select path="townshipId" class="form-control">
        <c:forEach items="${townshipList}" var="t">
           <form:option value="${t.id }">${t.name }</form:option>
        </c:forEach>
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
      <form:label path="address">Address:</form:label>
      <form:input type="text" class="form-control" placeholder="Enter Shop Address" path="address"></form:input>
    </div>
    
    <button type="submit" class="btn btn-primary">Submit</button>
    <button type="reset" class="btn btn-primary">Reset</button>
</form:form>
</body>
</html>