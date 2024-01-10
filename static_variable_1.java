class Mobile
{
    String brand;
    int price;
    static String name;

    static
    {
        name = "Phone";
        System.out.println("In static block");
    }

    public Mobile()
    {
        brand = "";
        price = 2000;
        System.out.println("In constructor");
    }

    public void show()
    {
        System.out.println(brand + " : " + price + " : " + name);
    }
}

public class static_variable_1 
{
    public static void main(String args[]) throws ClassNotFoundException
    {
        Class.forName("Mobile");


        // Mobile mb1 = new Mobile();
        // mb1.brand = "Apple";
        // mb1.price = 15000;
        // mb1.brand = "SmartPhone";

        // Mobile mb2 = new Mobile();
    }
}
