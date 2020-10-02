<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ include file="/WEB-INF/common/include.jsp"%>

<!DOCTYPE html>
<html>
<head>
<script src="https://cdn.tiny.cloud/1/aq1wjkj3shean6kbqss5vduliotvnzh76uujc19hjkkoasc2/tinymce/5/tinymce.min.js" referrerpolicy="origin"></script>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="create_article_detail" method="POST" modelAttribute="article_detail">
	Choose Article:
	<form:select path="articleId">
		<c:forEach items="${articleList}" var="art">
			<option value="${art.id }">${art.name }</option>
		</c:forEach>
	</form:select><br>
	Enter Name<form:input path="name"/><br>
	<%-- Choose Gender<form:radiobutton path="gender" value="Male" label="Male"/><form:radiobutton path="gender" value="Female" label="Female"/><br> --%>
	Choose Gender:
	<input type="radio" name="gender" value="Male">Male
	<input type="radio" name="gender" value="Female">Female
	<input type="radio" name="gender" value="All" checked>All
	<br>
	Description<br>
	<textarea name="description" placeholder="Enter description" style="width:500px">	</textarea>
  
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
  <br>
	<input type="submit" value="Submit"/>  
</form:form>

</body>
</html>