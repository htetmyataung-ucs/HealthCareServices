<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="/WEB-INF/common/include.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>
<main>
    <!--? Slider Area Start-->
    <div class="slider-area slider-area2">
        <div class="slider-active dot-style">
            <!-- Slider Single -->
            <div class="single-slider  d-flex align-items-center slider-height2">
                <div class="container">
                    <div class="row align-items-center">
                        <div class="col-xl-7 col-lg-8 col-md-10 ">
                         <div class="hero-wrapper">
                            <div class="hero__caption">
                                <h1 data-animation="fadeInUp" data-delay=".3s">contact</h1>
                                <p data-animation="fadeInUp" data-delay=".6s">Almost before we knew it, we<br> had left the ground</p>
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

        <div style="width: 100%; margin-top: -20px;">
            <div style="width: 100%; height: 20%; margin-bottom:30px;">
            	<form:form action="${pageContext.request.contextPath}/searchShop" method="GET">
            	
                <div style="width: 20%; height: 100%; float: left; ">
                     
                        <label>City</label><br>                        
                        <select id="cityId">
                      		<c:forEach items="${cityList}" var="c">
								<option value="${c.id}">${c.name}</option>
							</c:forEach>
                        </select>
                   
                </div>
                <div style="width: 20%; height: 100%; float: left;">
                   
                    
                </div>
                <div style="width: 60%; height: 100%; float: left;">
                    <button  class="button button-contactForm boxed-btn" type="submit"  style="padding: 10px; margin-top: 15px;">Search</button>
                </div>
                </form:form>
            </div>
            <div style="width: 100%; height: 70%;">
            <table id="shop_table" class="table table-hover table-bordered">
				<thead>
					<tr>
						<th>Name</th>
						<th>Phone</th>
						<th>Address</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${shopList}" var="shop">
						<tr>
							<td>${shop.name }</td>
							<td>${shop.phone }</td>
							<td>${shop.address }</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
            </div>
        </div>
    </div>
</section>
</main>
<script>
$(document).ready(function(){
	console.log('ok');
	alert("OK");
	$("#cityId").change(function(){
		var cityId=this.value;
		$.ajax({
		      type: 'GET',
		      contentType : "application/json",
		      url: "${pageContext.request.contextPath}/findTownshipByRegion/"+cityId,
		     
		    
		      success: function(resultData) { 
		    	  console.log(resultData);
		    	  $("#townId").empty();
		    	  resultData.forEach(function(std,i){
		    		  console.log(std.id);
		    		  console.log(std.name);
		    		  $("#townId").append("<option value='"+std.id+"'>"+std.name+"</option>");
		    		  
		    	  });
		      }
		});
	});
	
});

</script>
</body>
</html>