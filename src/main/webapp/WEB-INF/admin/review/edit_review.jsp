<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="/WEB-INF/common/include.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>review</title>
<script src="https://cdn.tiny.cloud/1/aq1wjkj3shean6kbqss5vduliotvnzh76uujc19hjkkoasc2/tinymce/5/tinymce.min.js" referrerpolicy="origin"></script>
<%@ include file="/WEB-INF/common/bootstrap.jsp"%>
<link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
<link href="<c:url value='/resources/assets/css/rating.css'/>" rel="stylesheet">
</head>
<body>

 <form:form action="${pageContext.request.contextPath}/admin/editReview" method="POST" modelAttribute="review">
 
<div class="container">
<h2>Edit Reviews</h2>
<form:hidden path="id"/>
 <div class="form-group">
    <form:label path="hospitalId"><h6>HospitalName:</h6></form:label>
     <form:select path="hospitalId" class="form-control">
        <c:forEach items="${hospitalList}" var="h">
           <form:option value="${h.id }">${h.name }</form:option>
        </c:forEach>
     </form:select>
     </div>
     
 	<!--  Description -->
  <div class="form-group">
	<form:label path="description">Description:</form:label>
   <textarea id="editor" name="description" class="form-control">${review.description }</textarea>
     </div>
       
    <!--  Rating -->
    <div class="form-group">   
    <form:label path="rating"><h6>Rating:</h6></form:label>
    <div class="main">
	<div id="rating-form">
<span class="rating-star">
<input type="radio" name="rating" value="5"><span class="star"></span>
 
    <input type="radio" name="rating" value="4"><span class="star"></span>
 
    <input type="radio" name="rating" value="3"><span class="star"></span>
 
    <input type="radio" name="rating" value="2"><span class="star"></span>
 
    <input type="radio" name="rating" value="1"><span class="star"></span>
</span>
	</div>
    </div>		
	</div>
	
	
    <button type="submit" class="btn btn-primary">Insert</button>
    <button type="reset" class="btn btn-primary">Reset</button>
    </div>
  </form:form>
 <script>
 tinymce.init({
   selector: 'textarea#editor',
   skin: 'bootstrap',
   plugins: 'lists, link, image, media',
   toolbar: 'h1 h2 bold italic strikethrough blockquote bullist numlist backcolor | link image media | removeformat help',
   menubar: false
 });
</script>
  	<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>    
	<script src="<c:url value='/resources/assets/js/rating.js'/>" type="text/javascript"></script>
</body>
</html>