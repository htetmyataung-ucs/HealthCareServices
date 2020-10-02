<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ include file="/WEB-INF/common/include.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script src="https://cdn.tiny.cloud/1/aq1wjkj3shean6kbqss5vduliotvnzh76uujc19hjkkoasc2/tinymce/5/tinymce.min.js" referrerpolicy="origin"></script>
<script>
      tinymce.init({
        selector: '#mytextarea'
      });
    </script>
</head>
<body>
<form:form action="${pageContext.request.contextPath}/admin/create_article_detail" method="POST" modelAttribute="article_detail">
	<label><h6>Choose Article:</h6></label><br>
	<form:select path="articleId">
		<c:forEach items="${articleList}" var="art">
			<option value="${art.id }">${art.name }</option>
		</c:forEach>
	</form:select><br><br>
	<label><h6>Enter Name</h6></label>
	<br>
	
	<form:input path="name"/><br>
	<%-- Choose Gender<form:radiobutton path="gender" value="Male" label="Male"/><form:radiobutton path="gender" value="Female" label="Female"/><br> --%>
	<br>
	<label><h6>Choose Gender:</h6></label><br>
	<input type="radio" name="gender" value="Male">Male
	<input type="radio" name="gender" value="Female">Female
	<input type="radio" name="gender" value="All" checked>All
	<br><br>
	<label><h6>Description</h6></label><br>
	<textarea name="description" id="mytextarea" placeholder="Enter description" style="width:500px">Hello World!</textarea>
  
	<!-- <script>
    tinymce.init({
      selector: 'textarea',
      plugins: 'a11ychecker advcode casechange formatpainter linkchecker autolink lists checklist media mediaembed pageembed permanentpen powerpaste table advtable tinycomments tinymcespellchecker',
      toolbar: 'a11ycheck addcomment showcomments casechange checklist code formatpainter pageembed permanentpen table',
      toolbar_mode: 'floating',
      tinycomments_mode: 'embedded',
      tinycomments_author: 'Author name'
    });
  </script> -->
  <br><br>
	 <button type="submit" class="btn btn-primary">Submit</button>
    <button type="reset" class="btn btn-primary">Reset</button>
</form:form>

</body>
</html>