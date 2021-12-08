package cn.itcast.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.cj.jdbc.Driver;
/*
* JDBC快速入门
*/
public class jdbcDemo1 {
    public static void main(String[] args) throws Exception {
        //1. 导入驱动jar包
        //2. 注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        //3. 获取数据库连接对象
        DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","AKB0048");
        //4.定义sql语句
        String sql =






    }
}
