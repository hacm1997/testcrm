package com.test.crmapi.tools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionSQL {

    private static String host="localhost";
    private static String dataBaseName="crm_database";
    private static String user="root";
    private static String servicePort="3306";

    public static Connection getConnection() throws SQLException{
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException ex){
            System.out.println("Connection Error: "+ex.getMessage());
        }

        String connectUrl="jdbc:mysql://"+host+":"+servicePort+"/"+dataBaseName;

        return DriverManager.getConnection(connectUrl,user,null);
    }

    public static void main(String[] args){
        Connection con;
        try{
            con=getConnection();
            System.out.println("Status connection: ON"+con);
            con.close();
        }catch (SQLException sqlx){
            System.out.println(sqlx.getMessage());
        }
    }
}
