import KendiSınıfımızException.KendiSınıfımız;
import ThrowKulanımı1.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class exception {
    public static void main(String[] args) 
    {
        //Checked exception örneğidir
        BufferedReader reader=null;
    try
    {
    reader=new BufferedReader(new FileReader("C:\\Users\\Mustafa\\Desktop\\Java yapılan projeler\\NETBEANS\\Exception\\src\\Sayilar.txt"));
    }catch(Exception exc)
    {
    System.out.println(exc);
    }finally
    {
            try {
                reader.close();
            } catch (IOException ex) {
                System.out.println(ex);
            }
    }
    
        
        /*
    //throw kullanımi
    AccountManager manager=new AccountManager();
     System.out.println(manager.getHesap());
    manager.Hesapaekle(100);
    System.out.println(manager.getHesap());
        try {
            manager.paraCek(90);
        } catch (KendiSınıfımız ex) {
           System.out.println(ex.getMessage());
        }
        System.out.println("Hesap:"+manager.getHesap());
     try {
            manager.paraCek(90);
        } catch (KendiSınıfımız ex) {
           System.out.println(ex.getMessage());
        }
     System.out.println("Hesap:"+manager.getHesap());*/
    }
}
