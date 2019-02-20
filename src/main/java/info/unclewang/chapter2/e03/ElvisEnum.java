package info.unclewang.chapter2.e03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public enum  ElvisEnum {

    /**
     * 单元素枚举类型实现单例
     */
    INSTANCE;

    private Connection connection;

    private ElvisEnum() {
        try {
            System.out.println("调用了MyObject的构造");
            String url = "jdbc:mysql://localhost:3306/test";
            String username = "root";
            String password = "wx1996";
            String driverName = "com.mysql.jdbc.Driver";
            Class.forName(driverName);
            connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }
}
