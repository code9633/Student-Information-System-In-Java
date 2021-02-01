
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class databaseConnection 
{
    final static String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    final static String DB_url = "jdbc:mysql://localhost:3306/student"; 
    final static String USER = "root";
    final static String PASS = "";
    
    
    public static Connection connection()
    {
        try
        {
            Class.forName(JDBC_DRIVER);
            Connection conn = DriverManager.getConnection(DB_url, USER, PASS);
            return conn;
        }
        catch(ClassNotFoundException | SQLException e)
        {
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
}
