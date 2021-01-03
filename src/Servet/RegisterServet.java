package Servet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Bean.Applicant;
import Dao.ApplicantDao;
import util.CookieEncryptTool;


@WebServlet("/RegisterServet")
public class RegisterServet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RegisterServet() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		// 设置请求和响应编码
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		// 获取请求参数
		String session = request.getParameter("session");
		String password = request.getParameter("password");
        String requestPath=request.getParameter("requestPath");
		// 登录验证
		ApplicantDao dao = new ApplicantDao();
		Applicant applicant = (Applicant)dao.login(session, password);
		System.out.println(requestPath+"/"+"Register.jsp");
		if (applicant!=null) {
			// 用户登录成功,将求职者信息存入session
			request.getSession().setAttribute("applicant", applicant);
			response.sendRedirect("MainFrame.jsp");
			if("".equals(requestPath)&&null==requestPath) {
				response.sendRedirect(requestPath+"/"+"Register.jsp");
		}else {
			// 用户登录信息错误，进行错误提示
			out.print("<script type='text/javascript'>");
			out.print("alert('用户名或密码错误，请重新输入！');");
			out.print("window.location='Register.jsp';");
			out.print("</script>");
		}
		}
	}

}
