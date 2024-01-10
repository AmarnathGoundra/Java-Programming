class claculator
{
    int num = 6;                // instance variable

    public int add(int n1, int n2)
    {
        return n1+n2;
    }
}

public class stack_and_heap 
{
    public static void main(String args[])
    {
        claculator calc = new claculator();
        claculator calc1 = new claculator();

        calc.num = 8;

        System.out.println(calc.num);
        System.out.println(calc1.num);
    }
}
