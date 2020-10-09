<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/common/include.jsp"%>

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
			<h2>Shop Detail</h2>
			<table class="table table-hover">
				<thead class="thead-dark">
					<tr>
						<th>Name</th>
						<th>Phone</th>
						<th>Address</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>${shopDetail.name }</td>
						<td>${shopDetail.phone }</td>
						<td>${shopDetail.address }</td>
					</tr>
				</tbody>
			</table>
		</div>
	</section>
</main>
