public class conditional2 
{
    public static void main(String args[])    
    {
        int a = 12;
        int b = 13;

        int n = 4;

        switch(n)
        {
            case 1:
                System.out.println("Addition : "+(a+b));
                break;
            case 2:
                System.out.println("Subtraction : "+(a-b));
                break;
            case 3:
                System.out.println("Multiplication : "+(a*b));
                break;
            case 4:
                System.out.println("Division : "+(a/b));
                break;
            case 5:
                System.out.println("Remainder : "+(a%b));
                break;
            default:
                System.out.println("Enter the valid number");
        }
    }
}
