
public class Product 
{
    private int id;
    private String adi;
    private String distriction;
    private int price;
    public Product(int id,String adi,String distriction,int price)
    {
    this.id=id;
    this.adi=adi;
    this.distriction=distriction;
    this.price=price;
    }
public Product()
{

}
    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id>=50)
        {
        System.out.println("Sayi 50 den büyük olamaz...");
        }
        else
        {
        this.id = id;
        }
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getDistriction() {
        return distriction;
    }

    public void setDistriction(String distriction) {
        this.distriction = distriction;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void tostring(int id,String adi,String distriction,int price)
    {
     System.out.println(this.id+""+this.adi+""+this.distriction+""+this.price);
    }
}
