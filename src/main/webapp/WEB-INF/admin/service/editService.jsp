<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ include file="/WEB-INF/common/include.jsp"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset=UTF-8>
    <title>This page is running in standards mode!</title>
     </head>
  <body>
  <h3>Insert Service</h3>
<form:form action="${pageContext.request.contextPath}/admin/editService" method="POST" enctype="multipart/form-data" modelAttribute="service">
	<form:hidden path="id"/>
	<div class="form-group">
	<form:label path="name">Enter Name:</form:label>
	<form:input path="name" class="form-control"/>
	</div>
	
	<div class="form-group">
     <form:label path="file">Photo:</form:label>
      <form:input  path="file" type="file" class="form-control" placeholder="Choose photo:"></form:input>
    </div>
    
	 <div class="form-group">
	<form:label path="name">Description:</form:label>
   <textarea id="editor" name="description" class="form-control">${service.description }</textarea>
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