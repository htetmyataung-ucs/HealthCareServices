<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/common/include.jsp"%>
<style>
#headerText{
	margin-top:-200px;
}
#main {
	margin-top: -450px;
}

#btn {
	background-color: #5AAC4E;
	color: white;
	font-weight: bold;
	margin-top: 25px;
	border: 0;
	border-radius: 0 0 0 10px;
}

#btn:hover {
	background-color: #006400;
}
label{
	font-size:14px;
	font-weight:bold;
}
#itemCard{
	margin-top:-400px;
}
@media screen and (min-width:200px) and (max-width:500px){
#headerText{
	margin-top:-100px;
}
	#main {
	margin-top: -230px;
}
#itemCard{
	margin-top:-0px;
}
}
@media screen and (min-width:500px) and (max-width:1000px){
#headerText{
	margin-top:-100px;
}
	#main {
	margin-top: -230px;
}
#itemCard{
	margin-top:-0px;
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
					 $("#itemCard").empty();

			    	  resultData.forEach(function(std,i){
			    		  $("#itemCard").append('<div class="col-lg-10">'
			    				    +'<div class="card p-3 mb-3" style="box-shadow: 0px 3px 3px #888888;">'
			    		            +'<div class="row">'
			    		            +'<div class="col-lg-4 ">'
			    		                    
			    		            +'<img src="/images/'+std.photo+'" width="100%" height="200px">'
			    		                
			    		            +'</div>'
			    		            +'<div class="col-lg-8">'
			    		            +'<h1>'+std.name+'</h1>'
			    		            +'<p class="toShortTxt-3">'+std.description+'</p>'
			    		            +'<a href="${pageContext.request.contextPath}/hospitalDetailInfo/'+std.id+'" class="btn-sm p-4 btn float-right">View More</a>'
			    		            +'</div>'
			    		            +'</div>'
			    		        	+'</div>'
			    		        	+'</div>'
			    		  );
			    	  });
				}
			});
		});
	});
</script>
<main style="position: relative;">
	<!--? Slider Area Start-->
	<div class="slider-area slider-area2" style="z-index: -1;">
		<div class="slider-active dot-style">
			<!-- Slider Single -->
			<div class="single-slider  d-flex align-items-center slider-height2">
				<div class="container">
					<div class="row align-items-center">
						<div class="col-xl-7 col-lg-8 col-md-10 ">
							<div class="hero-wrapper">
								<div class="hero__caption" id="headerText">
									<h1 data-animation="fadeInUp" data-delay=".3s" style="">Hospital</h1>
									<!-- <p data-animation="fadeInUp" data-delay=".6s">
										Almost before we knew it, we<br> had left the ground
									</p>  -->
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
			<div class="row" id="main">
				<div class="col-lg-2">
				<label>City</label><br>
					<select id="city" name="cityId" class="form-select">
						<c:forEach items="${cityList}" var="c">
							<option value="${c.id }">${c.name }</option>
						</c:forEach>
					</select>
				</div>
				<div class="col-lg-2">
					<label>Township</label><br>
					<select id="township" class="township form-select" name="townshipId">
					<option>select township</option>
						<option value=""></option>
					</select>
				</div>
				<div class="col-lg-2">
					<label>Hospital Category</label><br>
					<select id="hospitalCategory" name="hospitalCategoryId" class="form-select">
						<c:forEach items="${hospitalCategoryList }" var="hc">
							
							<option value="${hc.id }">${hc.name }</option>
						</c:forEach>
					</select>
				</div>
				<div class="col-lg-2">
					<label>Hospital Type</label><br>
					<select id="hospitalType" name="hospitalTypeId" class="form-select">
						<c:forEach items="${hospitalTypeList }" var="h">
							<option value="${h.id }">${h.name }</option>
						</c:forEach>
					</select>
				</div>
				<div class="col-lg-2">
					<button type="submit" class="btn-lg p-3" id="btn">Search Hospital</button>
				</div>
			</div>
        </div>
        
	</section>
	<div class="container">
        <div class="row" id="itemCard">
        </div>
        </div>
</main>
