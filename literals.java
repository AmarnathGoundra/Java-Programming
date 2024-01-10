class literals
{
    public static void main(String a[])
    {
        int num1 = 0b101;
        int num2 = 0x7E;
        System.out.println(num1);
        System.out.println(num2);

        int num3 = 10_00_00_000;
        System.out.println(num3);

        double num4 = 56;
        System.out.println(num4);

        double num5 = 12e10;
        System.out.println(num5);

        char c = 'a';
        c++;
        System.out.println(c);

        
    }
}