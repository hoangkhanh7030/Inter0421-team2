package ShopSmartPhone.Controller.web;

import ShopSmartPhone.DTO.UserDTO;
import ShopSmartPhone.Service.IProductService;
import ShopSmartPhone.Service.IUserService;
import ShopSmartPhone.Service.impl.ProductService;
import ShopSmartPhone.Service.impl.UserService;
import ShopSmartPhone.Utils.FormUtil;
import ShopSmartPhone.Utils.SessionUtil;
import ShopSmartPhone.constant.SystemConstant;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ResourceBundle;

@WebServlet(urlPatterns = {"/trang-chu","/dang-nhap","/dang-ky","/thoat","/user-profile"})
public class HomeController extends HttpServlet {
    ResourceBundle resourceBundle = ResourceBundle.getBundle("message");
    private IProductService productService;
    private IUserService userService;
    public HomeController(){
        userService = new UserService();
        productService = new ProductService();
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
        String action = request.getParameter("action");
        if(action!= null && action.equals("login")){
            UserDTO userDTO = FormUtil.toModel(UserDTO.class,request);
            userDTO = userService.findByUserNameAndPassword(userDTO.getUsername(),userDTO.getPassword());
            if (userDTO != null ){
                SessionUtil.getInstance().putValue(request,"USERDTO",userDTO);
                if (userDTO.getRole().getRole_name().equals("USER")){
                    response.sendRedirect(request.getContextPath()+"/trang-chu");
                }else if (userDTO.getRole().getRole_name().equals("ADMIN")){
                    response.sendRedirect(request.getContextPath()+"/admin-home");
                }
            }else {
                response.sendRedirect(request.getContextPath()+"/dang-nhap?action=login&message=username_password_invalid&alert=danger");
            }
        }else if (action != null && action.equals("signup")){

            UserDTO userDTO = FormUtil.toModel(UserDTO.class,request);
            if (userService.findUsername(userDTO.getUsername())!=null) {
                response.sendRedirect(request.getContextPath()+"/dang-ky?action=signup&message=username_exist&alert=danger");
            }
            else {
                if (userDTO.getUsername() ==""){
                    response.sendRedirect(request.getContextPath()+"/dang-ky?action=signup&message=username_null&alert=danger");
                }else if (userDTO.getPassword() ==""){
                    response.sendRedirect(request.getContextPath()+"/dang-ky?action=signup&message=password_null&alert=danger");}
               else if (userDTO.getFullname() ==""){
                        response.sendRedirect(request.getContextPath()+"/dang-ky?action=signup&message=fullname_null&alert=danger");}
                else {

                    userDTO = userService.addUser(userDTO.getUsername(),userDTO.getPassword(),userDTO.getFullname(),2);
                    response.sendRedirect(request.getContextPath()+"/dang-nhap?action=login");
                }

            }
        }else if (action != null && action.equals("profile")){

            UserDTO updateProfile = FormUtil.toModel(UserDTO.class,request);
            updateProfile.setId(((UserDTO)SessionUtil.getInstance().getValue(request,"USERDTO")).getId());
            updateProfile = userService.updateProfile(updateProfile.getId(),updateProfile.getFullname(),updateProfile.getEmail(),updateProfile.getPhone_number(),updateProfile.getAddress(), updateProfile.getCountry(),updateProfile.getBank_name(),updateProfile.getBank_account_number());
            SessionUtil.getInstance().removeValue(request,"USERDTO");
            response.sendRedirect(request.getContextPath()+"/trang-chu");


        }
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
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
        }else if (action != null && action.equals("signup")){
            String message = request.getParameter("message");
            String alert = request.getParameter("alert");
            if (message != null && alert != null){
                request.setAttribute("message",resourceBundle.getString(message));
                request.setAttribute("alert",alert);
            }
            RequestDispatcher requestDispatcher=request.getRequestDispatcher("/views/signup/signup.jsp");
            requestDispatcher.forward(request,response);
        }else if(action != null && action.equals("profile")){
            request.setAttribute("account",userService.findUsername(((UserDTO)SessionUtil.getInstance().getValue(request,"USERDTO")).getUsername()));
            RequestDispatcher requestDispatcher=request.getRequestDispatcher("/views/profile/profile.jsp");
            requestDispatcher.forward(request,response);
        }else if(action != null && action.equals("shop")) {
            String name = request.getParameter("name");
            if(name !=null && name.equals("samsung")){
                request.setAttribute("productList",productService.findCategoryName("SAMSUN"));
                RequestDispatcher requestDispatcher = request.getRequestDispatcher("/views/shop/shop.jsp");
                requestDispatcher.forward(request, response);
            }else if (name !=null && name.equals("iphone")){
                request.setAttribute("productList",productService.findCategoryName("IPHONE"));
                RequestDispatcher requestDispatcher = request.getRequestDispatcher("/views/shop/shop.jsp");
                requestDispatcher.forward(request, response);
            }
            else if (name !=null && name.equals("xiaomi")){
                request.setAttribute("productList",productService.findCategoryName("XIAOMI"));
                RequestDispatcher requestDispatcher = request.getRequestDispatcher("/views/shop/shop.jsp");
                requestDispatcher.forward(request, response);
            }
            else if (name !=null && name.equals("realme")){
                request.setAttribute("productList",productService.findCategoryName("REALME"));
                RequestDispatcher requestDispatcher = request.getRequestDispatcher("/views/shop/shop.jsp");
                requestDispatcher.forward(request, response);
            }

            else {

            request.setAttribute("productList",productService.findAll());
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/views/shop/shop.jsp");
            requestDispatcher.forward(request, response);}

        }else if(action != null && action.equals("cart")) {
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/views/cart/cart.jsp");
            requestDispatcher.forward(request, response);
        }
        else {
            RequestDispatcher requestDispatcher=request.getRequestDispatcher("/views/web/web.jsp");
            requestDispatcher.forward(request,response);
        }

    }
}
