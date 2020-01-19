package com.java1805.lesson9;

import java.sql.*;

import com.mysql.jdbc.*;
import com.mysql.cj.jdbc.*;




/**
 * @author yanglei
 *
 * java 链接数据库
 */
public class JavaDateBaseConnectionOfOne {

    private final static String DB_URL ="jdbc:mysql://localhost:8889/s1805";
    /**
     * jdbc:mysql :// hostname : port / databaseName
     */
    private final static String USERNAME="root";
    private final static String PASSWORD="root";


    public static void main(String[] args) throws SQLException {
        Connection conn=null;
        PreparedStatement pstmt=null;
        ResultSet rs=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn= DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);

//            String insertSql="insert into student(studentName,studentNumber,passWord) values(?,?,?)";
//            String updateSql="update student se where id=5";
            String deleteSql="delete from student where Id in(?,?)";

            pstmt = conn.prepareStatement(deleteSql);

            pstmt.setString(1,"5");

            pstmt.setString(2,"7");

            pstmt.execute();

            String selectSql="SELECT * FROM student ";
            pstmt = conn.prepareStatement(selectSql);
            rs=pstmt.executeQuery();
            while (rs.next()){
                String code=rs.getString(1);
                String name=rs.getString("studentName");
                String gradeName =rs.getString("studentNumber");
                System.out.println(code+" "+name+" "+gradeName);
            }
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC失败!");
        }catch (SQLException e){
            System.out.println("数据库链接失败!");
        }finally {
            try {
                if (conn!=null) {
                    conn.close();
                }
                if (pstmt!=null) {
                    pstmt.close();
                }
                if (rs!=null) {
                    rs.close();
                }
            }catch (SQLClientInfoException e){
                System.out.println("释放数据库资源失败");
            }
        }
    }
}
