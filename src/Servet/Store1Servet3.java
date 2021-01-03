package Servet;

import Dao.ArmyDao;
import Dao.ArmytypeDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Store1Servet3")
public class Store1Servet3 extends HttpServlet {
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
		out.print("alert('添加成功');");
		out.print("window.location='Store3.jsp';");
		out.print("</script>");
        dao.save("plz-45自行火炮","38565483","郑战");
        i=dao.getSum("plz-45自行火炮");
        ArmytypeDao dao1=new ArmytypeDao();
        dao1.save("火炮","plz-45自行火炮");
        req.getSession().setAttribute("number", i);
        resp.sendRedirect("Store3.jsp");
    }
}

