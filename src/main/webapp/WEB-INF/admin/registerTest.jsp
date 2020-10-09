<%@ include file="/WEB-INF/common/include.jsp"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- Main CSS-->
    <link rel="stylesheet" type="text/css" href="<c:url value='/resources/docs/css/main.css'/>">
    <!-- Font-icon css-->
    <link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">

    <title>register</title>
  </head>
  <body>
    <section class="material-half-bg">
      <div class="cover"></div>
    </section>
    <section class="login-content">
      <!--<div style="margin-top: - 20px; margin-bottom: 20px; font-size: 30px; font-weight: bolder;">
        <h1>Health Care Service</h1>
      </div>-->
      <div class="login-box" style="width: 60%; height: 550px;">
        <form:form class="login-form" action="${pageContext.request.contextPath}/registerTest" method="POST" modelAttribute="user">
          <h3 class="login-head" style="margin-top:-30px;"><i class="fa fa-lg fa-fw fa fa-users"></i>Create New Account</h3>
            <div style="width:100%; height:100%; margin-top:-15px;">
              <div style="width:100%; height:90%">
              <div style="width:45%; height:100%; float:left;">

                <div class="form-group">
                  <label class="control-label">Role:</label>
                  <select name="roleId" class="form-control">
                    <c:forEach items="${roleList }" var="r">
                      <option value="${r.id }">${r.role }</option>
                    </c:forEach>
                  </select>
                </div>
				
				<div class="form-group">
                  <label class="control-label">Email:</label>
                  <input type="text" name="email" class="form-control"
                    placeholder="Enter Email.."></input>
                </div>
				
                <div class="form-group">
                  <label class="control-label">Phone:</label>
                  <input type="text" class="form-control"
                    placeholder="Enter phone" name="phone"></input>
                </div>

                <div class="form-group">
                  <label class="control-label">NRC:</label>
                  <input type="text" class="form-control" placeholder="Enter nrc"
                    name="nrc"></input>
                </div>

                <div class="form-group">
                  <label class="control-label">Address:</label>
                  <input type="text" class="form-control"
                    placeholder="Enter address" name="address"></input>
                </div>

                
              </div>
              <div style="width: 10%; height: 100%; float: left;"></div>
              <div style="width:45%; height:100%; float:left;">

                <div class="form-group">
                  <label class="control-label">Name:</label>
                  <input type="text" class="form-control"
                    placeholder="Enter name" name="name"></input>
                </div>
				
				<div class="form-group">
                  <label class="control-label">Password:</label>
                  <input type="password" class="form-control"
                    placeholder="Enter password" name="password"></input>
                </div>
                

                <div class="form-group">
                  <label class="control-label">Age:</label>
                  <input type="text" class="form-control" placeholder="Enter age"
                    name="age"></input>
                </div>

                <div class="form-group">
                  <label class="control-label">Blood Type:</label>
                  <input type="text" class="form-control"
                    placeholder="Enter blood type" name="bloodType"></input>
                </div>


              </div> 
            </div>
            <div style="width: 100%; height: 10%;">
              <div class="form-group btn-container">
                <button class="btn btn-primary btn-block"><i class="fa fa-sign-in fa-lg fa-fw"></i>SIGN IN</button>
              </div>
            </div>             
            </div>
         
        </form:form>
        
      </div>
    </section>
<!-- Essential javascripts for application to work-->
    <script src="<c:url value='/resources/docs/js/jquery-3.3.1.min.js'/>"></script>
    <script src="<c:url value='/resources/docs/js/popper.min.js'/>"></script>
    <script src="<c:url value='/resources/docs/js/bootstrap.min.js'/>"></script>
    <script src="<c:url value='/resources/docs/js/main.js'/>"></script>
    <!-- The javascript plugin to display page loading on top-->
    <script src="/resources/docs/js/plugins/pace.min.js"></script>
    
  </body>
</html>