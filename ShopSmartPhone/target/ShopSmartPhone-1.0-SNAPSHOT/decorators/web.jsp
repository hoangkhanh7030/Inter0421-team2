<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp" %>
<html>
<head>
    <title><dec:title default="Trang chủ" /></title>
    <!-- Google Fonts -->
    <link href='http://fonts.googleapis.com/css?family=Titillium+Web:400,200,300,700,600' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Roboto+Condensed:400,700,300' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Raleway:400,100' rel='stylesheet' type='text/css'>

    <!-- Bootstrap -->
    <link rel="stylesheet" href="<c:url value='/template/web/css/bootstrap.min.css'/>">

    <!-- Font Awesome -->
    <link rel="stylesheet" href="<c:url value='/template/web/css/font-awesome.min.css'/>">

    <!-- Custom CSS -->
    <link rel="stylesheet" href="<c:url value='/template/web/css/owl.carousel.css'/>">
    <link rel="stylesheet" href="<c:url value='/template/web/style.css'/>">
    <link rel="stylesheet" href="<c:url value='/template/web/css/responsive.css'/>">

</head>
<body id="container">
<!-- header -->
<%@ include file="/common/web/header.jsp" %>
<!-- header -->

<dec:body/>


<!-- footer -->
<%@ include file="/common/web/footer.jsp" %>

<!-- Latest jQuery form server -->
<script src="https://code.jquery.com/jquery.min.js"></script>

<!-- Bootstrap JS form CDN -->
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>

<!-- jQuery sticky menu -->
<script src="<c:url value='/template/web/js/owl.carousel.min.js'/>"></script>
<script src="<c:url value='/template/web/js/jquery.sticky.js'/>"></script>

<!-- jQuery easing -->
<script src="<c:url value='/template/web/js/jquery.easing.1.3.min.js'/>"></script>

<!-- Main Script -->
<script src="<c:url value='/template/web/js/main.js'/>"></script>

<!-- Slider -->
<script type="text/javascript" src="<c:url value='/template/web/js/bxslider.min.js'/>"></script>
<script type="text/javascript" src="<c:url value='/template/web/js/script.slider.js'/>"></script>
</body>
</html>
