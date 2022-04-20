import java.util.Scanner;
import Matematik.*;
public class Packpage {
    public static void main(String[] args) 
    {
      // BİR PACKPAGE EKLEDİK MATEMATİK ADINDA İÇİNDE DE BİR CLASS EKLEDİK VE ONU PROJEMİZE İMPORT ETTİK
      //SONRA TOPLAMA  İŞLEMİNİ YAPTIK...
      Scanner scanner=new Scanner(System.in);
      System.out.println("Adınızı GİRİNİZ.");
      String ad=scanner.nextLine();
      System.out.println("Adınız: "+ad);
      Dortislem dortıslem=new  Dortislem();
      dortıslem.topla(8, 10);
    }
}
