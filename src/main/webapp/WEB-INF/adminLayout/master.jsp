<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%> 
<%@ include file="/WEB-INF/common/include.jsp"%>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta name="description" content="Vali is a responsive and free admin theme built with Bootstrap 4, SASS and PUG.js. It's fully customizable and modular.">
    <!-- Twitter meta-->
    <meta property="twitter:card" content="summary_large_image">
    <meta property="twitter:site" content="@pratikborsadiya">
    <meta property="twitter:creator" content="@pratikborsadiya">
    <!-- Open Graph Meta-->
    <meta property="og:type" content="website">
    <meta property="og:site_name" content="Vali Admin">
    <meta property="og:title" content="Vali - Free Bootstrap 4 admin theme">
    <meta property="og:url" content="http://pratikborsadiya.in/blog/vali-admin">
    <meta property="og:image" content="http://pratikborsadiya.in/blog/vali-admin/hero-social.png">
    <meta property="og:description" content="Vali is a responsive and free admin theme built with Bootstrap 4, SASS and PUG.js. It's fully customizable and modular.">
    <title>HealthCareService Admin Template</title>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- Main CSS-->
    <link rel="stylesheet" type="text/css" href="<c:url value='/resources/docs/css/main.css'></c:url>">
    <!-- Font-icon css-->
    <link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
	<!-- FOR TEXT EDITOR -->
	 <script src="https://cdn.tiny.cloud/1/0w9x2gcbpddtq1z7wi1m5yfumq4z6rfta6xhl0wrz54aoqf4/tinymce/5/tinymce.min.js" referrerpolicy="origin"></script>
		<%@ include file="/WEB-INF/common/bootstrap.jsp"%>
  </head>
  <body class="app sidebar-mini">
  
  	<div><tiles:insertAttribute name="header" /> </div> 
  	<div><tiles:insertAttribute name="menu" /> </div> 	
  	
  	
  	<main class="app-content">
      <div class="app-title" style="padding: 5px;">
        <div>
          <h1 style="font-weight: bolder;"><i class="fa fa-plus-circle" style="margin-right: 10px;"></i>Health Care Service</h1>
        </div>
        <ul class="app-breadcrumb breadcrumb" style="margin-top:5px; margin-bottom:3px;">
          <li class="breadcrumb-item"><i class="fa fa-home fa-lg"></i></li>
          <li class="breadcrumb-item"><a href="<c:url value='/admin'/>" style="text-decoration:none;">Dashboard</a></li>
        </ul>
      </div>
             
      <div><tiles:insertAttribute name="body" /> </div>
      </main>
    <!-- <div><tiles:insertAttribute name="footer" /></div> -->
  
   <!-- Essential javascripts for application to work-->
    <script src="<c:url value='/resources/docs/js/jquery-3.3.1.min.js'/>"></script>
    <script src="<c:url value='/resources/docs/js/popper.min.js'/>"></script>
    <script src="<c:url value='/resources/docs/js/bootstrap.min.js'/>"></script>
    <script src="<c:url value='/resources/docs/js/main.js'/>"></script>
    <!-- The javascript plugin to display page loading on top-->
    <script src="<c:url value='/resources/docs/js/plugins/pace.min.js'/>"></script>
    
    <!-- Page specific javascripts-->
    <script type="text/javascript" src="<c:url value='/resources/docs/js/plugins/chart.js'/>"></script>
    <script type="text/javascript">
      var data = {
      	labels: ["January", "February", "March", "April", "May"],
      	datasets: [
      		{
      			label: "My First dataset",
      			fillColor: "rgba(220,220,220,0.2)",
      			strokeColor: "rgba(220,220,220,1)",
      			pointColor: "rgba(220,220,220,1)",
      			pointStrokeColor: "#fff",
      			pointHighlightFill: "#fff",
      			pointHighlightStroke: "rgba(220,220,220,1)",
      			data: [65, 59, 80, 81, 56]
      		},
      		{
      			label: "My Second dataset",
      			fillColor: "rgba(151,187,205,0.2)",
      			strokeColor: "rgba(151,187,205,1)",
      			pointColor: "rgba(151,187,205,1)",
      			pointStrokeColor: "#fff",
      			pointHighlightFill: "#fff",
      			pointHighlightStroke: "rgba(151,187,205,1)",
      			data: [28, 48, 40, 19, 86]
      		}
      	]
      };
      var pdata = [
      	{
      		value: 300,
      		color: "#46BFBD",
      		highlight: "#5AD3D1",
      		label: "Complete"
      	},
      	{
      		value: 50,
      		color:"#F7464A",
      		highlight: "#FF5A5E",
      		label: "In-Progress"
      	}
      ]
      
      var ctxl = $("#lineChartDemo").get(0).getContext("2d");
      var lineChart = new Chart(ctxl).Line(data);
      
      var ctxp = $("#pieChartDemo").get(0).getContext("2d");
      var pieChart = new Chart(ctxp).Pie(pdata);
    </script>
    <!-- Google analytics script-->
    <script type="text/javascript">
      if(document.location.hostname == 'pratikborsadiya.in') {
      	(function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
      	(i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
      	m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
      	})(window,document,'script','//www.google-analytics.com/analytics.js','ga');
      	ga('create', 'UA-72504830-1', 'auto');
      	ga('send', 'pageview');
      }
    </script>
  </body>
</html>