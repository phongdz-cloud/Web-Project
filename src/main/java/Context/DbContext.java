package Context;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbContext {
    private final String USER = "root";
    private final String PASSWORD= "123456";
    private final String DRIVE = "com.mysql.jdbc.Driver";
    private final String SERVER_NAME = "jdbc:mysql://localhost:3306/sale";
    public Connection getConnection(){
        try {
            Class.forName(DRIVE);
            return DriverManager.getConnection(SERVER_NAME,USER,PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void main(String[] args){
        DbContext context = new DbContext();
        if(context.getConnection()!=null){
            System.out.println("Kết nối thành công");
        }else{
            System.out.println("Kết nối thất bại");
        }
    }
}
