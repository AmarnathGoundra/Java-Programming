import Calculator.AdvCalci.*;

//import Calculator.Calc1;
import Calculator.Access1;


public class Calc
{
    public static void main(String args[])
    {
        VeryAdvCalc obj = new VeryAdvCalc();
        int r1 = obj.add(4,8);
        int r2 = obj.sub(8,3);
        int r3 = obj.mul(4,8);
        int r4 = obj.div(16,8);
        double r5 = obj.power(2,8);

        System.out.println(r1 + " : " + r2 + " : " + r3 + " : " + r4 + " : " + r5);

        System.out.println("-------------------------------------");

        Access1 as1 = new Access1();
        System.out.println(as1.marks);
        // System.out.println(as1.m1);  // not public

        Access2 as2 = new Access2();
        System.out.println(as2.markss); //Same package
    }
}