interface Computer
{
    void code();
}

class Laptop implements Computer
{
    public void code()
    {
        System.out.println("Coding, Compiling, Running");
    }
}

class Desktop implements Computer
{
    public void code()
    {
        System.out.println("Coding, Compiling, Running : Faster");
    }
}

// class Developer
// {
//     public void DevApp(Laptop x)
//     {
//         x.code();
//     }
// }

class Developer
{
    public void DevApp(Computer x)
    {
        x.code();
    }
}

public class InterfacesNeed 
{
    public static void main(String aargs[])    
    {
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer amar = new Developer();
        amar.DevApp(desk);
        amar.DevApp(lap);
    }
}
