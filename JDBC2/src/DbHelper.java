import java.sql.*;
public class DbHelper 
{
   String dburl="jdbc:mysql://localhost:3306/world?useSSL=false&serverTimezone=UTC";
   String password="1234";
   String user="root";
 public Connection getConnection() throws SQLException
 {
 return DriverManager.getConnection(dburl,user,password);
 }
    public void showErrorMesagge(SQLException exception)
    {
    System.out.println("Hata:"+exception.getMessage());
    System.out.println("Error Code : "+exception.getErrorCode());
    }
}
