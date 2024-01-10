enum Status
{
    Running, Failed, Pending, Success;
}

public class Enumss 
{
    public static void main(String args[])    
    {
        Status s =  Status.Pending;
        System.out.println(s);

        switch(s)
        {
            case Running:
                System.out.println("All good!!");
                break;
            case Failed:
                System.out.println("Something wrong, try again");
                break;
            case Pending:
                System.out.println("Please wait");
                break;
            default:
                System.out.println("Success!!!");
                break;
        }

        System.out.println("____________________________________");

        if(s == Status.Running)
            System.out.println("All good!!");
        else if(s == Status.Failed)
            System.out.println("Something wrong, try again");
        else if(s == Status.Pending)
            System.out.println("Please wait");
        else
            System.out.println("Success!!!");

        System.out.println("____________________________________");

        System.out.println(s.ordinal());

        System.out.println("____________________________________");

        Status[] ss = Status.values();

        for(Status s1 : ss)
        {
            System.out.println(s1 + " : " + s1.ordinal());
        }

        System.out.println("____________________________________");
    }
}
