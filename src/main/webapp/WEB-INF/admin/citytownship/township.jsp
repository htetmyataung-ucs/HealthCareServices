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
<h2>Insert Township</h2>
  <form:form action="${pageContext.request.contextPath}/admin/create_township" method="POST" modelAttribute="township">
    <div class="form-group">
    <form:label path="name">Choose City Name:</form:label>
     <form:select path="cityId" class="form-control">
        <c:forEach items="${cityList }" var="city">
           <form:option value="${city.id }">${city.name }</form:option>
        </c:forEach>
     </form:select>
     </div>
     <div class="form-group">
     <form:label path="name">Township Name:</form:label>
      <form:input type="text" class="form-control" placeholder="Enter Township name" path="name"></form:input>
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
    <button type="reset" class="btn btn-primary">Reset</button>
  </form:form>

</body>
</html>