// class - class ------> extends
// class - interface -----> implements
// interface - interface ------> extends



interface A
{   // by default all methods are public and abstract

    String area = "Mumbai";          //final and static

    void show();
    void config();
}

interface X
{
    void run();
}

interface Y extends X
{
    //inherits run() method
}

class B implements A,Y                        // A,X also correct
{
    public void config() {
        System.out.println("In config");
        
    }

    public void show() {
        System.out.println("In show");
        
    }

    public void run()
    {
        System.out.println("Running");
    }
    
}

public class interfaces 
{
    public static void main(String args[])    
    {
        A obj;
        obj = new B();
        obj.show();
        obj.config();

        System.out.println(A.area);

        X obj1 = new B();
        obj1.run();


    }
}
