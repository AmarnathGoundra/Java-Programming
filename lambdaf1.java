@FunctionalInterface // only one methos in interface
interface A
{
    void show(int i);
}

public class lambdaf1 
{
    public static void main(String args[])    
    {
        A obj = (i) -> System.out.println("In A show : " + i);
        obj.show(6);
    }
}
