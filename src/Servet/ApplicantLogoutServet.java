package Servet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ϵͳ�˳���������Servlet
 * 
 * @author QST����ʵѵ
 *
 */
@WebServlet("/ApplicantLogoutServet")
public class ApplicantLogoutServet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ApplicantLogoutServet() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// ����û��Ự��ʹ��ʧЧ
		request.getSession().invalidate();
		// �����ض�����վ��ҳ
		response.sendRedirect("Register.jsp");
	}

}
