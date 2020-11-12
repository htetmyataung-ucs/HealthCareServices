<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/common/include.jsp"%>
<link href="<c:url value='/resources/assets/css/hospitalDetail.css'/>" rel="stylesheet">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
$(document).ready(function(){
	$("#viewComment").click(function(){
		$("#commentList").fadeToggle();
	});
	$("#reviewBtn").click(function(){
		alert("OK");
		var hospitalId=${hospitalDetailList.hospitalId};
		var description=$("textarea[name='description']").val();
		alert(description);
		var rating=$("input[name='rating']").val();
		alert(rating);
		var review={hospitalId:hospitalId, description:description, rating:rating};
		alert(review);
		$.ajax({
			type: 'POST',
		      contentType : "application/json",
		      url: "/review_save",
		      data:JSON.stringify(review),
		      dataType: "json",
		      success: function(resultData) { 
		    	 console.log(resultData);
		      }
		});
	})
});
</script>
<main style="position: relative; overflow: auto;">
	 <!--? Slider Area Start-->
	 
	<%-- <div class="slider-area slider-area2" style="z-index: -1;">
		<div class="slider-active dot-style">
			<!-- Slider Single -->
			<div class="single-slider  d-flex align-items-center slider-height2">
				<div class="container">
					<div class="row align-items-center">
						<div class="col-xl-7 col-lg-8 col-md-10 ">
							<div class="hero-wrapper">
								<div class="hero__caption">
									<h1 data-animation="fadeInUp" data-delay=".3s" style="">${hospitalDetailList.hospitalName}</h1>
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
	</div> --%>
	<!-- Slider Area End --> 
	<!--?  Contact Area start  -->
	<div class="image">
		<img src="/images/${hospitalDetailList.photoPath }">
	</div>
	<h3>${hospitalDetailList.hospitalName}</h3>
	<section class="contact-section">
		<div class="container">
			<div class="hospitalInfo">

				<fieldset class="border border-dark p-4" id="fieldSet">
					<legend class="w-auto">Contact as</legend>
					<label><i class="fa fa-phone"></i>&nbsp;&nbsp;${hospitalDetailList.phone }</label><br>
					<label><i class="fa fa-envelope-o"></i>&nbsp;&nbsp;${hospitalDetailList.email }</label><br>
				</fieldset>

				<fieldset class="border border-dark p-4" id="fieldSet">
					<legend class="w-auto">Address</legend>
					<label><i class="fa fa-location-arrow"></i>&nbsp;&nbsp;${hospitalDetailList.address }</label><br>
				</fieldset>
			</div>

			<div class="mapMain">
				<div class="mapLabel">
					<p>We can find ${hospitalDetailList.hospitalName} in google
						map.</p>
				</div>
				<div id="map"></div>
				<script>
				// Initialize and add the map
				function initMap() {
					// The location of Uluru
					var uluru = {
						lat : ${hospitalDetailList.latitude},
						lng : ${hospitalDetailList.longitude}
					};
					// The map, centered at Uluru
					var map = new google.maps.Map(document
							.getElementById('map'), {
						zoom : 10,
						center : uluru,
						mapTypeId : google.maps.MapTypeId.HYBRID
					});
					// The marker, positioned at Uluru
					var marker = new google.maps.Marker({
						position : uluru,
						animation : google.maps.Animation.BOUNCE
					});

					marker.setMap(map);
				}
			</script>
			</div>
			<div class="doctorMain">
				<div class="doctorInfo">
					<div class="slideshow-container">
						<c:forEach items="${hospitalDoctorList}" var="hd">
							<div class="mySlides">
								<img src="/images/${hd.doctorPhoto }"><br>
								<div style="text-align: center;">
									<h3>${hd.doctorName}</h3>
									<label>${hd.doctorSamaNo}</label><br> <label>Speciality:
										${hd.doctorSpeciality}</label><br> <label>Job in:
										${hd.hospitalName}</label>
								</div>
							</div>
						</c:forEach>

						<a class="prev" onclick="plusSlides(-1)"><i
							class="fa fa-chevron-left"></i></a> <a class="next"
							onclick="plusSlides(1)"><i class="fa fa-chevron-right"></i></a>

					</div>

					<script>
var slideIndex = 1;
showSlides(slideIndex);

function plusSlides(n) {
  showSlides(slideIndex += n);
}

function currentSlide(n) {
  showSlides(slideIndex = n);
}

function showSlides(n) {
  var i;
  var slides = document.getElementsByClassName("mySlides");
  var dots = document.getElementsByClassName("dot");
  if (n > slides.length) {slideIndex = 1}    
  if (n < 1) {slideIndex = slides.length}
  for (i = 0; i < slides.length; i++) {
      slides[i].style.display = "none";  
  }
  for (i = 0; i < dots.length; i++) {
      dots[i].className = dots[i].className.replace(" active", "");
  }
  slides[slideIndex-1].style.display = "block";  
  dots[slideIndex-1].className += " active";
}
</script>
				</div>
				<div class="medicalTeam">
					<p>Our Medical Team</p>
				</div>
			</div>
			<hr>
		</div>
		<!--? Services Area Start -->
		<div class="service-area" style="margin-top: 50px;">
			<div class="container">
				<p id="service-header">Available Services</p>
				<div class="row">
					<c:forEach items="${hospitalServiceList}" var="hsl">
						<div class="col-lg-3 col-md-6 col-sm-6">
							<div class="single-cat text-center mb-50">
								<div class="cat-icon">
									<img src="/resources/assets/img/icon/services1.svg" alt=""
										style="margin-top: -5%;">
								</div>
								<div class="cat-cap">
									<h5 style="margin-top: -5%;">
										<a href="#">${hsl.serviceName}</a>
									</h5>
									<p style="margin-top: -5%;">${hsl.serviceDescription}</p>
									<!-- <a href="services.html" class="plus-btn"><i class="ti-plus"></i></a> -->
								</div>
							</div>
						</div>
					</c:forEach>

				</div>
			</div>
		</div>
		<!-- Services Area End -->
		<div class="container">
			<div style="width: 60%; float: left;">
				<button class="btn btn-succrss btn-sm" id="viewComment">View
					Comment</button>
				<button class="btn btn-success btn-sm open-button"
					onclick="openForm()">Review Hospital</button>

				<!--START POPUP FORM -->
				
				<div class="form-popup"  id="myForm">
					<form class="form-container" >
						<h1>Review</h1>
						<div class="form-group">
							<label>Description:</label>
							<textarea id="editor" name="description" class="form-control"
								style="width: 100%;"></textarea>
						</div>
						<!--  Rating -->
						<div class="form-group">
							<label>Rating:</label>
							<div class="main">
								<div id="rating-form">
									<span class="rating-star"> <input type="radio"
										name="rating" value="5"><span class="star"></span> <input
										type="radio" name="rating" value="4"><span
										class="star"></span> <input type="radio" name="rating"
										value="3"><span class="star"></span> <input
										type="radio" name="rating" value="2"><span
										class="star"></span> <input type="radio" name="rating"
										value="1"><span class="star"></span>
									</span>
								</div>
							</div>
						</div>

						<button type="submit" id="reviewBtn" class="btn btn-sm">Send</button>
						<button type="button" class="btn btn-sm cancel"
							onclick="closeForm()">Close</button>
					</form>
				</div>

				<script>
function openForm() {
  document.getElementById("myForm").style.display = "block";
}

function closeForm() {
  document.getElementById("myForm").style.display = "none";
}
tinymce.init({
	   selector: 'textarea#editor',
	   skin: 'bootstrap',
	   plugins: 'lists, link, image, media',
	   toolbar: 'h1 h2 bold italic strikethrough blockquote bullist numlist backcolor | link image media | removeformat help',
	   menubar: false
	 });
</script>
				<!--END POP UP FORM -->
				<!--START COMMENT LIST -->
				<div class="comments-area" id="commentList" style="display: none;">
					<h4>05 Comments</h4>
					<div class="comment-list">
						<div class="single-comment justify-content-between d-flex">
							<div class="user justify-content-between d-flex">
								<div class="thumb">
									<img src="/resources/assets/img/comment/comment_1.png" alt="">
								</div>
								<div class="desc">
									<p class="comment">Multiply sea night grass fourth day sea
										lesser rule open subdue female fill which them Blessed, give
										fill lesser bearing multiply sea night grass fourth day sea
										lesser</p>
									<div class="d-flex justify-content-between">
										<div class="d-flex align-items-center">
											<h5>
												<a href="#">Emilly Blunt</a>
											</h5>
											<p class="date">December 4, 2017 at 3:12 pm</p>
										</div>
										<div class="reply-btn">
											<a href="#" class="btn-reply text-uppercase">reply</a>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<!--END COMMENT LIST -->

			</div>
			<div style="width: 40%; float: left;"></div>
		</div>
	</section>
</main>
