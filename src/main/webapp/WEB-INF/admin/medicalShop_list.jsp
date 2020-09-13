<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ include file="/WEB-INF/common/include.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</head>
<body>
<h2>Medical Shop List</h2>
<div class="container">
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
