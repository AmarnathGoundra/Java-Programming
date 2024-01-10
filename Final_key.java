final class Calcu
{
    public final void show()
    {
        System.out.println("In calcu show");
    }
    public void add(int n1, int n2)
    {
        System.out.println(n1+n2);
    }
}

// class AdvCalcu extends Calcu 
// {
//     public void show()
//     {
//         System.out.println("In AdvCalcu");
//     }
// }

public class Final_key 
{
    public static void main(String args[])    
    {
        final int num = 8;
        // num = 9 // get error
        
        Calcu obj = new Calcu();
        obj.show();
        obj.add(4,6);
    }
}
