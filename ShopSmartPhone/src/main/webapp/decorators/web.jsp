<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp" %>
<html>
<head>
    <title><dec:title default="Trang chủ" /></title>
    <link href="<c:url value='/template/web/css/bootstrap.min.css'/> " rel="stylesheet">
    <link href="<c:url value='/template/web/css/font-awesome.min.css'/> " rel="stylesheet">
    <link href="<c:url value='/template/web/css/prettyPhoto.css'/> " rel="stylesheet">
    <link href="<c:url value='/template/web/css/price-range.css'/> " rel="stylesheet">
    <link href="<c:url value='/template/web/css/animate.css'/> " rel="stylesheet">
    <link href="<c:url value='/template/web/css/main.css'/> " rel="stylesheet">
    <link href="<c:url value='/template/web/css/responsive.css'/> "rel="stylesheet">
<%--    <link rel="shortcut icon" href="<c:url value='/template/web/images/ico/favicon.ico'/>">--%>
<%--    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="<c:url value='/template/web/images/ico/apple-touch-icon-144-precomposed.png'/>">--%>
<%--    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="/template/web/images/ico/apple-touch-icon-114-precomposed.png">--%>
<%--    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="/template/web/images/ico/apple-touch-icon-72-precomposed.png">--%>
<%--    <link rel="apple-touch-icon-precomposed" href="/template/web/images/ico/apple-touch-icon-57-precomposed.png">--%>


</head>
<body id="container">
<!-- header -->
<%@ include file="/common/web/header.jsp" %>
<!-- header -->

<dec:body/>


<!-- footer -->
<%@ include file="/common/web/footer.jsp" %>

<script src="<c:url value='/template/web/js/jquery.js'/>"></script>
<script src="<c:url value='/template/web/js/bootstrap.min.js'/>"></script>
<script src="<c:url value='/template/web/js/jquery.scrollUp.min.js'/>"></script>
<script src="<c:url value='/template/web/js/price-range.js'/>"></script>
<script src="<c:url value='/template/web/js/jquery.prettyPhoto.js'/>"></script>
<script src="<c:url value='/template/web/js/main.js'/>"></script>
</body>
</html>
