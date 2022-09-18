package com.apilearning.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

public class ConnectionUtil {
    static Logger logger = Logger.getLogger(ConnectionUtil.class.getSimpleName());
    public static Connection createConnection(){
        String url2 = String.valueOf(System.getProperties().keys());
        System.out.println("env is: "+url2);

        try{
           // String url;// = "jdbc:postgresql://localhost:5432/postgres";
           // String user = "postgres"; String password = "new_password";
            String url = System.getenv("url");
            String user = System.getenv("user");
            String password = System.getenv("password");

           // String s = "jdbc:postgresql://localhost:5432/postgres?user=postgres&password=new_password";

            Connection connection = DriverManager.getConnection(url,user,password);
            System.out.println("Connection is successful. ");
            return connection;
        } catch (SQLException e) {
            e.printStackTrace();
            logger.info("Connect cannot be established");
            logger.info("env is "+url2);
            return null;
        }

    }

    public static void main(String[] args) {
        System.out.println(createConnection());
    }
}
