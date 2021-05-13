package ShopSmartPhone.Controller.web;

import ShopSmartPhone.DTO.UserDTO;
import ShopSmartPhone.Service.IUserService;
import ShopSmartPhone.Service.impl.UserService;
import ShopSmartPhone.Utils.SessionUtil;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/user-profile"})
public class UserProfileController extends HttpServlet {

    private IUserService userService;
    public UserProfileController(){
        userService = new UserService();
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("account",userService.findUsername(((UserDTO)SessionUtil.getInstance().getValue(request,"USERDTO")).getUsername()));
        RequestDispatcher requestDispatcher=request.getRequestDispatcher("/views/profile/profile.jsp");
        requestDispatcher.forward(request,response);
    }
}
