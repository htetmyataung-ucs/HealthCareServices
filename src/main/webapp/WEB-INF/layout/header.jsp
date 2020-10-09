<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<header>
	<!--? Header Start -->
	<div class="header-area">
		<div class="main-header header-sticky">
			<div class="container-fluid">
				<div class="row align-items-center">
					<!-- Logo -->
					<div class="col-xl-2 col-lg-2 col-md-1">
						<div class="logo">
							<a href="index.html"><img
								src="/resources/assets/img/logo/logo1.png" alt=""
								style="width: 200px; height: 100px;"></a>
						</div>
					</div>
					<div class="col-xl-10 col-lg-10 col-md-10">
						<div
							class="menu-main d-flex align-items-center justify-content-end">
							<!-- Main-menu -->
							<div class="main-menu f-right d-none  d-lg-block">
								<nav>
									<ul id="navigation">
										<li><a href="/" style="text-decoration: none;">Home</a></li>
										<li><a href="${pageContext.request.contextPath}/#"
											style="text-decoration: none;">Hospitals</a></li>
										<li><a>Articles</a>
											<ul class="submenu">
												<li><a href="${pageContext.request.contextPath}/firstAid"
													style="text-decoration: none;">FirstAid</a></li>
												<li><a href="${pageContext.request.contextPath}/disease"
													style="text-decoration: none;">Diseases</a></li>
												<li><a href="${pageContext.request.contextPath}/knowledge"
													style="text-decoration: none;">Knowledges</a></li>
											</ul></li>
										<li><a href="${pageContext.request.contextPath}/#"
											style="text-decoration: none;">News</a></li>
										<li><a
											href="${pageContext.request.contextPath}/searchShop"
											style="text-decoration: none;">Shop</a></li>
										<li><a href="${pageContext.request.contextPath}/#"
											style="text-decoration: none;">Contact</a></li>
									</ul>
								</nav>
							</div>
							<div class="header-right-btn d-lg-block ml-15" style="margin-left:-20px;">
								<a href="${pageContext.request.contextPath}/#"
									class="btn header-btn">Make Appointment</a>
							</div>
							<!-- User Menu-->
						
							<div class="dropdown" style="float:right; margin-right:-10px; margin-left:15px;">
								<a class="dropdown-toggle" data-toggle="dropdown"
									style="text-decoration: none"><i class="fa fa-user-o"
									aria-hidden="true" style="font-size:30px;"></i> </a>
								<div class="dropdown-menu dropdown-menu-bottom">
									<a class="dropdown-item " href="${pageContext.request.contextPath}/profile" style="font-size:15px;">Profile</a> 
									<a class="dropdown-item" href="${pageContext.request.contextPath}/logout" style="font-size:15px;">Logout</a> 
								</div>
							</div>

						</div>
					</div>
					<!-- Mobile Menu -->
					<div class="col-12">
						<div class="mobile_menu d-block d-lg-none"></div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- <script>
	$(document).ready(function(){
		$(".dropdown-menu").hover(function(){
			$(".dropdown-menu").css('background-color','whitesmoke');
		});
	});
	</script> -->
	<!-- Header End -->
</header>