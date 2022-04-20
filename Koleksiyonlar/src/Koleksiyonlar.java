
import java.util.ArrayList;

public class Koleksiyonlar {
    public static void main(String[] args) 
    { 
     ArrayList liste=new ArrayList();
     liste.add(1);
     liste.add(2);
     liste.add("Ankara");   
     for(Object list:liste)
     {
     System.out.println(list);
     }
     //AŞAGI TARAFTAAKİ KODLAR SINIFLARLA YAPILAN KODLAR
     ArrayList<Customer> customers=new ArrayList<Customer>();
     
     Customer customers2=new Customer(0, "Veli","Sadi");
     
     customers.add(customers2);
     
     customers.add(new Customer(1,"Mustafa","Küçükkoç"));
     customers.add(new Customer(3,"Mustafa","Koç"));
     customers.add(new Customer(2,"Ali","Koç"));
     
     customers.remove(customers2);
     for(Customer cusomer:customers)
     {
     System.out.println(cusomer.id+"-"+cusomer.firstname+"-"+cusomer.lastname);
     }
     
     
     
    }
}
