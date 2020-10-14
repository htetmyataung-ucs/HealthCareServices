<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/common/include.jsp"%>
<style>
.itemCard {
	margin-top: -100px;
}

.card {
	float: left;
	width: 220px;
	height: 250px;
	border-radius: 18% 0 18% 0;
	border: 3px solid rgb(0, 153, 0, 0.8);
	margin-left: 50px;
	margin-bottom: 50px;
	box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0
		rgba(0, 0, 0, 0.19);
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
	.itemCard {
		margin-top: -90px;
	}
	.card {
		float: left;
		width: 130px;
		height: 150px;
		border-radius: 18% 0 18% 0;
		border: 2px solid rgb(0, 153, 0, 0.8);
		margin-left: 20px;
		margin-bottom: 20px;
		box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0
			rgba(0, 0, 0, 0.19);
	}
	.card h2 {
		text-align: center;
		font-size: 13px;
		margin-top: -5px;
	}
}

@media screen and (max-width:1200px) and (min-width:700px) {
	.itemCard {
		margin-top: -90px;
	}
	.card {
		float: left;
		width: 160px;
		height: 200px;
		border-radius: 18% 0 18% 0;
		border: 3px solid rgb(0, 153, 0, 0.8);
		margin-left: 35px;
		margin-bottom: 35px;
		box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0
			rgba(0, 0, 0, 0.19);
	}
	.card h2 {
		text-align: center;
		font-size: 16px;
		margin-top: -5px;
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
									<h1 data-animation="fadeInUp" data-delay=".3s" style="">Knowledge</h1>
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
			<div class="itemCard">
				<c:forEach items="${knowledgeList}" var="k">
					<div class="card">
						<img class="card-img-top" src="/images/${k.photo }"
							alt="Card image">
						<div class="card-body">
							<a
								href="${pageContext.request.contextPath}/articleDetailInfo/${k.id}"><h2>${k.name}</h2></a>
						</div>
					</div>
				</c:forEach>
			</div>
		</div>
	</section>
</main>