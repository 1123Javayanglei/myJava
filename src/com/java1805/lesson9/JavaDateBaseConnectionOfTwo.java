package com.java1805.lesson9;


import java.sql.*;

import com.mysql.cj.jdbc.Driver;

import javax.xml.crypto.Data;

/**
 * @author yanglei
 * 1.加载驱动
 * 2.获取链接对象
 * 3.获取语句对象
 * 4.执行SQL语句
 * 5.关流
 */
public class JavaDateBaseConnectionOfTwo {

    private final static String DB_URL="jdbc:mysql://localhost:8889/nz_191215";
    private final static String USERNAME="root";
    private final static String PASSWORD="root";

    public static void main(String[] args) throws ClassNotFoundException, SQLException, SQLException {

        //1.加载驱动
        Class.forName("com.mysql.jdbc.Driver");

        //2.通过驱动管理器获得对象
        Connection conn = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);

        //3.通过连接对象获得执行语句对象
        Statement s = conn.createStatement();

        //4.执行 sql
        /*
         * execute() 执行任意类型SQL
         * executeUpdate() 增删改 return 受影响的行数
         * executeQuery() 查 return 查询返回的虚拟表结果 --> 结果集
         */
        ResultSet rs = s.executeQuery("select * from user ");

        while (rs.next()){
            /*
             * ResultSet 中提供了一系列 get*的方法
             * get*(int columnIndex)    列索引
             * get*(int columnLabel)    列标签 有别名获取该字段的值，如果没有别名就按照标签
             */
            int id=rs.getInt("id");
            String name=rs.getString("name");
            String password=rs.getString("password");
            Date date=rs.getDate("date");
            System.out.println(id+" "+name+" "+password+" "+date+" ");

    }

        rs.close();
        s.close();
        conn.close();




    }

}
