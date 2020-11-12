<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<style>
label{
	font-size:12px;
}
</style>
<script>
$(document).ready(function(){
	$("#bookingBtn").click(function(){
		var hospitalId = 44;
		var name =$("#name").val();
		var phone=$("#phone").val();
		var nrc=$("#nrc").val();
		var age=$("#age").val();
		var address=$("#address").val();
		var date=new Date($("#date").val());
		var time=$("#time").val();
		var booking = {hospitalId:hospitalId, name:name, phone:phone, nrc:nrc, age:age, address:address, date:date, time:time};
		$.ajax({
			type:"POST",
			url:"/bookingSave",
			contentType:"application/json",
			data:JSON.stringify(booking),
			dataType:"json",
			success: function(resultData){
				alert(resultData);
			},
			error:function(err){
				alert(JSON.stringify(err));
			}
		});
	});
	$("#bookingClear").click(function(){
		$("#name").val("");
		$("#phone").val("");
		$("#nrc").val("");
		$("#age").val("");
		$("#address").val("");
		$("#date").val("");
		$("#time").val("");
	});
});
</script>
<main style="position: relative; overflow: auto;">

	<!--?  Contact Area start  -->

	<div class="container-fluid">
		<div class="container">
			<div class="row">
				<div class="col-lg-1"></div>
				<div class="col-lg-10">
					
						<div class="row">
							<div class="col-lg-8">
								<h1 class="mt-3 mb-3 text-muted" style="font-size: 40px; font-weight: bold;">Hospital A</h1>
								<button>Map</button>
								<p>***********</p>
								<p>152-Baho,Kamaryout</p>
								<p>Yangon</p>

								<img src="/resources/assets/img/gallery/video-bg.png"
									width="100%" height="300px" class="mt-3 mb-5">
								<h1>Hospital A</h1>
								<p class="text-justify">10/18/2010 · This is a Free
									Hospital PowerPoint Template that you can use for Hospital or
									Healthcare needs, for example healthcare professionals can use
									this template to embed information about their hospital or
									another powerpoint presentations like wheelchair, operation
									theater. There are other keywords associated with this free
									powerpoint theme for hospital, for example: inhaler, paramedics
									...</p>


							</div>
							<div class="col-lg-4">
								<div class="card p-3"
									style="box-shadow: 0px 3px 3px #888888; margin-top: 10px;">
									<h2>Time Schedule</h2>
									<table border="0" class="ml-5">
										<thead>
											<tr>
												<th>Day</th>
												<th>Time</th>
											</tr>
										</thead>
										<tbody>
											<tr>
												<td>Sun</td>
												<td>9AM-10PM</td>
											</tr>
											<tr>
												<td>Mon</td>
												<td>9AM-10PM</td>
											</tr>
											<tr>
												<td>Tue</td>
												<td>9AM-10PM</td>
											</tr>
											<tr>
												<td>Wed</td>
												<td>9AM-10PM</td>
											</tr>
											<tr>
												<td>Sun</td>
												<td>9AM-10PM</td>
											</tr>
											<tr>
												<td>Thu</td>
												<td>9AM-10PM</td>
											</tr>
											<tr>
												<td>Sat</td>
												<td>9AM-10PM</td>
											</tr>
										</tbody>
									</table>
								</div>
								<div class="card p-3 mt-5"
									style="box-shadow: 0px 3px 3px #888888;">
									<h2>Appointment</h2>
									<form action="/bookingSave" method="post">
									<div class="form-group">
										<label>Name</label> <input type="text" id="name" name="name"
											class="form-control">
									</div>
									<div class="form-group">
										<label>Phone</label> <input type="text" id="phone" name="phone"
											class="form-control">
									</div>
									<div class="form-group">
										<label>NRC</label> <input type="text" id="nrc" name="nrc"
											class="form-control">
									</div>
									<div class="form-group">
										<label>Age</label> <input type="text" id="age" name="age"
											class="form-control">
									</div>
									<div class="form-group">
										<label>Booking Date</label>
										<input type="date" id="date" class="form-control" name="date">
									</div>
									<div class="form-group">
										<label>Time</label> <input type="time" id="time"
											class="form-control" name="date">
									</div>
									<div class="form-group">
										<label>Address</label> <input type="text" id="address"
											class="form-control" name="address">
									</div>
									<button type="submit" class="btn btn-sm p-4">Submit</button>
									<button type="reset" class="btn btn-sm p-4">Clear</button>
								</form>
								</div>
							</div>
						</div>
					
					<!--? Services Area Start -->
					<div class="service-area" style="margin-top:30px;">
						
							<h1 id="service-header" class="mb-5">Available Services</h1>
							<div class="row">

								<div class="col-lg-3 col-md-6 col-sm-6">
									<div class="single-cat text-center mb-5 p-5 ">
										<div class="cat-icon">
											<img src="/resources/assets/img/icon/services1.svg" style="width:70px; height:70px;" alt="">
										</div>
										<div class="cat-cap">
											<h5 style="margin-top:-5px">
												<a href="#">Cardiology</a>
											</h5>
											<label style="color:white">CSS is the language we use to
												style an HTML document. CSS describes how HTML elements
												should be displayed. This tutorial will teach you CSS from
												basic to advanced.</label>
											<!-- <a href="services.html" class="plus-btn"><i class="ti-plus"></i></a> -->
										</div>
									</div>
								</div>
								<div class="col-lg-3 col-md-6 col-sm-6">
									<div class="single-cat text-center mb-5 p-5 ">
										<div class="cat-icon">
											<img src="/resources/assets/img/icon/services1.svg" style="width:70px; height:70px;" alt="">
										</div>
										<div class="cat-cap">
											<h5 style="margin-top:-5px">
												<a href="#">Cardiology</a>
											</h5>
											<label style="color:white">CSS is the language we use to
												style an HTML document. CSS describes how HTML elements
												should be displayed. This tutorial will teach you CSS from
											
												basic to advanced.</label>
											<!-- <a href="services.html" class="plus-btn"><i class="ti-plus"></i></a> -->
										</div>
									</div>
								</div>
								<div class="col-lg-3 col-md-6 col-sm-6">
									<div class="single-cat text-center mb-5 p-5 ">
										<div class="cat-icon">
											<img src="/resources/assets/img/icon/services1.svg" style="width:70px; height:70px;" alt="">
										</div>
										<div class="cat-cap">
											<h5 style="margin-top:-5px">
												<a href="#">Cardiology</a>
											</h5>
											<label style="color:white">CSS is the language we use to
												style an HTML document. CSS describes how HTML elements
												should be displayed. This tutorial will teach you CSS from
												basic to advanced.</label>
											<!-- <a href="services.html" class="plus-btn"><i class="ti-plus"></i></a> -->
										</div>
									</div>
								</div>
								<div class="col-lg-3 col-md-6 col-sm-6">
									<div class="single-cat text-center mb-5 p-5 ">
										<div class="cat-icon">
											<img src="/resources/assets/img/icon/services1.svg" style="width:70px; height:70px;" alt="">
										</div>
										<div class="cat-cap">
											<h5 style="margin-top:-5px">
												<a href="#">Cardiology</a>
											</h5>
											<label style="color:white">CSS is the language we use to
												style an HTML document. CSS describes how HTML elements
												should be displayed. This tutorial will teach you CSS from
												basic to advanced.</label>
											<!-- <a href="services.html" class="plus-btn"><i class="ti-plus"></i></a> -->
										</div>
									</div>
								</div>
								<div class="col-lg-3 col-md-6 col-sm-6">
									<div class="single-cat text-center mb-5 p-5 ">
										<div class="cat-icon">
											<img src="/resources/assets/img/icon/services1.svg" style="width:70px; height:70px;" alt="">
										</div>
										<div class="cat-cap">
											<h5 style="margin-top:-5px">
												<a href="#">Cardiology</a>
											</h5>
											<label style="color:white">CSS is the language we use to
												style an HTML document. CSS describes how HTML elements
												should be displayed. This tutorial will teach you CSS from
												basic to advanced.</label>
											<!-- <a href="services.html" class="plus-btn"><i class="ti-plus"></i></a> -->
										</div>
									</div>
								</div>
								<div class="col-lg-3 col-md-6 col-sm-6">
									<div class="single-cat text-center mb-5 p-5 ">
										<div class="cat-icon">
											<img src="/resources/assets/img/icon/services1.svg" style="width:70px; height:70px;" alt="">
										</div>
										<div class="cat-cap">
											<h5 style="margin-top:-5px">
												<a href="#">Cardiology</a>
											</h5>
											<label style="color:white">CSS is the language we use to
												style an HTML document. CSS describes how HTML elements
												should be displayed. This tutorial will teach you CSS from
												basic to advanced.</label>
											<!-- <a href="services.html" class="plus-btn"><i class="ti-plus"></i></a> -->
										</div>
									</div>
								</div>
								<div class="col-lg-3 col-md-6 col-sm-6">
									<div class="single-cat text-center mb-5 p-5 ">
										<div class="cat-icon">
											<img src="/resources/assets/img/icon/services1.svg" style="width:70px; height:70px;" alt="">
										</div>
										<div class="cat-cap">
											<h5 style="margin-top:-5px">
												<a href="#">Cardiology</a>
											</h5>
											<label style="color:white">CSS is the language we use to
												style an HTML document. CSS describes how HTML elements
												should be displayed. This tutorial will teach you CSS from
												basic to advanced.</label>
											<!-- <a href="services.html" class="plus-btn"><i class="ti-plus"></i></a> -->
										</div>
									</div>
								</div>
								<div class="col-lg-3 col-md-6 col-sm-6">
									<div class="single-cat text-center mb-5 p-5 ">
										<div class="cat-icon">
											<img src="/resources/assets/img/icon/services1.svg" style="width:70px; height:70px;" alt="">
										</div>
										<div class="cat-cap">
											<h5 style="margin-top:-5px">
												<a href="#">Cardiology</a>
											</h5>
											<label style="color:white">CSS is the language we use to
												style an HTML document. CSS describes how HTML elements
												should be displayed. This tutorial will teach you CSS from
												basic to advanced.</label>
											<!-- <a href="services.html" class="plus-btn"><i class="ti-plus"></i></a> -->
										</div>
									</div>
								</div>


							</div>
						
					</div>
					<!-- Services Area End -->
				
				</div>

				<div class="col-lg-1"></div>
			</div>
		</div>
	</div>

</main>