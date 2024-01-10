@FunctionalInterface // only one methos in interface
interface A
{
    int add(int i, int j);
}

public class lambdaf2
{
    public static void main(String args[])    
    {
        A obj = (i,j) -> i+j;

        int result = obj.add(5,6);
        System.out.println("Add : " + result);
    }
}
