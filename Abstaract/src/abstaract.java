
public class abstaract {

    public static void main(String[] args)
    {
        
        CustomerManager customerManager=new CustomerManager();
        customerManager.basedatamanager=new  SqlServer();
        customerManager.getCustomers();          
    }
    
}
