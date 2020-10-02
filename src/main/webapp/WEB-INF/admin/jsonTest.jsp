<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
	$(document).ready(function(){
		alert("Ok query");
		$("#btn").click(function(){
			var tname=$("#townshipName").val();
			var town={tname:tname};
			$.ajax({
				 type: 'POST',
			      contentType : "application/json",
			      url: "/byTownshipId/{town}",
			      data:JSON.stringify(std),
			      dataType: "json",
			      success: call_township();
			});
		});
	});
	function call_township(){
		$.ajax({
		      type: 'GET',
		      contentType : "application/json",
		      url: "/byTownshipId/",
		     
		    
		      success: function(resultData) { 
		    	  
		    	  resultData.forEach(function(std,i){
		    		  $("#std_table").append(
		    				'<tr>'
		    					+'<td>'+std.name+'</td>'
		    					+'<td>'+std.id+'</td>'
		    					+'</tr>'
		    		  );
		    		  
		    	  });
		      }
		});
	}
</script>
</head>
<body>
<div>
	<label>Search Township</label>
	<input type="text" id="townshipName" placeholder="Enter townshipName">
	<button id="btn" >Save</button>
</div>
<div>
<table id="township_table">
	<thead>
	<tr>
		<th>TownshipId</th>
		<th>TownshipName</th>
	</tr>
	</thead>
	<tbody>
		<tr>
		
		</tr>
	</tbody>
</table>
</div>
</body>
</html>