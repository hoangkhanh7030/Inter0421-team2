package ShopSmartPhone.Filter;

import ShopSmartPhone.DTO.UserDTO;
import ShopSmartPhone.Utils.SessionUtil;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AuthorizationFilter implements Filter {
    private ServletContext context;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.context = filterConfig.getServletContext();

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response =(HttpServletResponse) servletResponse;
        String url = request.getRequestURI();
        if (url.startsWith("/admin")){
            UserDTO userDTO =(UserDTO) SessionUtil.getInstance().getValue(request,"USERDTO");
            if (userDTO!= null){
                if (userDTO.getRole().getRole_name().equals("ADMIN")){
                    filterChain.doFilter(servletRequest,servletResponse);
                }else if(userDTO.getRole().getRole_name().equals("USER")){
                    response.sendRedirect(request.getContextPath()+"/dang-nhap?action=login&message=not_permisson&alter=danger");
                }

            }else {
                response.sendRedirect(request.getContextPath()+"/dang-nhap?action=login&message=not_login&alter=danger");
            }
        }else {
            filterChain.doFilter(servletRequest,servletResponse);
        }
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
