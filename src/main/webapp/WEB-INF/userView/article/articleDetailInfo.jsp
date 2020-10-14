<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/common/include.jsp"%>
<style>
.itemInfo {
	margin-top: -150px;
}

.itemInfo img {
	width: 300px;
	height: 300px;
	border: 1px solid rgb(0, 153, 0, 0.7);
	border-radius: 20% 0 20% 0;
}

.itemInfo label {
	margin-left: 100px;
	font-size: 70px;
	font-weight: bold;
	color: gray;
}

.itemDesc {
	width: 100%;
}

.itemDesc .desc {
	width: 30%;
	float: left;
	font-size: 25px;
	font-weight: bold;
	margin-top: 100px;
	padding: 5%;
	color: gray;
}

.itemDescription {
	width: 70%;
	background-color: #EFF8FB;
	border: 2px solid rgb(0, 153, 0, 0.7);
	border-radius: 20% 0 20% 0;
	padding: 3%;
	border: 2px solid rgb(0, 153, 0, 0.7);
	border-radius: 20% 0 20% 0;
	padding: 3%;
	font-size: 18px;
	float: left;
}

@media only screen and (max-width:700px) {
	.itemInfo {
		margin-top: -100px;
	}
	.itemInfo img {
		width: 150px;
		height: 150px;
	}
	.itemInfo label {
		margin-left: 40px;
		font-size: 25px;
	}
	.itemDesc .desc {
		font-size: 15px;
	}
	.itemDescription {
		font-size: 10px;
	}
}

@media screen and (max-width:1200px) and (min-width:700px) {
	.itemInfo {
		margin-top: -130px;
	}
	.itemInfo img {
		width: 250px;
		height: 250px;
	}
	.itemInfo label {
		margin-left: 50px;
		font-size: 50px;
	}
	.itemDesc .desc {
		font-size: 20px;
	}
	.itemDescription {
		font-size: 15px;
	}
}

.itemDesc::after {
	clear: both;
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
									<h1 data-animation="fadeInUp" data-delay=".3s" style="">${detailInfo.articleName}</h1>
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
			<div class="itemInfo">
				<img src="/images/${detailInfo.photo}"><label>${detailInfo.name }</label>
			</div>
			<div class="itemDesc">
				<div class="desc">
					<label>Description for&nbsp;${detailInfo.name }</label>
				</div>
				<div class="itemDescription">
					<p>${detailInfo.description}
					<p>
				</div>
			</div>
		</div>
	</section>
</main>
