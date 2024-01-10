class A extends Object
{
    public A()
    {
        super();
        System.out.println("In A");
    }
    public A(int a)
    {
        super();
        System.out.println("In A int");
    }
}
class B extends A
{
    public B()
    {
        super();
        System.out.println("In B");
    }
    public B(int a)
    {
        this();
        System.out.println("In B int");
    }
}

public class this_super 
{
    public static void main(String args[])    
    {
        B obj = new B(5);
    }
}
