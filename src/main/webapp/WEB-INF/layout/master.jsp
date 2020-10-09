<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ include file="/WEB-INF/common/include.jsp"%>
<!doctype html>
<html class="no-js" lang="zxx">
<head>
<meta charset="utf-8">
<meta http-equiv="x-ua-compatible" content="ie=edge">
<title><tiles:getAsString name="title" /></title>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<meta name="description" content="">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="manifest" href="site.webmanifest">
<link rel="shortcut icon" type="image/x-icon"
	href="<c:url value='/resources/assets/img/favicon.ico'/>">
<%@ include file="/WEB-INF/common/bootstrap.jsp"%>
<!-- CSS here -->
<link rel="stylesheet" href="/resources/assets/css/bootstrap.min.css">
<link rel="stylesheet"
	href="<c:url value='/resources/assets/css/owl.carousel.min.css'/>">
<link rel="stylesheet"
	href="<c:url value='/resources/assets/css/slicknav.css'/>">
<link rel="stylesheet"
	href="<c:url value='/resources/assets/css/flaticon.css'/>">
<link rel="stylesheet"
	href="<c:url value='/resources/assets/css/gijgo.css'/>">
<link rel="stylesheet"
	href="<c:url value='/resources/assets/css/animate.min.css'/>">
<link rel="stylesheet"
	href="<c:url value='/resources/assets/css/animated-headline.css'/>">
<link rel="stylesheet"
	href="<c:url value='/resources/assets/css/magnific-popup.css'/>">
<link rel="stylesheet"
	href="<c:url value='/resources/assets/css/fontawesome-all.min.css'/>">
<link rel="stylesheet"
	href="<c:url value='/resources/assets/css/themify-icons.css'/>">
<link rel="stylesheet"
	href="<c:url value='/resources/assets/css/slick.css'/>">
<link rel="stylesheet"
	href="<c:url value='/resources/assets/css/nice-select.css'/>">
<link rel="stylesheet"
	href="<c:url value='/resources/assets/css/style.css'/>">
<script
	src="https://cdn.tiny.cloud/1/0w9x2gcbpddtq1z7wi1m5yfumq4z6rfta6xhl0wrz54aoqf4/tinymce/5/tinymce.min.js"
	referrerpolicy="origin"></script>

</head>
<body>
	<div>
		<tiles:insertAttribute name="header" />
	</div>
	<div>
		<tiles:insertAttribute name="body" />
	</div>
	<div>
		<tiles:insertAttribute name="footer" />
	</div>


	<!-- Scroll Up -->
	<div id="back-top">
		<a title="Go to Top" href="#"> <i class="fas fa-level-up-alt"></i></a>
	</div>

	<!-- JS here -->


	<script
		src="<c:url value='/resources/assets/js/vendor/modernizr-3.5.0.min.js'/>"></script>
	<!-- Jquery, Popper, Bootstrap -->
	<script
		src="<c:url value='/resources/assets/js/vendor/jquery-1.12.4.min.js'/>"></script>
	<!-- <script src="/resources/assets/js/popper.min.js"></script>
		<script src="/resources/assets/js/bootstrap.min.js"></script> -->
	<!-- Jquery Mobile Menu -->
	<script
		src="<c:url value='/resources/assets/js/jquery.slicknav.min.js'/>"></script>

	<!-- Jquery Slick , Owl-Carousel Plugins -->
	<script src="<c:url value='/resources/assets/js/owl.carousel.min.js'/>"></script>
	<script src="<c:url value='/resources/assets/js/slick.min.js'/>"></script>
	<!-- One Page, Animated-HeadLin -->
	<script src="<c:url value='/resources/assets/js/wow.min.js'/>"></script>
	<script
		src="<c:url value='/resources/assets/js/animated.headline.js'/>"></script>
	<script
		src="<c:url value='/resources/assets/js/jquery.magnific-popup.js'/>"></script>

	<!-- Date Picker -->
	<script src="<c:url value='/resources/assets/js/gijgo.min.js'/>"></script>
	<!-- Nice-select, sticky -->
	<script
		src="<c:url value='/resources/assets/js/jquery.nice-select.min.js'/>"></script>
	<script src="<c:url value='/resources/assets/js/jquery.sticky.js'/>"></script>

	<!-- counter , waypoint,Hover Direction -->
	<script
		src="<c:url value='/resources/assets/js/jquery.counterup.min.js'/>"></script>
	<script src="<c:url value='/resources/assets/js/waypoints.min.js'/>"></script>
	<script
		src="<c:url value='/resources/assets/js/jquery.countdown.min.js'/>"></script>
	<script
		src="<c:url value='/resources/assets/js/hover-direction-snake.min.js'/>"></script>

	<!-- contact js -->
	<script src="<c:url value='/resources/assets/js/contact.js'/>"></script>
	<script src="<c:url value='/resources/assets/js/jquery.form.js'/>"></script>
	<script
		src="<c:url value='/resources/assets/js/jquery.validate.min.js'/>"></script>
	<script src="<c:url value='/resources/assets/js/mail-script.js'/>"></script>
	<script
		src="<c:url value='/resources/assets/js/jquery.ajaxchimp.min.js'/>"></script>

	<!-- Jquery Plugins, main Jquery -->
	<script src="<c:url value='/resources/assets/js/plugins.js'/>"></script>
	<script src="<c:url value='/resources/assets/js/main.js'/>"></script>
	<script>
		$(document).ready(function(){
			$('select').css('background','red');
		});
	</script>
</body>
</html>