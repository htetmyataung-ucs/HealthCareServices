<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<%@ include file="/WEB-INF/common/include.jsp"%>
<style>
h3 {
	font-size: 40px;
	text-align: center;
	margin-top: 30px;
}

.image img {
	width: 300px;
	height: 300px;
	border-radius: 50%;
	border: 3px solid rgb(0, 153, 0, 0.8);
	margin-top: -200px;
	margin-left: 39%;
}

.hospitalInfo {
	margin-top: -60px;
	margin-left: 30%;
	width: 70%;
}

.hospitalInfo::after {
	content: "";
	clear: both;
	display: table;
}

#fieldSet {
	color: black;
	width: 27%;
	height: 120px;
	float: left;
	margin-right: 5%;
	border-radius: 5% 5% 5% 5%;
}

#fieldSet label {
	font-size: 16px;
}

#fieldSet legend {
	font-weight: bold;
	font-style: italic;
	color: #009900;
}

.mapMain {
	width: 100%;
	margin-top: 50px;
}

.mapLabel {
	float: left;
	margin-left: 5%;
	width: 30%;
	margin-top: 50px;
}

.mapLabel p {
	font-size: 23px;
	font-weight: bold;
	color: gray;
}

#map {
	float: left;
	width: 60%;
	height: 450px;
	border-radius: 3%;
	border: 2px solid #088A08;
}

.mapMain::after {
	content: "";
	clear: both;
	display: table;
}

.doctorMain {
	width: 100%;
	margin-top: 50px;
}

.doctorMain::after {
	content: "";
	clear: both;
	display: table;
}

.doctorInfo {
	width: 50%;
	float: left;
}
/* Slideshow container */
.slideshow-container {
	width: 65%;
	height: 400px;
	position: relative;
	margin-left: 20%;
	border: 3px solid rgb(0, 153, 0, 0.5);
	border-radius: 15% 0 15% 0;
}

/* Slides */
.mySlides {
	display: none;
	padding: 30px;
	text-align: center;
}

.mySlides img {
	width: 150px;
	height: 150px;
	border-radius: 50%;
}

.mySlides h3 {
	font-size: 20px;
}
/* Next & previous buttons */
.prev, .next {
	cursor: pointer;
	position: absolute;
	top: 50%;
	width: auto;
	margin-top: -30px;
	padding: 14px;
	color: #888;
	font-weight: bold;
	font-size: 20px;
	border-radius: 0 3px 3px 0;
	user-select: none;
}

/* Position the "next button" to the right */
.next {
	position: absolute;
	right: 0;
	border-radius: 3px 0 0 3px;
}

/* On hover, add a black background color with a little bit see-through */
.prev:hover, .next:hover {
	background-color: rgba(0, 0, 0, 0.8);
	color: white;
}

.medicalTeam {
	width: 50%;
	float: left;
}

.medicalTeam p {
	margin-top: 30%;
	font-size: 35px;
	font-weight: bold;
	color: gray;
}
</style>
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
	</div>
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
				<label class="mail"><i class="fa fa-envelope-o"></i>&nbsp;&nbsp;${hospitalDetailList.email }</label>
			</fieldset>

			<fieldset class="border border-dark p-4" id="fieldSet">
				<legend class="w-auto">Address</legend>
				<label><i class="fa fa-location-arrow"></i>&nbsp;&nbsp;${hospitalDetailList.address }</label><br>
			</fieldset>
		</div>

		<div class="mapMain">
			<div class="mapLabel">
				<p>We can find ${hospitalDetailList.hospitalName} in google map.</p>
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

					<div class="mySlides">
						<img src="/images/${hospitalDetailList.photoPath }"><br>
						<div style="text-align: center;">
							<h3>Doctor A</h3>
						</div>
					</div>

					<div class="mySlides">
						<img src="/images/${hospitalDetailList.photoPath }"><br>
						<div style="text-align: center;">
							<h3>Doctor B</h3>
						</div>
					</div>

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
				<p>Our Medical Team
			</div>
		</div>
		</div>
	</section>
</main>