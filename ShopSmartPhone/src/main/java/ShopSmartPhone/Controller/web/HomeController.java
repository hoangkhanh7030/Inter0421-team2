package ShopSmartPhone.Controller.web;

import ShopSmartPhone.DTO.UserDTO;
import ShopSmartPhone.Service.IUserService;
import ShopSmartPhone.Service.impl.UserService;
import ShopSmartPhone.Utils.FormUtil;
import ShopSmartPhone.Utils.SessionUtil;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ResourceBundle;

@WebServlet(urlPatterns = {"/trang-chu","/dang-nhap","/thoat"})
public class HomeController extends HttpServlet {
    ResourceBundle resourceBundle = ResourceBundle.getBundle("message");
    private IUserService userService;
    public HomeController(){
        userService = new UserService();
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action!= null && action.equals("login")){
            UserDTO userDTO = FormUtil.toModel(UserDTO.class,request);
            userDTO = userService.findByUserNameAndPassword(userDTO.getUsername(),userDTO.getPassword());
            if (userDTO != null ){
                SessionUtil.getInstance().putValue(request,"USERDTO",userDTO);
                if (userDTO.getRole().getRole_name().equals("user")){
                    response.sendRedirect(request.getContextPath()+"/trang-chu");

                }else if (userDTO.getRole().getRole_name().equals("admin")){
                    response.sendRedirect(request.getContextPath()+"/admin-home");
                }
            }else {

                response.sendRedirect(request.getContextPath()+"/dang-nhap?action=login&message=username_password_invalid&alert=danger");
            }
        }
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action != null && action.equals("login")){
            String message = request.getParameter("message");
            String alert = request.getParameter("alert");
                if (message != null && alert != null){
                    request.setAttribute("message",resourceBundle.getString(message));
                    request.setAttribute("alert",alert);

                }

            RequestDispatcher rd = request.getRequestDispatcher("/views/login/login.jsp");
            rd.forward(request, response);
        }else if (action != null && action.equals("logout")){
            SessionUtil.getInstance().removeValue(request,"USERDTO");
            response.sendRedirect(request.getContextPath()+"/trang-chu");
        }

        else {
            RequestDispatcher requestDispatcher=request.getRequestDispatcher("/views/web/web.jsp");
            requestDispatcher.forward(request,response);
        }

    }
}
