package mx.uv.basededatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static String url = "jdbc:mysql://127.0.0.1:3310/ejemplo_simple";
    private static String driverName = "com.mysql.jdbc.Driver";
    private static String user = "root";
    private static String password = "Luzmarisol14";
    private static Connection connection = null;

    public static Connection getConnection(){
        try{
            Class.forName(driverName);
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Success connection!");
        }catch(SQLException e){
            System.out.println("Failed to create the databases connection");
            e.printStackTrace();
        }catch(ClassNotFoundException e){
            System.out.println("Driver not found!");
        }
        return connection;
    }
}