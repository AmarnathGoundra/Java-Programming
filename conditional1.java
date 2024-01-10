public class conditional1 
{
    public static void main(String args[])    
    {
        int a = 1;

        if(false)
        System.out.println("It won't execute");
        
        if(true)
        System.out.println("Will execute");

        if(a%2 == 0 && a>10)
        System.out.println("It's a even number and greater than 10");
        else if(a%2 == 0 && a<10)
        System.out.println("Even number and less than 10");
        else
        {
            System.out.print("Odd number");
            if(a>10)
            System.out.println(" and greater than 10");
            else
            System.out.println(" and less than 10");
        }

        int result = a%2==0 ? 10 : 20;          // ternary operator
        System.out.println(result);
    }
}
