<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<%@ include file="/WEB-INF/common/include.jsp"%>
<style>
*{
              box-sizing: border-box;
            }
</style>
<script>
$(document).ready(function(){
	console.log('ok');
	$("#cityId").click(function(){
		var cityId=this.value;
		$.ajax({
		      type: 'GET',
		      contentType : "application/json",
		      url: "${pageContext.request.contextPath}/findTownshipByRegion/"+cityId,
		     
		    
		      success: function(resultData) { 
		    	  console.log(resultData);
		    	  $(".searchTownshipId").empty();
		    	  var html="";
		    	  resultData.forEach(function(std,i){
		    		  console.log(std.id);
		    		  console.log(std.name);
		    		  $(".searchTownshipId").append("<option value='"+std.id+"'>"+std.name+"</option>");
		    		 // html+="<option value='"+std.id+"'>"+std.name+"</option>";
		    		  
		    	  });
		    	  //$("#searchTownshipId").html(html);
		      }
		});
	});
	
	
	//for township select box
	$('#searchTownshipId').removeClass('nice-select').css('display','inline').css('background','#EFF8FB')
	.css('font-size','15px').css('border','2px solid gray');
	//alert($('select[name="townshipId"]').next('.nice-select').html());
	$('select[name="townshipId"]').next('.nice-select').remove();
	
	
	//for city select box
	$('#cityId').removeClass('nice-select').css('display','inline').css('background','#EFF8FB')
	.css('font-size','15px').css('border','2px solid gray');
	$('select[name="cityId"]').next('.nice-select').remove();
	
});

</script>

<main style="position:relative; overflow:auto;">
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

			<div style="width: 100%; height:700px; margin-top: -150px;">
				<div style="width: 100%; height: 20%; padding-bottom:0px;">
					<form:form action="${pageContext.request.contextPath}/searchShop"
						method="GET">

						<div style="width: 30%; height: 100%; float: left;">

							<h3>City</h3>
							<select id="cityId" class="form-select" name="cityId" style="">
								<c:forEach items="${cityList}" var="c">
									<option
										<c:if test="${c.id eq cityId}">selected="selected"</c:if>
										value="${c.id}">${c.name}</option>
								</c:forEach>
							</select>

						</div>
						<div style="width: 10%; height: 100%; float: left;">
							<p></p>
						</div>
						<div style="width: 30%; height: 100%; float: left;">
							<h3>Township</h3>
							<select id="searchTownshipId"
								class="searchTownshipId form-select form-control"
								name="townshipId">
								<c:forEach items="${townshipList}" var="t">
									<option
										<c:if test="${t.id eq townid}">selected="selected"</c:if>
										value="${t.id}">${t.name}</option>
								</c:forEach>
							</select>
						</div>
						<div style="width: 10%; height: 100% float:left;">
							<p></p>
						</div>
						<div style="width: 20%; height: 100%; float: right;">
							<button type="submit" class="btn"
								style="padding: 20px; margin-top: 25px;">Search</button>
						</div>
					</form:form>
				</div>
				<div style="width: 100%; height: 80%;">
					<!-- <table id="shop_table" class="table table-hover table-bordered">
						<thead>
							<tr>
								<th>Name</th>
								<th>Phone</th>
								<th>Address</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${shopSearchList}" var="shop">
								<tr>
									<td>${shop.name }</td>
									<td>${shop.phone }</td>
									<td>${shop.address }</td>
								</tr>
							</c:forEach>
						</tbody>
					</table> -->

					<div>
						<c:forEach items="${shopSearchList}" var="s">
							<div class="card card-sm" id="shopCard"
								style="width: 220px; height: 300px; margin-left:15px; margin-bottom:10px; border-radius:5%; box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19); float: left;">
								<img class="card-img-top" src="/images/${s.photo }" alt="Card image"
									style="width: 100%; height: 120px; border-radius:5% 5% 0 0;">
								<div class="card-body" style="">
									<div style="font-size:13px;">
										<p style="text-align:center" class="card-title" style="font-weight: bold;">${s.name}</p>
										<i class="fa fa-phone" aria-hidden="true"></i><span style="font-weight: bold; color: gray;">${s.phone}</span><br>
										<i class="fa fa-envelope-o" aria-hidden="true"></i><span style="font-weight: bold; color: gray;">${s.email}</span><br>
										<i class="fa fa-location-arrow" aria-hidden="true"></i><span class="card-text">${s.address}</span>
										<b><i><a href="${pageContext.request.contextPath}/shopDetail/${s.id}" style="text-decoration:none; color:black; float:right;">see more...</a></i></b>
									</div>
									
								</div>
							</div>
						</c:forEach>
					</div>

				</div>
			</div>
		</div>
	</section>
</main>
