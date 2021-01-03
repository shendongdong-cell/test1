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
	    	 System.out.println("������"+req.getRequestURL());
	         HttpServletResponse resp = (HttpServletResponse) response;
	         HttpSession session = req.getSession();
	         // �жϱ����ص������û��Ƿ��ڵ�¼״̬
	         if (session.getAttribute("applicant") == null) {
	             // ��ȡ�����ص������ַ������
	             String requestPath = req.getRequestURI();
	             if (req.getQueryString() != null) {
	                 requestPath += "?" + req.getQueryString();
	             }
	             // �������ַ���浽request������ת������¼ҳ��
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
