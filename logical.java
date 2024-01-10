public class logical 
{
    public static void main(String args[])
    {
        int a = 9;
        int b = 7;
        int m = 5;
        int n = 8;

        boolean result = a>b && m>n;
        System.out.println(result);

        result = a>b || m>n;
        System.out.println(result);

        System.out.println(!result);
    }
}
