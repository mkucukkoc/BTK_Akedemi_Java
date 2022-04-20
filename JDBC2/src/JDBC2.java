import java.sql.*;
import java.util.ArrayList;
public class JDBC2 {

    public static void main(String[] args) throws SQLException  {
        //Listeleme();
       // Ekleme();
        //guncelleme();
        silme();
    }

    private static void Listeleme() throws SQLException {
        DbHelper dbhelper=new DbHelper();
        Connection connection=null;
        Statement statement=null;
        ResultSet resultset;
        try {
            String yol="select Code,Name,Continent,Region from country";
            connection=dbhelper.getConnection();
            statement=connection.createStatement();
            resultset=statement.executeQuery(yol);
            ArrayList<Country> countries=new ArrayList<Country>();
            while(resultset.next())
            {
                countries.add(new Country(
                        resultset.getString("Code"),
                        resultset.getString("Name"),
                        resultset.getString("Continent"),
                        resultset.getString("Region")));
                
            }
            System.out.println("Bağlantı Oluşturuldu..");
        }catch(SQLException exc)
        {
            dbhelper.showErrorMesagge(exc);
        }
        finally
        {
            connection.close();
            
        }    
    }
    private static void Ekleme() throws SQLException {
        Connection connection=null;
        DbHelper dbhelper=new DbHelper();
        PreparedStatement statement=null;
         try {
            connection=dbhelper.getConnection();
            String yol="insert into city (Name,CountryCode,District,Population) values(?,?,?,?)";
            statement=connection.prepareStatement(yol);
            statement.setString(1, "Kenya");
            statement.setString(2,"Kon");
            statement.setString(3,"Turkey");
            statement.setInt(4,10100);
           int r= statement.executeUpdate();
            System.out.println("Kayıt Eklendi..");
            
        }catch(SQLException exc)
        {
            dbhelper.showErrorMesagge(exc);
        }
        finally
        {
            statement.close();
            connection.close();
            
        }    
    }
    public static void guncelleme()throws SQLException{
    DbHelper DBHELPER=new DbHelper();
    Connection connection=null;
    PreparedStatement statement=null;
    try
    {
    String sqlsogu="Update city set Population=25123 where ID=?";
    connection=DBHELPER.getConnection();
    statement=connection.prepareStatement(sqlsogu);
    
    statement.setInt(1, 1);
    statement.executeUpdate();
    System.out.println("Kayıt Güncellendi..");
    }catch(SQLException exception)
    {
    DBHELPER.showErrorMesagge(exception);
    }
    finally{
    statement.close();
    connection.close();
    }
    
    
    }
    public static void silme()throws SQLException{
    DbHelper dbhelper=new DbHelper();
    Connection connection=null;
    PreparedStatement statement=null;
    try{
    String yol="Delete from city where ID=?";
    connection=dbhelper.getConnection();
    statement=connection.prepareStatement(yol);
    statement.setInt(1, 1);
    statement.executeUpdate();
        System.out.println("Kayıt Silindi..");
    }catch(SQLException EXCEPTİON)
    {
    dbhelper.showErrorMesagge(EXCEPTİON);
    }
        finally
    {
    statement.close();
    connection.close();
    }
    
    }
    }
    
