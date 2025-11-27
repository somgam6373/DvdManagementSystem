import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;

public static void main(String[] args) {

    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    try{

        //Register JDBC driver
        Class.forName("com.mysql.jdbc.Driver");

        //Open a connection
        System.out.println("Connecting to database...");
        conn = DriverManager.getConnection("jdbc:mysql://localhost/mydb",
                "root",'0211");

        stmt = conn.createStatement();
        rs=stmt.executeQuery("select * from movie")






    }catch (SQLException ex) {
        //Handle errors for JDBC
        ex.printStackTrace();
    }catch (Exception e){
        //Handle errors for Class.forName
        e.printStackTrace();
    }
}