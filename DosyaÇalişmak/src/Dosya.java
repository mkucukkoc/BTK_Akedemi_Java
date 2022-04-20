
import java.io.*;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Dosya {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
   createFile();
   dosyaBilgileri();
   dosyaOkuma();
   dosyayaYazma();
    } 
    public static void createFile()
    { 
        File file =new File("C:\\Users\\Mustafa\\Desktop\\Java yapılan projeler\\NETBEANS\\DosyalarlaÇalışmak\\src\\students.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("Dosya Oluşturuldu..");
            }
            else{
            System.out.println("Dosya Zattten var..");
            
            }
        } catch (IOException ex) {
            
            ex.printStackTrace();
        }  
    }
    public static void dosyaBilgileri()
    {
    File file =new File("C:\\Users\\Mustafa\\Desktop\\Java yapılan projeler\\NETBEANS\\DosyalarlaÇalışmak\\src\\students.txt");
    
    try{
    if(file.exists())
    {
     System.out.println("Dosya Adi:"+file.getName());
     System.out.println("Dosya Yolu:"+file.getAbsolutePath());
     System.out.println("Dosyaya Yazilabilir mi :"+file.canWrite());
     System.out.println("Dosya Okunabilir mi :"+file.canRead());
     System.out.println("Dosya Boyutu(byte):"+file.length());
    }
    }catch(Exception exc)
    {
    exc.printStackTrace();
    }
    }
  
    public static void dosyayaYazma()
    { 
        Scanner scaner=new Scanner(System.in);   
     try
         //apend=true yağmak demek dosyanın içine bişey yazarsak onun içindekilerini silmiyor ve içindeki veriler duruyor
         //ama true yapmazsak bğtğn içindeki verileri siler ve sadece yazacagımız isimleri yazar
         
     {//String yol="C:\\Users\\Mustafa\\Desktop\\Java y(apılan projeler\\NETBEANS\\DosyalarlaÇalışmak\\src\\students.txt";
        BufferedWriter writer=new BufferedWriter(new FileWriter("C:\\Users\\Mustafa\\Desktop\\Java yapılan projeler\\NETBEANS\\DosyalarlaÇalışmak\\src\\aaa.txt",true));
       /* System.out.println("Kaydedilecek ismi giriniz.");
        String isim=scaner.nextLine();*/
        //writer.newLine();
        writer.write("Ali");
     System.out.println("Dosyaya yazıldı.");
     writer.close();
     }
     
     catch(Exception exc)
     {
     exc.printStackTrace();
     }
    
    }
    public static void dosyaOkuma()
    {   try {
        File file =new File("C:\\Users\\Mustafa\\Desktop\\Java yapılan projeler\\NETBEANS\\DosyalarlaÇalışmak\\src\\aaa.txt");  
        Scanner scaner=new Scanner(file);
        while(scaner.hasNextLine())
        {
        String line=scaner.nextLine();
        System.out.println(line);
        
        }
        scaner.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    
    }
}
