package KendiSınıfımızException;
public class KendiSınıfımız extends Exception
{
    String mesaj;
   public KendiSınıfımız(String mesaj)
   {
          this.mesaj=mesaj;
   }             
   public String getMesaj()
   {
   return this.mesaj;
   }
}
