public class Excemptionss1 
{
    public static void main(String args[])    
    {
        int i = 0;
        int j = 0;
        
        try
        {
            j = 16/i;
            System.out.println(j);
        }
        catch(Exception e)
        {
            System.out.println("Unable to divide");
        }
        
        System.out.println("The End");
    }
}
