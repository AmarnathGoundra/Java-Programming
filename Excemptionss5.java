class A
{
    public void show() throws ClassNotFoundException
    {
        Class.forName("Amarnath");
    }
}

public class Excemptionss5 
{
    static
    {
        System.out.println("Class Loaded");
    }

    public static void main(String args[])    
    {
        A obj = new A();

        try
        {
            obj.show();
        }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }

    }
}
