<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/common/include.jsp"%>
<style>
.main {
	width: 100%;
	margin-left:50px;
	margin-top: -250px;
}

.select {
	width: 15%;
	margin-right: 2%;
	float: left;
}
.select label{
	font-size:13px;
	font-weight:bold;
}
select {
	font-size: 10px;
	width: 100%;
	padding: 3px;
}

.searchBtn {
	float: left;
	width: 10%;
}

.searchBtn button {
	font-size: 15px;
	padding: 15px;
	border: 2px solid gray;
	background-color: #EFF8FB;
	color: black;
	font-weight: bold;
	margin-bottom:-35px;
}

.card {
	float: left;
	width: 200px;
	height: 230px;
	border-radius: 18% 0 18% 0;
	border: 2px solid rgb(0, 153, 0, 0.6);
	margin-left: 60px;
	margin-bottom: 50px;
	box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0
		rgba(0, 0, 0, 0.19);
}

.itemCard {
	width: 100%;
	padding-top: 100px;
}

.card h2 {
	text-align: center;
}

.itemCard .card img {
	width: 100%;
	height: 80%;
	border-radius: 19% 0% 18% 0;
}

@media only screen and (max-width:700px) {
	.main {
		margin-top: -170px;
		margin-left:0px;
	}
	.select {
	width: 18%;
	margin-right: 2%;
	float: left;
}
	select {
		font-size: 6px;
		padding: 2px;
	}
	.select label{
	font-size:7px;
	font-weight:bold;
}
	.searchBtn {
		float: left;
		width: 5%;
	}
	.searchBtn button {
		font-size: 13px;
		padding: 13px;
		margin-top:-8px;
	}
	.card {
		float: left;
		width: 130px;
		height: 150px;
		margin-left: 20px;
		margin-bottom: 20px;
	}
	.card h2 {
		font-size: 13px;
		margin-top: -5px;
	}
}

@media screen and (min-width:700px) and (max-width:1200px) {
	.main {
		margin-top: -200px;
	}
		.select label{
	font-size:10 px;
	font-weight:bold;
}
	.card {
		float: left;
		width: 150px;
		height: 180px;
		margin-left: 35px;
		margin-bottom: 35px;
	}
	.card h2 {
		font-size: 16px;
		margin-top: -5px;
	}
}
</style> 
<script>
	$(document).ready(function(){
		//FOR CITY
		$('#city').removeClass('nice-select').css('display','inline').css('background','#EFF8FB')
		.css('font-size','15px').css('border','2px solid gray');
		$('select[name="cityId"]').next('.nice-select').remove();
		//FOR TOWNSHIP
		$('#township').removeClass('nice-select').css('display','inline').css('background','#EFF8FB')
		.css('font-size','15px').css('border','2px solid gray');
		$('select[name="townshipId"]').next('.nice-select').remove();
		//FOR HOSPITAL TYPE
		$('#hospitalType').removeClass('nice-select').css('display','inline').css('background','#EFF8FB')
		.css('font-size','15px').css('border','2px solid gray');
		$('select[name="hospitalTypeId"]').next('.nice-select').remove();
		
		//FOR HOSPITAL CATEGORY
		$('#hospitalCategory').removeClass('nice-select').css('display','inline').css('background','#EFF8FB')
		.css('font-size','15px').css('border','2px solid gray');
		$('select[name="hospitalCategoryId"]').next('.nice-select').remove();
		
		
		$("#city").click(function(){
			var cityId=this.value;
			$.ajax({
			      type: 'GET',
			      contentType : "application/json",
			      url: "${pageContext.request.contextPath}/findTownshipByRegion/"+cityId,
			     
			    
			      success: function(resultData) { 
			    	  $("#township").empty();
			    	  var html="";
			    	  resultData.forEach(function(std,i){
			    		  $("#township").append("<option value='"+std.id+"'>"+std.name+"</option>");
			    		 // html+="<option value='"+std.id+"'>"+std.name+"</option>";
			    		  
			    	  });
			    	  //$("#searchTownshipId").html(html);
			      }
			});
		});
		$("#btn").click(function(){
			console.log('click');
			var townshipId=$("#township").val();
			var hospitalCategoryId=$("#hospitalCategory").val();
			var hospitalTypeId=$("#hospitalType").val();
			console.log(hospitalTypeId);
			$.ajax({
				type:'GET',
				contentType : "application/json",
				url: "${pageContext.request.contextPath}/findHospitalByAllCat/"+townshipId+"/"+hospitalCategoryId+"/"+hospitalTypeId,
				success: function(resultData) {
					console.log(resultData);
					 $("#hospitalCard").empty();

			    	  resultData.forEach(function(std,i){
			    		  $("#hospitalCard").append('<div class="card">'
			    				  +'<img class="card-img-top" src="/images/Store-b.jpg" alt="Card image">'
			    				  +'<div class="card-body">'
			    				  +'<a href="${pageContext.request.contextPath}/hospitalDetailInfo/'+std.id+'"><h2>'+std.name+'</h2></a>'
								  +'</div>'
								  +'</div>');
			    	  });
				}
			});
		});
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
								<div class="hero__caption" style="margin-top: -100px;">
									<h1 data-animation="fadeInUp" data-delay=".3s" style="">Hospital</h1>
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
				<div class="select">
				<label>City</label>
					<select id="city" name="cityId">
						<c:forEach items="${cityList}" var="c">
							<option value="${c.id }">${c.name }</option>
						</c:forEach>
					</select>
				</div>
				<div class="select">
					<label>Township</label>
					<select id="township" class="township" name="townshipId">
						<option value=""></option>
					</select>
				</div>
				<div class="select">
					<label>Hospital Category</label>
					<select id="hospitalCategory" name="hospitalCategoryId">
						<c:forEach items="${hospitalCategoryList }" var="hc">
							<option value="${hc.id }">${hc.name }</option>
						</c:forEach>
					</select>
				</div>
				<div class="select">
					<label>Hospital Type</label>
					<select id="hospitalType" name="hospitalTypeId">
						<c:forEach items="${hospitalTypeList }" var="h">
							<option value="${h.id }">${h.name }</option>
						</c:forEach>
					</select>
				</div>
				<div class="searchBtn">
					<label></label><br>
					<button type="submit" class="btn" id="btn">Search</button>
				</div>
			</div>
			<div id="hospitalCard" class="itemCard">
				
			</div>
		</div>
	</section>
</main>
