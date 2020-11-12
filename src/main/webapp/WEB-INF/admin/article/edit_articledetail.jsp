<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ include file="/WEB-INF/common/include.jsp"%>
<!DOCTYPE html>
<html lang="en">
  <head>
   <meta charset="ISO-8859-1">
   <title>Insert title here</title>
   <meta charset="utf-8">
     </head>
  <body>
  <h3>Edit Article Details</h3>
<form:form action="${pageContext.request.contextPath}/admin/edit_articleDetail" method="POST" enctype="multipart/form-data" modelAttribute="articleDetail">
	
	<div class="form-group">
	<form:hidden path="id"/>
    <form:label path="articleId">Choose Article:</form:label>
	<form:select path="articleId" items="${articleList}" itemValue="id" itemLabel="name" class="form-control">
		
	</form:select>
	
	</div>
	<div class="form-group">
	<form:label path="name">Enter Name:</form:label>
	<form:input path="name" class="form-control"/>
	<%-- Choose Gender<form:radiobutton path="gender" value="Male" label="Male"/><form:radiobutton path="gender" value="Female" label="Female"/><br> --%>
	</div>
	
	<div class="form-group">
     <form:label path="file">Photo:</form:label>
      <form:input  path="file" type="file" class="form-control" placeholder="Choose photo:"></form:input>
    </div>
    
	<h6>Choose Gender:</h6>
	<input type="radio" name="gender" value="Male">Male
	<input type="radio" name="gender" value="Female">Female
	<input type="radio" name="gender" value="All" checked>All
	<br><br>
	 <div class="form-group">
	<form:label path="name">Description:</form:label>
   <textarea id="editor" name="description" class="form-control">${articleDetail.description}</textarea>
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
  <br><br>
	 <button type="submit" class="btn btn-primary">Submit</button>
    <button type="reset" class="btn btn-primary">Reset</button>
</form:form>
 </body>
</html>