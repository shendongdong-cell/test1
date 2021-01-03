package Filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter(urlPatterns = { "/applicant/*" })
public class MyFilter implements Filter {

    public MyFilter() {
        // TODO Auto-generated constructor stub
    }
	 private String loginPage = "Register.jsp";
	    public void init(FilterConfig fConfig) throws ServletException {
	    }

	    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
	    	HttpServletRequest req = (HttpServletRequest) request;
	    	 System.out.println("拦截了"+req.getRequestURL());
	         HttpServletResponse resp = (HttpServletResponse) response;
	         HttpSession session = req.getSession();
	         // 判断被拦截的请求用户是否处于登录状态
	         if (session.getAttribute("applicant") == null) {
	             // 获取被拦截的请求地址及参数
	             String requestPath = req.getRequestURI();
	             if (req.getQueryString() != null) {
	                 requestPath += "?" + req.getQueryString();
	             }
	             // 将请求地址保存到request对象中转发到登录页面
	             req.setAttribute("requestPath", requestPath);
	             request.getRequestDispatcher( "/" + loginPage).forward(request, response);
	             return;
	         } else {
	        	 filterChain.doFilter(request, response);
	         }
	     }
	    public void destroy() {

	    }

}
