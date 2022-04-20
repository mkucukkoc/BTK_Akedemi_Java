
public class overridingornek {

    public static void main(String[] args)
    {
        BaseKrediManager[] kredimanagers =new BaseKrediManager[]
        {
             new TarımKrediManager(),
             new OgrenciKrediManager()
        };
        for(BaseKrediManager krediManager:kredimanagers)
        {
         System.out.println(krediManager.hesapla(10000));
        }
    }
    
}
