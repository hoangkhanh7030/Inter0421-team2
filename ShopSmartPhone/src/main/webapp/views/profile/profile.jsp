<%@include file="/common/taglib.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<html>
<head>
    <title>Thông tin người dùng</title>
</head>
<body>

<div class="container rounded bg-white mt-5">
    <form action="<c:url value='/user-profile'/> " method="post">
    <div class="row">
        <div class="col-md-4 border-right">
            <div class="d-flex flex-column align-items-center text-center p-3 py-5"><img class="rounded-circle mt-5" src="/template/profile/avatar.png" width="90"><span class="font-weight-bold">${USERDTO.fullname}</span><span class="text-black-50">${USERDTO.email}</span><span>${USERDTO.country}</span></div>
        </div>

        <div class="col-md-8">
            <div class="p-3 py-5">
                <div class="d-flex justify-content-between align-items-center mb-3">
                    <div class="d-flex flex-row align-items-center back"><i class="fa fa-long-arrow-left mr-1 mb-1"></i>
                        <a href="<c:url value='/trang-chu'/> "><h6>Back to home</h6></a>
                    </div>
                    <h6 class="text-right">Edit Profile</h6>
                </div>
                <div class="row mt-2">
                    <div class="col-md-6"><input type="text" class="form-control" name="username" placeholder="Username" value="${USERDTO.username}" disabled></div>
                    <div class="col-md-6"><input type="text" class="form-control" name="fullname" value="${USERDTO.fullname}" placeholder="Fullname"></div>
                </div>
                <div class="row mt-3">
                    <div class="col-md-6"><input type="text" class="form-control" name="email" placeholder="Email" value="${USERDTO.email}"></div>
                    <div class="col-md-6"><input type="text" class="form-control" name="phone_number" value="${USERDTO.phone_number}" placeholder="Phone number"></div>
                </div>
                <div class="row mt-3">
                    <div class="col-md-6"><input type="text" class="form-control" name="address" placeholder="address" value="${USERDTO.address}"></div>
                    <div class="col-md-6"><input type="text" class="form-control" name="country" value="${USERDTO.country}" placeholder="Country"></div>
                </div>
                <div class="row mt-3">
                    <div class="col-md-6"><input type="text" class="form-control" name="bank_name" placeholder="Bank Name" value="${USERDTO.bank_name}"></div>
                    <div class="col-md-6"><input type="text" class="form-control" name="bank_account_number" value="${USERDTO.bank_account_number}" placeholder="Bank account number"></div>
                </div>

                <div class="mt-5 text-right">
                    <input type="hidden" value="profile" id="action" name="action"/>
                    <button class="btn btn-primary profile-button" type="submit">Save Profile</button></div>
            </div>
        </div>

    </div>
    </form>
</div>

</body>
</html>
