<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="/WEB-INF/common/include.jsp"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>
<form:form action="${pageContext.request.contextPath}/searchShop" method="GET">
<select id="cityId">
<c:forEach items="${cityList}" var="c">
<option value="${c.id}">${c.name}</option>
</c:forEach>
</select>
<select name="townshipId" id="townshipId">
<option value=""></option>
</select>
<button id="btnSearch">Search</button>
</form:form>
<div>
<table id="shop_table" border="1">
	<thead>
	<tr>
		<th>Name</th>
		<th>Phone</th>
		<th>Address</th>
	</tr>
	</thead>
	<tbody>
		<c:forEach items="${shopList}" var="shop">
			<tr>
				<td>${shop.name }</td>
				<td>${shop.phone }</td>
				<td>${shop.address }</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
</div>
<script>
$(document).ready(function(){
	console.log('ok');
	$("#cityId").change(function(){
		var cityId=this.value;
		$.ajax({
		      type: 'GET',
		      contentType : "application/json",
		      url: "${pageContext.request.contextPath}/findTownshipByRegion/"+cityId,
		     
		    
		      success: function(resultData) { 
		    	  console.log(resultData);
		    	  $("#townshipId").empty();
		    	  resultData.forEach(function(std,i){
		    		  $("#townshipId").append("<option value='"+std.id+"'>"+std.name+"</option>");
		    		  
		    	  });
		      }
		});
	});
	
});

</script>
</body>
</html>