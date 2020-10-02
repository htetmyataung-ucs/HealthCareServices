<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="/WEB-INF/common/include.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hospital</title>
<meta charset="utf-8">
<%@ include file="/WEB-INF/common/bootstrap.jsp" %>
</head>
<body>

  <form:form action="${pageContext.request.contextPath}/admin/create_hospital" method="post" modelAttribute="hospital">
   <div class="container">
   <h2>Insert Hospital</h2>
   <div class="form-group">
   <form:label path="name">Choose Hospital Category:</form:label>
     <form:select path="hospitalCategoryId" class="form-control">
        <c:forEach items="${hospitalCategoryList }" var="hcat">
           <form:option value="${hcat.id }">${hcat.name }</form:option>
        </c:forEach>
     </form:select>
     </div>
     <div class="form-group">
      <form:label path="name">Hospital Name:</form:label>
      <form:input type="text" class="form-control" placeholder="Enter Hospital name" path="name"></form:input>
    </div>
    <div class="form-group">
   <form:label path="name">Choose Township Name:</form:label>
     <form:select path="townShipId" class="form-control">
        <c:forEach items="${townShipList }" var="t">
           <form:option value="${t.id }">${t.name }</form:option>
        </c:forEach>
     </form:select>
     </div>
     <div class="form-group">
     <form:label path="name">Choose Hospital Type Name:</form:label>
     <form:select path="hospitalTypeId" class="form-control">
        <c:forEach items="${hospitalTypeList }" var="htype">
           <form:option value="${htype.id }">${htype.name }</form:option>
        </c:forEach>
     </form:select>
     </div>
    <button type="submit" class="btn btn-primary">Submit</button>
     <button type="reset" class="btn btn-primary">Reset</button>
    </div>
  </form:form>
</body>
</html>