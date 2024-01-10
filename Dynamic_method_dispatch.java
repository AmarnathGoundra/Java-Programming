class A
{
    public void show()
    {
        System.out.println("In A show");
    }
}
class B extends A
{
    public void show()
    {
        System.out.println("In B show");
    }
}
class C extends A
{
    public void show()
    {
        System.out.println("In C show");
    }
}
class D
{
    
}

public class Dynamic_method_dispatch 
{
    public static void main(String args[])    
    {
        A obj = new A();
        obj.show();

        obj = new B();
        obj.show();

        obj = new C();
        obj.show();

        // obj = new D();  // Doesnot work as it doesnot extends A
    }
}
