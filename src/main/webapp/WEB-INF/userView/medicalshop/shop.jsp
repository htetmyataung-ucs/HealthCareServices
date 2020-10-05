<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="/WEB-INF/common/include.jsp"%>

<script>
$(document).ready(function(){
	console.log('ok');
	$("#cityId").change(function(){
		var cityId=this.value;
		$.ajax({
		      type: 'GET',
		      contentType : "application/json",
		      url: "${pageContext.request.contextPath}/findTownshipByRegion/"+cityId,
		     
		    
		      success: function(resultData) { 
		    	  console.log(resultData);
		    	  $(".searchTownshipId").empty();
		    	  var html="";
		    	  resultData.forEach(function(std,i){
		    		  console.log(std.id);
		    		  console.log(std.name);
		    		  $(".searchTownshipId").append("<option value='"+std.id+"'>"+std.name+"</option>");
		    		 // html+="<option value='"+std.id+"'>"+std.name+"</option>";
		    		  
		    	  });
		    	  //$("#searchTownshipId").html(html);
		      }
		});
	});
	
});

</script>

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
                                <h1 data-animation="fadeInUp" data-delay=".3s">Medical Shop</h1>
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

        <div style="width: 100%; margin-top: -100px;">
            <div style="width: 100%; height: 20%; padding-bottom:100px;" >
            	<form:form action="${pageContext.request.contextPath}/searchShop" method="GET">
            	
                <div style="width: 30%; height: 100%; float: left;">
                     
                        <h3>City</h3>                    
                        <select id="cityId" class="form-select" style="">
                      		<c:forEach items="${cityList}" var="c">
								 <option <c:if test="${c.id eq cityId}">selected="selected"</c:if>    value="${c.id}">${c.name} </option>
							</c:forEach>
                        </select>
                   
                </div>
                <div style="width:10%; height:100%; float:left;">
                	<p></p>
                </div>
                <div style="width: 30%; height: 100%; float: left;">                   
                    <h3>Township</h3>                      
                        <select id="searchTownshipId" class="searchTownshipId form-select form-control" name="townshipId" style="width:100px;">                     	
							<c:forEach items="${townshipList}" var="t">
								  <option <c:if test="${t.id eq townid}">selected="selected"</c:if>    value="${t.id}">${t.name} </option>
							</c:forEach>					
                        </select>
                </div>
                 <div style="width:10%; height:100% float:left;">
                 	<p></p>
                </div>
                <div style="width: 20%; height: 100%; float: right;">
                    <button type="submit" class="btn" style="padding:20px; margin-top:20px;">Search</button>
                </div>
                </form:form>
            </div>
            <div style="width: 100%; height: 80%;">
            <table id="shop_table" class="table table-hover table-bordered">
				<thead>
					<tr>
						<th>Name</th>
						<th>Phone</th>
						<th>Address</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${shopSearchList}" var="shop">
						<tr>
							<td>${shop.name }</td>
							<td>${shop.phone }</td>
							<td>${shop.address }</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<label>Describe the issue in detail</label>
      <div class="form-group">
         <textarea id="editor"></textarea>
      </div>
		
  <script>
  tinymce.init({
    selector: 'textarea#editor',
    skin: 'bootstrap',
    plugins: 'lists, link, image, media',
    toolbar: 'h1 h2 bold italic strikethrough blockquote bullist numlist backcolor | link image media | removeformat help',
    menubar: false
  });
</script>
            </div>
        </div>
    </div>
</section>
</main>
