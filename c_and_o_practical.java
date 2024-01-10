class claculator
{
    public int add(int n1, int n2)
    {
        int r = n1 + n2;
        return r;
    }
}

public class c_and_o_practical 
{
    public static void main(String a[])    
    {
        int num1 = 8;
        int num2 = 6;

        claculator calc = new claculator();
        int result = calc.add(num1, num2);

        System.out.println(result);
    }
}