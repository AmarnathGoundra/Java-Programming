class type_conversion 
{
    public static void main(String args[])
    {
        byte b = 127;
        int a = b;
        System.out.println(a);
        byte k = (byte)a;
        System.out.println(k);

        float f = 5.6f;
        int t = (int) f;

        System.out.println(t);

        byte n = 10;
        byte m = 20;
        int l = n*m;
        
        System.out.println(l);
    }
}
