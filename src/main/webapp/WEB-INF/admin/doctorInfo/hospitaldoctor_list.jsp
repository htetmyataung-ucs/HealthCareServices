<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="/WEB-INF/common/include.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>City List</title>
<%@ include file="/WEB-INF/common/bootstrap.jsp" %>
</head>
<body>
<div class="row">
        <div class="col-md-12">
          <div class="tile">
          	<div>
          		<div style="float:left">
          			<h3>Hospital Doctor List</h3>
          		</div>
          		<div style="float: right; margin-top:0px; margin-bottom: 15px;">
              		<button class="btn btn-primary">
               			 <a href="${pageContext.request.contextPath}/admin/create_hospitalDoctor" style="text-decoration: none; color: aliceblue;">Create HospitalDoctor</a>
              		</button>
            	</div>
            </div>
            <div class="tile-body">
              <div class="table-responsive">
                <table class="table table-hover table-bordered" id="sampleTable">
                  <thead>
                    <tr>
                     	<th>No</th>
                      	<th>Hospital Name</th>
		    			<th>Doctor Name</th>
						<th>StartDate</th>
						<th>EndDate</th>
						<th>StartTime</th>
						<th>EndTime</th>
						<th>Status</th>
                     	<th>Action</th>
                    </tr>
                  </thead>
                  <tbody>
                    <c:forEach items="${hospitaldoctorList}" var="hd" varStatus="r">
						<tr>
							<td>${r.count }</td>
							<td>${hd.hospitalName}</td>
							<td>${hd.doctorName}</td>
							<td>${hd.startDate }</td>
							<td>${hd.endDate}</td>
							<td>${hd.startTime}</td>
							<td>${hd.endTime}</td>
							<td>${hd.status }</td>  
							<td>
							<button class="btn btn-primary">
								<a href="${pageContext.request.contextPath}/admin/editHospitalDoctor/${hd.id}" style="text-decoration:none; color:white;">Edit</a>
							</button>
							<button class="btn btn-primary">
								<a href="${pageContext.request.contextPath}/admin/deleteHospitalDoctor/${hd.id}" style="text-decoration:none; color:white;">Delete</a>
							</button>
							</td>
						</tr>
					</c:forEach>                  
                  </tbody>
                </table>
              </div>
            </div>
          </div>
        </div>
      </div>
      
      <!-- Page specific javascripts-->
    <!-- Data table plugin-->
    <script type="text/javascript" src="<c:url value='/resources/docs/js/plugins/jquery.dataTables.min.js'/>"></script>
    <script type="text/javascript" src="<c:url value='/resources/docs/js/plugins/dataTables.bootstrap.min.js'/>"></script>
    <script type="text/javascript">$('#sampleTable').DataTable();</script>
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