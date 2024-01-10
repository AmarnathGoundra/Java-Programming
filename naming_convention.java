class A
{
    public void show()
    {
        System.out.println("hh");
    }
}

public class naming_convention 
{
    public static void main(String args[])
    {
        A obj = new A();        // reference object

        new A().show();  // anonymous object
        new A().show();



        // camel casting

        // class and interface ----> Calc, Runnable
        // variables and methods -----> marks, show()
        // constants ----> PIE, DATA

        // showMyData()
        // MyData

    }
}
