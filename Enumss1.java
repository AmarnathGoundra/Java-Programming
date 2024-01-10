enum Laptop
{
    Macbook(2000), Lenovo(600), Dell(1500), Asus;
    
    private int price;

    private Laptop()
    {
        price = 100;
    }

    private Laptop(int price)
    {
        this.price = price;
        System.out.println("Private Constructor");
    }

    public int getPrice() 
    {
        return price;
    }
    
}

public class Enumss1 
{
    public static void main(String args[])    
    {
        // Laptop lap = Laptop.Macbook;
        // System.out.println(lap + " : " + lap.getPrice());

        for(Laptop s : Laptop.values())
        {
            System.out.println(s + " : " + s.getPrice());
        }
    }
}
