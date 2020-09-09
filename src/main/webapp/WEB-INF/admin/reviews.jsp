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
<h2>Insert Reviews</h2>
 <form:form action="save_reviews" method="POST" modelAttribute="reviews">
 <div class="form-group">
    <form:label path="hospital">Hospital Name:</form:label>
     <form:select path="hospital.id" class="form-control">
        <c:forEach items="${hospital }" var="hospital">
           <form:option value="${hospital.id }">${hospital.name }</form:option>
        </c:forEach>
     </form:select>
     </div>
 
  <div class="form-group">
     <form:label path="description">Description:</form:label>
      <form:input type="text" class="form-control" placeholder="Enter Description" path="description"></form:input>
    </div>
    
    <div class="form-group">
    <div class="stars">
  <form action="rating" class="form-control">
    <input class="star star-5" id="star-5" type="radio" name="star"/>
    <label class="star star-5" for="star-5"></label>
    <input class="star star-4" id="star-4" type="radio" name="star"/>
    <label class="star star-4" for="star-4"></label>
    <input class="star star-3" id="star-3" type="radio" name="star"/>
    <label class="star star-3" for="star-3"></label>
    <input class="star star-2" id="star-2" type="radio" name="star"/>
    <label class="star star-2" for="star-2"></label>
    <input class="star star-1" id="star-1" type="radio" name="star"/>
    <label class="star star-1" for="star-1"></label>
  </form>
</div>
</div>
     
    <button type="submit" class="btn btn-primary">Insert</button>
  </form:form>
</body>
</html>