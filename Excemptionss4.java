class AmarException extends Exception
{
    public AmarException(String string)
    {
        super(string);
    }
}

public class Excemptionss4
{
    public static void main(String args[])    
    {
        int i = 20;
        int j = 0;

        try
        {
            j = 18/i;
            if(j==0)
            {
                throw new AmarException("I dont want to print Zero.."); // it takes constructor
            }

            System.out.println(j);
        }
        catch(AmarException e) // it takes class
        {
            j = 18/1;
            System.out.println("Thats a default exception.." + e);
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong... : " + e);
        }

        System.out.println(j);
        System.out.println("Bye...");
    }
}
