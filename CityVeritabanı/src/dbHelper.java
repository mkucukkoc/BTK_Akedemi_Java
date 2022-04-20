import java.sql.*;
public class dbHelper 
{
   String root="root";
    String passwprd="1234";
    String dburl="jdbc:mysql://localhost:3306/world?useSSL=false&serverTimezone=UTC";
    public Connection getConnection() throws SQLException
    {
    return DriverManager.getConnection(dburl,root,passwprd);
    }
    public void showErrorMesaage(SQLException exception)
    {
    System.out.println("Error:"+exception.getMessage());
    System.out.println("Error Code:"+exception.getErrorCode());
    }    
}
