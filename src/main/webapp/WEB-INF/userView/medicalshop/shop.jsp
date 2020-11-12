<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<%@ include file="/WEB-INF/common/include.jsp"%>
<style>
*{
 	box-sizing: border-box;
 }
 .main{
 	width: 100%;
 	margin-top:-150px;
 }
 .main::after{
 	clear:both;
 }
 #itemCard{
 	width:100%;
 	padding-top:120px;
 }
 #shopCard{
 	width: 215px; 
 	height: 270px; 
 	margin-left:15px; 
 	margin-bottom:10px; 
 	border-radius:5%; 
 	box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19); 
 	float: left;
 }
 .card-body{
 	font-size:13px;
 }
 @media only screen and (max-width: 700px){
  .main{

 	margin-top:-120px;
 }
 	#shopCard{
 		width:150px;
 		margin-left:20px;
 		height:200px;
 	}
 	.card-body{
 		font-size:6px;
 	}
 }
 @media screen and (min-width: 700px) and (max-width:1200px){
 	#shopCard{
 		width:180px;
 		height:250px;
 	}
 	.card-body{
 		font-size:9px;
 	}
 }
</style>
<script>
$(document).ready(function(){
	$("#cityId").click(function(){
		var cityId=this.value;
		$.ajax({
		      type: 'GET',
		      contentType : "application/json",
		      url: "${pageContext.request.contextPath}/findTownshipByRegion/"+cityId,
		     
		    
		      success: function(resultData) { 
		    	  $(".searchTownshipId").empty();
		    	  var html="";
		    	  resultData.forEach(function(std,i){
		    		  $(".searchTownshipId").append("<option value='"+std.id+"'>"+std.name+"</option>");
		    		 // html+="<option value='"+std.id+"'>"+std.name+"</option>";
		    		  
		    	  });
		    	  //$("#searchTownshipId").html(html);
		      }
		});
	});
	
	$("#submitBtn").click(function(){
		var townshipId=$("#searchTownshipId").val();
		$.ajax({
			type: 'GET',
			contextType : "application/json",
			url: "${pageContext.request.contextPath}/shopSearch/"+townshipId,
			success: function(resultData){
				$("#itemCard").empty();
				console.log(resultData);
				resultData.forEach(function(std,i){
					$("#itemCard").append('<div class="card card-sm" id="shopCard">'
							+'<img class="card-img-top" src="/images/'+std.photo+'" alt="Card image" style="width: 100%; height: 45%; border-radius: 5% 5% 0 0;">'
							+'<div class="card-body">'
							+'<p style="text-align: center" class="card-title" style="font-weight: bold;">'+std.name+'</p>'
							+'<i class="fa fa-phone" aria-hidden="true"></i><span style="font-weight: bold; color: gray;">'+std.phone+'</span><br>'
							+'<i class="fa fa-envelope-o" aria-hidden="true"></i><span style="font-weight: bold; color: gray;">'+std.email+'</span><br>'
							+'<i class="fa fa-location-arrow" aria-hidden="true"></i><span class="card-text">'+std.address+'</span> <b><i><a href="${pageContext.request.contextPath}/shopDetail/'+std.id+'" style="text-decoration: none; color: black; float: right;">viw detail...</a></i></b>'
							+'</div>'
						    +'</div>'

							);
				});
			}
		});
	});
	
	
	//for township select box
	$('#searchTownshipId').removeClass('nice-select').css('display','inline').css('background','#EFF8FB')
	.css('font-size','15px').css('border','2px solid gray') ;
	//alert($('select[name="townshipId"]').next('.nice-select').html());
	$('select[name="townshipId"]').next('.nice-select').remove();
	
	
	//for city select box
	$('#cityId').removeClass('nice-select').css('display','inline').css('background','#EFF8FB')
	.css('font-size','15px').css('border','2px solid gray');
	$('select[name="cityId"]').next('.nice-select').remove();
	
});

</script>

<main style="position: relative; overflow: auto;">
	<!--? Slider Area Start-->
	<div class="slider-area slider-area2" style="z-index: -1;">
		<div class="slider-active dot-style">
			<!-- Slider Single -->
			<div class="single-slider  d-flex align-items-center slider-height2">
				<div class="container">
					<div class="row align-items-center">
						<div class="col-xl-7 col-lg-8 col-md-10 ">
							<div class="hero-wrapper">
								<div class="hero__caption">
									<h1 data-animation="fadeInUp" data-delay=".3s">Medical
										Shop</h1>
									<p data-animation="fadeInUp" data-delay=".6s">
										Almost before we knew it, we<br> had left the ground
									</p>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- Slider Area End -->
	<!--?  Contact Area start  -->
	<section class="contact-section">
		<div class="container">
			<div class="main">
				<%-- <form:form action="${pageContext.request.contextPath}/searchShop"
					method="GET">
 --%>
				<div style="width: 30%; float: left; margin-right:5%;">

					<h3>City</h3>
					<select id="cityId" class="form-select" name="cityId" style="">
						<c:forEach items="${cityList}" var="c">
							<option <c:if test="${c.id eq cityId}">selected="selected"</c:if>
								value="${c.id}">${c.name}</option>
						</c:forEach>
					</select>

				</div>
				<div style="width: 30%; float: left; margin-right:5%;">
					<h3>Township</h3>
					<select id="searchTownshipId"
						class="searchTownshipId form-select form-control"
						name="townshipId">
						<!-- search if form action -->
						<c:forEach items="${townshipList}" var="t">
							<option <c:if test="${t.id eq townid}">selected="selected"</c:if>
								value="${t.id}">${t.name}</option>
						</c:forEach>
					</select>
				</div>
				<div style="width: 20%; float:left;">
					<button type="submit" class="btn" id="submitBtn"
						style="padding: 20px; margin-top: 25px;">Search</button>
				</div>
				<%-- </form:form> --%>
			</div>
			<div id="itemCard">
				<%-- <c:forEach items="${shopSearchList}" var="s">
					<div class="card card-sm" id="shopCard" style="">
						<img class="card-img-top" src="/images/${s.photo }"
							alt="Card image"
							style="width: 100%; height: 45%; border-radius: 5% 5% 0 0;">
						<div class="card-body">
							<p style="text-align: center" class="card-title"
								style="font-weight: bold;">${s.name}</p>
							<i class="fa fa-phone" aria-hidden="true"></i><span
								style="font-weight: bold; color: gray;">${s.phone}</span><br>
							<i class="fa fa-envelope-o" aria-hidden="true"></i><span
								style="font-weight: bold; color: gray;">${s.email}</span><br>
							<i class="fa fa-location-arrow" aria-hidden="true"></i><span
								class="card-text">${s.address}</span> <b><i><a
									href="${pageContext.request.contextPath}/shopDetail/${s.id}"
									style="text-decoration: none; color: black; float: right;">viw
										detail...</a></i></b>
						</div>
					</div>
				</c:forEach> --%>
			</div>
		</div>
	</section>
</main>
