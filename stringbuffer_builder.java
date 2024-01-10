public class stringbuffer_builder 
{
    public static void main(String args[])    
    {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());
        sb.append("Hello");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb);

        StringBuffer sb1 = new StringBuffer("Hello Boys");
        System.out.println(sb1.capacity());
        System.out.println(sb1.delete(7,10));

        String str = sb.toString();
        System.out.println(str);

        System.out.println(sb1.deleteCharAt(3));

        sb1.insert(5, "Java");
        System.out.println(sb1);

        sb.setLength(30);
    }
}
