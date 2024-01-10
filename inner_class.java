class A
{
    int age;

    public void show()
    {
        System.out.println("Showing");
    }

    class B
    {
        public void config()
        {
            System.out.println("Config...");
        }
    }

    static class C
    {
        public void systems()
        {
            System.out.println("Hello");
        }
    }
}

class D
{
    public void show()
    {
        System.out.println("Showing");
    }
}

abstract class E
{
    public abstract void show();
}

public class inner_class 
{
    public static void main(String args[])    
    {
        A obj = new A();
        obj.age = 20;
        obj.show();
        
        A.B obj1 = obj.new B();
        obj1.config();

        A.C obj2 = new A.C();
        obj2.systems();

        D obj5 = new D()
        {                 //anonymous inner class
            public void show()
            {
                System.out.println("Showing from anonymous inner class");
            }
        };
        obj5.show();

        E obj9 = new E() 
        {
            public void show()
            {
                System.out.println("Showing anonymous in abstract");
            }
        };
        obj9.show();

    }
}
