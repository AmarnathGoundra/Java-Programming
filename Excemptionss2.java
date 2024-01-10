public class Excemptionss2 
{
    public static void main(String args[])    
    {
        int i = 3;
        int j = 0;
        int nums[] = new int[5];
        String str = null;

        try
        {
            j = 18/i;
            System.out.println(j);
            // System.out.println(str.length());
            System.out.println(nums[1]);
            System.out.println(nums[5]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot divivde by zero.");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Limit exceeded..");
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong... : " + e);
        }
        System.out.println("Bye...");
    }
}