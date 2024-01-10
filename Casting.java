class A
{
    public void show1()
    {
        System.out.println("In A show");
    }
}
class B extends A
{
    public void show2()
    {
        System.out.println("In B show");
    }
}

public class Casting 
{
    public static void main(String args[])
    {
        A obj = (A) new B(); // upcasting
        obj.show1();
        // cant call show 2

        B obj1 = (B) obj;   // downcasting
        obj1.show2();
    }
}
