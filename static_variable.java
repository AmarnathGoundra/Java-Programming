class Mobile
{
    String brand;
    int price;
    static String name;

    public void show()
    {
        System.out.println(brand + " : " + price + " : " + name);
    }

    public static void show1(Mobile obj)
    {
        System.out.println(obj.price + " : " + obj.brand);
    }
}

public class static_variable 
{
    public static void main(String args[])    
    {
        Mobile mb1 = new Mobile();
        mb1.brand = "Apple";
        mb1.price = 1500;
        Mobile.name = "SmartPhone";

        Mobile mb2 = new Mobile();
        mb2.brand = "Samsung";
        mb2.price = 1900;
        Mobile.name = "SmartPhone";

        Mobile.name = "Phone";

        mb1.show();
        mb2.show();

        Mobile.show1(mb2);
    }
}
