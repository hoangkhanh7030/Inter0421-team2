
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>


<div class="header-area">
    <div class="container">
        <div class="row">
            <div class="col-md-8">
                <div class="user-menu">
                    <ul>
                        <c:if test="${not empty USERDTO}">
                            <li><a href='<c:url value="/user-profile?action=profile"/>'><i class="fa fa-user"></i> My Account</a></li>
                            <li><a href="cart.html"><i class="fa fa-user"></i> My Cart</a></li>
                            <li><a href='<c:url value="/thoat?action=logout"/>'><i class="fa fa-user"></i> Logout</a></li>
                        </c:if>
                        <c:if test="${empty USERDTO}">
                            <li><a href='<c:url value="/dang-ky?action=signup"/>'><i class="fa fa-user"></i> Signup</a></li>
                            <li><a href='<c:url value="/dang-nhap?action=login"/>'><i class="fa fa-user"></i> Login</a></li>
                        </c:if>
                    </ul>
                </div>
            </div>

            <div class="col-md-4">
                <div class="header-right">
                    <ul class="list-unstyled list-inline">
                        <li class="dropdown dropdown-small">
                            <a data-toggle="dropdown" data-hover="dropdown" class="dropdown-toggle" href="#"><span class="key">currency :</span><span class="value">USD </span><b class="caret"></b></a>
                            <ul class="dropdown-menu">
                                <li><a href="#">USD</a></li>
                                <li><a href="#">INR</a></li>
                                <li><a href="#">GBP</a></li>
                            </ul>
                        </li>

                        <li class="dropdown dropdown-small">
                            <a data-toggle="dropdown" data-hover="dropdown" class="dropdown-toggle" href="#"><span class="key">language :</span><span class="value">English </span><b class="caret"></b></a>
                            <ul class="dropdown-menu">
                                <li><a href="#">English</a></li>
                                <li><a href="#">French</a></li>
                                <li><a href="#">German</a></li>
                            </ul>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</div>
<div class="site-branding-area">
    <div class="container">
        <div class="row">
            <div class="col-sm-6">
                <div class="logo">
                    <h1><a href="./"><img src="/template/web/img/logo.png"></a></h1>
                </div>
            </div>

            <div class="col-sm-6">
                <div class="shopping-item">
                    <a href="cart.html">Cart - <span class="cart-amunt">$100</span> <i class="fa fa-shopping-cart"></i> <span class="product-count">5</span></a>
                </div>
            </div>
        </div>
    </div>
</div>
<div class="mainmenu-area">
    <div class="container">
        <div class="row">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
            </div>
            <div class="navbar-collapse collapse">
                <ul class="nav navbar-nav">
                    <li class="active"><a href='<c:url value="/trang-chu"/>'>Home</a></li>
                    <li><a href='<c:url value="/trang-chu?action=shop"/>'>Shop page</a></li>
                    <li><a href="single-product.html">Single product</a></li>
                    <li><a href='<c:url value="/trang-chu?action=cart"/>'>Cart</a></li>
                    <li><a href="checkout.html">Checkout</a></li>
                    <li><a href="#">Category</a></li>

                </ul>
            </div>
        </div>
    </div>

</div> <!-- End mainmenu area -->
