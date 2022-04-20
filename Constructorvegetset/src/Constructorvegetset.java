


public class Constructorvegetset {

    public static void main(String[] args)
    {
    
        Product product=new Product(1,"Mustafa", "Laptop", 5000);
        System.out.println(product.getAdi());
        Product product1=new Product();
        product.setId(10);
        System.out.println(product.getId());
        //System.out.println(product1.tostring());

    }
    
}
