<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ include file="/WEB-INF/common/include.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@ include file="/WEB-INF/common/bootstrap.jsp" %>
</head>
<body>

  <form:form action="create_hospitalspecial" method="POST" modelAttribute="hospitalspecial">
   <div class="container">
   <h2>Insert Hospital_Special</h2>
    <div class="form-group">
    <form:label path="specialityId">Choose Speciality:</form:label>
     <form:select path="specialityId" class="form-control">
        <c:forEach items="${specialityList}" var="s">
           <form:option value="${s.id }">${s.name }</form:option>
        </c:forEach>
     </form:select>
     </div>
     <div class="form-group">
     <form:label path="hospitalId">Choose Hospital:</form:label>
     <form:select path="hospitalId" class="form-control">
        <c:forEach items="${hospitalList}" var="h">
           <form:option value="${h.id }">${h.name }</form:option>
        </c:forEach>
     </form:select>
     </div>
     <div class="form-group">
     <form:label path="status">Status:</form:label>
      <form:input type="text" class="form-control" placeholder="Enter Status" path="status"></form:input>
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
    </div>
  </form:form>
</body>
</html>