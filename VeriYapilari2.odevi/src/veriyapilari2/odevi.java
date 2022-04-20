package veriyapilari2;

import java.util.Scanner;

public class odevi
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        OgrenciList thelist=new OgrenciList();
        thelist.insertSorted(1,"Ali", "Veli");
        thelist.insertSorted(3,"Ayşe", "Aslan");
        thelist.insertSorted(160,"Ada", "Akça");
        thelist.insertSorted(5,"Mehmet", "Küçük");
        boolean kontrol =true;
        while(kontrol)
        {
        System.out.print("Seçiminiz: Arama(1), Ekleme(2), Silme(3), Listeleme(4), Çıkış(5): Lütfen birini seçiniz.");
        int a =scanner.nextInt();
        if(a==1)
        {
            System.out.println("Arama kriteriniz: Numara(1), Adı(2), Soyadı(3)");
            int secim=scanner.nextInt();
        if(secim==1)
        {
        System.out.println("Ögrenci numarasını giriniz.");
        int no=scanner.nextInt();
        Ogrenci ogren=thelist.find(no);
        System.out.println(no+" Bulundu.");
        ogren.displayogrenci();
        System.out.println(""); 
        }
        }
        else if(a==2)
        {
        System.out.println("Ögrenci numarasını giriniz.");
        int no=scanner.nextInt();
        System.out.println("Ögrenci adını giriniz.");
        String adi=scanner.next();
        System.out.println("Ögrenci soyadını giriniz.");
        String soyadi=scanner.next();
        thelist.insertSorted(no, adi, soyadi);
        }
        else if(a==3)
        {
        thelist.displayList();
       System.out.println("Ögrenci numarasını giriniz.");
        int no1=scanner.nextInt();
        Ogrenci ogren=thelist.delete(no1);
        System.out.println(no1+" Silindi.");
        System.out.println(""); 
        }  
        else if(a==4)
        {
          thelist.displayList();
        }
        else 
        {
         kontrol=false;
        } 
        
        }  
    }
}
    
