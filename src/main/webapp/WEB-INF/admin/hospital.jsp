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
<h2>Insert Hospital</h2>
  <form:form action="create_hospital" method="post" modelAttribute="hospital">
   <div class="form-group">
   <form:label path="name">Choose Hospital Category:</form:label>
     <form:select path="hospitalCategory.id" class="form-control">
        <c:forEach items="${hospitalCategory }" var="hoscat">
           <form:option value="${hoscat.id }">${hoscat.name }</form:option>
        </c:forEach>
     </form:select>
     </div>
     <div class="form-group">
      <form:label path="name">Hospital Name:</form:label>
      <form:input type="text" class="form-control" placeholder="Enter Hospital name" path="name"></form:input>
    </div>
    <div class="form-group">
   <form:label path="name">Choose Township Name:</form:label>
     <form:select path="townShip.id" class="form-control">
        <c:forEach items="${townShip }" var="t">
           <form:option value="${t.id }">${t.name }</form:option>
        </c:forEach>
     </form:select>
     </div>
     <div class="form-group">
     <form:label path="name">Choose Hospital Type Name:</form:label>
     <form:select path="hospitalType.id" class="form-control">
        <c:forEach items="${hospitalType }" var="hostype">
           <form:option value="${hostype.id }">${hostype.name }</form:option>
        </c:forEach>
     </form:select>
     </div>
    <button type="submit" class="btn btn-primary">Submit</button>
  </form:form>
</body>
</html>