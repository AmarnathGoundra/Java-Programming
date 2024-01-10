class A
{
    public int add(int n1, int n2)
    {
        return n1+n2;
    }
}

class B extends A
{
    public int add(int n1, int n2)
    {
        return n1+n2+1;
    }
}

public class method_overriding 
{
    public static void main(String args[])    
    {
        B obj = new B();
        int r1 = obj.add(2,5);
        System.out.println(r1);
    }
}