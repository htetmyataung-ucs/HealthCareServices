<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="/WEB-INF/common/include.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<meta charset="utf-8">
     <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
<h2>Insert Hospital Type</h2>
  <form:form action="create_hospitalType" method="POST" modelAttribute="hospitaltype">
   <div class="container">
   <div class="form-group">
   <form:label path="name">Choose Hospital Type:</form:label>
     <form:select path="name" class="form-control">
           <form:option value="private">PRIVATE</form:option>
           <form:option value="public">PUBLIC</form:option>
     </form:select>
     </div>
    <button type="submit" class="btn btn-primary">Submit</button>
    </div>
  </form:form>

</body>
</html>