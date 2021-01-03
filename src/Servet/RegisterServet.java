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
		// �����������Ӧ����
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		// ��ȡ�������
		String session = request.getParameter("session");
		String password = request.getParameter("password");
        String requestPath=request.getParameter("requestPath");
		// ��¼��֤
		ApplicantDao dao = new ApplicantDao();
		Applicant applicant = (Applicant)dao.login(session, password);
		System.out.println(requestPath+"/"+"Register.jsp");
		if (applicant!=null) {
			// �û���¼�ɹ�,����ְ����Ϣ����session
			request.getSession().setAttribute("applicant", applicant);
			response.sendRedirect("MainFrame.jsp");
			if("".equals(requestPath)&&null==requestPath) {
				response.sendRedirect(requestPath+"/"+"Register.jsp");
		}else {
			// �û���¼��Ϣ���󣬽��д�����ʾ
			out.print("<script type='text/javascript'>");
			out.print("alert('�û���������������������룡');");
			out.print("window.location='Register.jsp';");
			out.print("</script>");
		}
		}
	}

}
