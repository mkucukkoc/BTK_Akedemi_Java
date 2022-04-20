package ThrowKulanımı1;

import KendiSınıfımızException.KendiSınıfımız;

public class AccountManager {
 double hesap;
public void Hesapaekle(double total)
{hesap=getHesap()+total;
}
public void paraCek(double total) throws KendiSınıfımız
{
    if(hesap>=total)
    {
        hesap=getHesap()-total;
    
    }else
    {
    throw new KendiSınıfımız("Bakiye Yetersiz..");
    }
}
public double getHesap() 
{
  return hesap;
 }   
}
