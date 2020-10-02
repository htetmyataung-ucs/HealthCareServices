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

<div class="container">
<h2>Medical Shop List</h2>
<table class="table table-hover">
  <thead class="thead-dark">
      <tr>
        <th>Shop Name</th>
        <th>Phone NO:</th>
        <th>Address</th>
        <th>TownShip Name</th>
      </tr>
    </thead>
    <tbody>
     	<c:forEach items="${medicalShopList}" var="h">
     	<tr>
     		<td>${h.name}</td>
     		<td>${h.phone}</td>
     		<td>${h.address}</td>
     		<td>${h.townShip.name}</td>
     	</tr>
     	</c:forEach>
    </tbody>
  </table>
</div>

</body>
</html>
