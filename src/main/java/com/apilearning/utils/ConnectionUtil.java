package com.apilearning.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

public class ConnectionUtil {
    static Logger logger = Logger.getLogger(ConnectionUtil.class.getSimpleName());
    public static Connection createConnection(){
        try{
            String url = System.getenv("url");
            String user = System.getenv("user");
            String password = System.getenv("password");

            Connection connection = DriverManager.getConnection(url,user,password);
            System.out.println("Connection is successful. ");
            return connection;
        } catch (SQLException e) {
            e.printStackTrace();
            logger.info("Connect cannot be established");
            return null;
        }

    }
    public static void main(String[] args) {
        System.out.println(createConnection());
    }
}
