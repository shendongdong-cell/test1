package Servet;

import Dao.ApplicantDao;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/RecordServet")
public class RecordServet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       this.doPost(req,resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out=resp.getWriter();
        String name=req.getParameter("names");
        String sessions=req.getParameter("session");
        String password=req.getParameter("password");
        ApplicantDao dao=new ApplicantDao();
        
        if(dao.isExistEmail(sessions)){
            out.print("<script type='text/javascript'>");
            out.print("alert('×¢²á´íÎó£¡');");
            out.print("window.location='Record.jsp';");
            out.print("</script>");
        }else{
            dao.save(name,sessions,password);
            resp.sendRedirect("Register.jsp");
        }
    }
}
