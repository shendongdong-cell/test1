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

@WebServlet("/Store1Servet6")
public class Store1Servet6 extends HttpServlet {
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
		out.print("window.location='Store6.jsp';");
		out.print("</script>");
		dao.save("VT-4主战坦克","43346656632","仇是界");
        i=dao.getSum("VT-4主战坦克");
        ArmytypeDao dao1=new ArmytypeDao();
        dao1.save("装甲车辆","VT-4主战坦克");
        req.getSession().setAttribute("number", i);
        resp.sendRedirect("Store6.jsp");
    }
}
