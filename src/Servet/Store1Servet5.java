package Servet;

import Dao.ArmyDao;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import Dao.ArmytypeDao;
@WebServlet("/Store1Servet5")
public class Store1Servet5 extends HttpServlet {
	public int i=0;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       this.doPost(req,resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out=resp.getWriter();
        ArmyDao dao=new ArmyDao();
        out.print("<script type='text/javascript'>");
		out.print("alert('��ӳɹ�');");
		out.print("window.location='Store5.jsp';");
		out.print("</script>");
        dao.save("VT-2��ս̹��","4586543532","���龩");
        i=dao.getSum("VT-2��ս̹��");
        ArmytypeDao dao1=new ArmytypeDao();
        dao1.save("װ�׳���","VT-2��ս̹��");
        req.getSession().setAttribute("number", i);
        resp.sendRedirect("Store5.jsp");
    }
}

