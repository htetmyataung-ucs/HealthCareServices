<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="/WEB-INF/common/bootstrap.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
	$font: 'Poppins', sans-serif;
.cage {
	position: absolute;
	width: 100%;

	bottom: 0;
	top: 0;
  background: repeating-linear-gradient(90deg, transparent, transparent 	80px, #6f7376 80px, #181617 100px);
	z-index: 2;
	animation: close 3s linear;
}
h1 { 
	  position: fixed;
    z-index: 1;
    font-size: 23em;
    color:  #000;
    margin: auto;
    top: 0;
    left: 0;
    right: 0;
    bottom: 0;
    margin: 0;
    display: flex;
    align-items: center;
    justify-content: center;
    line-height: 0;
		z-index: 1;
		background-color: #E4E4E1;
 background-image: radial-gradient(at top center, rgba(255,255,255,0.03) 0%, rgba(0,0,0,0.03) 100%), linear-gradient(to top, rgba(255,255,255,0.1) 0%, rgba(143,152,157,0.60) 100%);
 	background-blend-mode: normal, multiply;
}
span {
	position: relative;
}
span:after {
    content: '403';
    position: absolute;
    top: 0;
    bottom: -96px;
    left: 40px;
    transform: scaleY(0.6) rotateX(-75deg) skewX(-10deg);
    transform-origin: 50% 100%;
    opacity: .2;
    line-height: 1;
}
@keyframes close {
    0% { left: -75%;}
    100%{ left: 0%}
}
</style>
</head>
<body>
<div class="cage"></div>
<h1><span>403</span></h1>
<button><a href="#">Back</a></button>
</body>
</html>