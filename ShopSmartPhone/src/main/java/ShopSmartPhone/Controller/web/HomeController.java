package ShopSmartPhone.Controller.web;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/trang-chu","/dang-nhap"})
public class HomeController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action != null && action.equals("login")){
            RequestDispatcher rd = request.getRequestDispatcher("/views/login.jsp");
            rd.forward(request, response);
        }else {
            RequestDispatcher requestDispatcher=request.getRequestDispatcher("/views/web/home.jsp");
            requestDispatcher.forward(request,response);
        }

    }
}
