<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<%@ include file="/WEB-INF/common/include.jsp"%>
<style>
.image img {
	width: 300px;
	height: 300px;
	border-radius: 50%;
	border: 3px solid #009900;
	margin-top: -200px;
	margin-left: 39%;
}

.shopInfo {
	margin-top: -80px;
	text-align: center;
}

.shopInfo h3 {
	font-size: 40px;
}

.shopInfo .mail {
	font-size: 18px;
}
.map{
	margin-left: 28%;
}
.map #map {
	width: 600px;
	height: 400px;	
	border-radius: 3%;
	border: 2px solid #088A08;
}

@media only screen and (max-width: 600px) {
	.image img {
		width: 130px;
		height: 130px;
		margin-top: -90px;
		margin-left: 40%;
	}
	.shopInfo {
		margin-top: -40px;
	}
	.shopInfo h3 {
		font-size: 20px;
	}
	.shopInfo .mail {
		font-size: 10px;
	}
	.map{
	margin-left: 16%;
}
	.map #map {
		width: 350px;
		height: 200px;
		border-radius: 3%;
		border: 2px solid #088A08;
	}
}

@media screen and (min-width: 600px) and (max-width:1200px) {
	.image img {
		width: 200px;
		height: 200px;
		margin-top: -120px;
		margin-left: 41%;
	}
	.shopInfo {
		margin-top: -40px;
	}
	.shopInfo h3 {
		font-size: 30px;
	}
	.shopInfo .mail {
		font-size: 15px;
	}
	.map{
		margin-left: 25%;
	}
	.map #map {
		width: 500px;
		height: 320px;
		border-radius: 3%;
		border: 2px solid #088A08;
	}
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
									<h1 data-animation="fadeInUp" data-delay=".3s" style="">${shopDetail.name}</h1>
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
		<img src="/images/${shopDetail.photo }">
	</div>
	<section class="contact-section">
		<div class="shopInfo">
			<h3>${shopDetail.name }</h3>
			<br> <label class="mail"><i class="fa fa-phone"></i>&nbsp;&nbsp;${shopDetail.phone }</label><br>
			<label class="mail"><i class="fa fa-envelope-o"></i>&nbsp;&nbsp;${shopDetail.email }</label><br>
			<label class="mail"><i class="fa fa-location-arrow"></i>&nbsp;&nbsp;${shopDetail.address }</label><br>
			<label class="mail"><i class="fa fa-building-o"></i>&nbsp;&nbsp;${shopDetail.townshipName }&nbsp;<span>Township</span></label><br>
			<br>
			<br>
			<br>
		</div>
		<div class="map">
			<p>You can find ${shopDetail.name } shop here!</p>
			<div id="map"></div>
			<script>
				// Initialize and add the map
				function initMap() {
					// The location of Uluru
					var uluru = {
						lat : ${shopDetail.latitude},
						lng : ${shopDetail.longitude}
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
	</section>
</main>
