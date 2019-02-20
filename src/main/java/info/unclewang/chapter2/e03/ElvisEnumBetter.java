package info.unclewang.chapter2.e03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ElvisEnumBetter {

    public enum MyEnumSingleton {
        /**
         * 数据连接工厂
         */
        connectionFactory;

        private Connection connection;

        MyEnumSingleton() {
            try {
                System.out.println("创建MyObject对象");
                String url = "jdbc:mysql://localhost:3306/test";
                String username = "root";
                String password = "wx1996";
                String driverName = "com.mysql.jdbc.Driver";
                Class.forName(driverName);
                connection = DriverManager.getConnection(url, username, password);
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }

        public Connection getConnection() {
            return connection;
        }
    }

    public static Connection getConnection() {
        return MyEnumSingleton.connectionFactory.getConnection();
    }
}