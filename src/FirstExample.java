//第一步，引用要使用的包

import java.sql.*;

public class FirstExample {
    // 定义sql的引擎
    static final private String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    //定义sql的地址 端口 数据库
    static final private String DB_URL = "jdbc:mysql://localhost/test";
    //定义数据库的账号 密码
    static final private String USER = "root";
    static final private String PASS = "root";

    //主程序
    public static void main(String[] args) {
        //定义一些变量 用来承载
        Connection conn = null;
        Statement stmt = null;
        try {
            //STEP 2: 注册 JDBC driver
            Class.forName(JDBC_DRIVER);

            //STEP 3: 打开一个连接
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            //STEP 4: 执行一个查询
            System.out.println("Creating statement...");
            stmt = conn.createStatement();
            //定义一个sql
            String sql;
            sql = "SELECT id, create_date, app_code, app_name FROM app";
            ResultSet rs = stmt.executeQuery(sql);

            //STEP 5: 循环查询数据
            while (rs.next()) {
                //查询数据表的字段
                int id = rs.getInt("id");
                String create_date = rs.getString("create_date");
                String app_code = rs.getString("app_code");
                String app_name = rs.getString("app_name");

                //展示查询出的数据
                System.out.print("ID: " + id);
                System.out.print(", create_date: " + create_date);
                System.out.print(", app_code: " + app_code);
                System.out.println(", app_name: " + app_name);
            }
            //STEP 6: 关闭所有的连接   其实可以在finally的执行关闭数据库连接
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            //finally block used to close resources
            try {
                if (stmt != null)
                    stmt.close();
            } catch (SQLException se2) {
            }// nothing we can do
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }//end finally try
        }//end try
        System.out.println("There are so thing wrong!");
    }//end main
}//end FirstExample1

