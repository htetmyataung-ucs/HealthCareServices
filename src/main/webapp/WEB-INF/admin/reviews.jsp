<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="/WEB-INF/common/include.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script src="https://cdn.tiny.cloud/1/aq1wjkj3shean6kbqss5vduliotvnzh76uujc19hjkkoasc2/tinymce/5/tinymce.min.js" referrerpolicy="origin"></script>
<%@ include file="/WEB-INF/common/bootstrap.jsp"%>
<link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
<link href="resources/assets/css/rating.css" rel="stylesheet">
</head>
<body>

 <form:form action="create_review" method="POST" modelAttribute="review">
 
<div class="container">
<h2>Insert Reviews</h2>
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
     <form:label path="description"><h6>Description:</h6></form:label>
     <textarea name="description" placeholder="Enter description" style="width:500px">	</textarea>
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
    </div>
  </form:form>
  <script>
    tinymce.init({
      selector: 'textarea',
      plugins: 'a11ychecker advcode casechange formatpainter linkchecker autolink lists checklist media mediaembed pageembed permanentpen powerpaste table advtable tinycomments tinymcespellchecker',
      toolbar: 'a11ycheck addcomment showcomments casechange checklist code formatpainter pageembed permanentpen table',
      toolbar_mode: 'floating',
      tinycomments_mode: 'embedded',
      tinycomments_author: 'Author name'
    });
  </script>
  	<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>    
	<script src="resources/assets/js/rating.js" type="text/javascript"></script>
</body>
</html>