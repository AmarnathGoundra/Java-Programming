class claculator
{
    public double add(double n1, int n2)
    {
        return n1+n2;
    }

    public double add(double n1, int n2, int n3)
    {
        return n1+n2+n3;
    }
}

public class method_overloading 
{
    public static void main(String args[])    
    {
        claculator calc = new claculator();
        double r = calc.add(3.8, 4, 8);

        System.out.println(r);
    }
}
