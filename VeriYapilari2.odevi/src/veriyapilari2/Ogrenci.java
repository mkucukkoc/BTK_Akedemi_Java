package veriyapilari2;
 class Ogrenci
{
public int ogrno;
public String ogradi;
public String ogrsoyadi;
public Ogrenci next;
    public Ogrenci(int ogrno1,String ogradi1,String ogrsoyadi1)
   {
      ogrno =ogrno1;
      ogradi=ogradi1;
      ogrsoyadi=ogrsoyadi1;
   }
    public void displayogrenci()
    {
        System.out.println("{Numarası:"+ ogrno +", Adi:"+ ogradi +", Soyadi:"+ogrsoyadi+"}");
        
    }
}

 
