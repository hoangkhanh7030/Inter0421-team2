<%@include file="/common/taglib.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<html>
<head>

    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Đăng Ký</title>
    <script>
        function validate()
        {
            var fullname = document.form.fullname.value;
            var username = document.form.username.value;
            var password = document.form.password.value;
            var conpassword= document.form.re_pass.value;

            if (fullname==null || fullname=="")
            {
                alert("Full Name can't be blank");
                return false;
            }

            else if (username==null || username=="")
            {
                alert("Username can't be blank");
                return false;
            }
            else if(password.length<6)
            {
                alert("Password must be at least 6 characters long.");
                return false;
            }
            else if (password!=conpassword)
            {
                alert("Confirm Password should match with the Password");
                return false;
            }
        }
    </script>

</head>
<body id="formSignUp">
<div class="container">
    <div class="d-flex justify-content-center h-100">
        <div class="card">
            <div class="card-header">
                <h3>Đăng Ký</h3>

            </div>
            <div class="card-body">
                <form action="<c:url value='/dang-ky'/> " method="post" id="signupForm">

                    <c:if test="${not empty message}">
                        <div class="alert alert-${alert}" role="alert">
                                ${message}
                        </div>
                    </c:if>


                    <div class="input-group form-group">

                        <div class="input-group-prepend">
                            <span class="input-group-text"><i class="fas fa-user"></i></span>
                        </div>


                        <input type="text" class="form-control" id="username" placeholder="Tên Đăng Nhập" name="username">

                    </div>
                    <div class="input-group form-group">

                        <div class="input-group-prepend">
                            <span class="input-group-text"><i class="fas fa-user"></i></span>
                        </div>


                        <input type="text" class="form-control" id="fullname" placeholder="Họ Và Tên" name="fullname">

                    </div>
                    <div class="input-group form-group">
                        <div class="input-group-prepend">
                            <span class="input-group-text"><i class="fas fa-key"></i></span>
                        </div>
                        <input type="password" class="form-control" id="password" placeholder="Mật Khẩu" name="password">
                    </div>

                    <div class="form-group">
                        <input type="hidden" value="signup" id="action" name="action"/>
                        <button type="submit" class="btn float-right login_btn">Đăng Ký</button>
                    </div>
                    <div class="card-footer">
                        <div class="d-flex justify-content-center links">
                            <a href='<c:url value="/dang-nhap?action=login"/> '>Do you already have an account</a>
                        </div>

                    </div>
                </form>
            </div>

        </div>
    </div>
</div>
</body>
</html>
