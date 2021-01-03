package Dao;

import Bean.Applicant;
import util.DBUtil;

import java.sql.*;
public class ApplicantDao {
    public boolean isExistEmail(String names) {
        Connection conn = DBUtil.getConnection();
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM userinfo WHERE names=?";
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, names);
            rs = pstmt.executeQuery();
            if (rs.next())
                return true;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.closeJDBC(rs, pstmt, conn);
        }
        return false;
    }

    public int getSum(){
        Connection conn = DBUtil.getConnection();
        String sql = "select count(*) from userinfo";
        Statement s = null;
        int sum = 0;
        try {
            s = conn.createStatement();
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()) {
                sum = rs.getInt(1);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            DBUtil.closeJDBC(null, s, conn);
        }
        return sum;
    }

    public Applicant login(String ID, String password) {
        String name;
        String session;
        String passwords;
        Applicant user=null;
        Connection conn = DBUtil.getConnection();
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM userinfo WHERE session ='"+ID+"' and password='"+password+"'";
        try {
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            if (rs.next()) {
            	name=rs.getString("names");
                session=rs.getString("session");
                passwords=rs.getString("password");
                user=new Applicant(name,session,password);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.closeJDBC(rs, pstmt, conn);
        }
        return user;
    }
    public void save(String name, String id,String password) {
        Connection conn = DBUtil.getConnection();
        PreparedStatement pstmt = null;
        String sql = "INSERT INTO userinfo(names,session,password) VALUES(?,?,?)";
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,name);
            pstmt.setString(2, id);
            pstmt.setString(3, password);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.closeJDBC(null, pstmt, conn);
        }
    }
}

