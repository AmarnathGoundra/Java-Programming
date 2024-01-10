abstract class Car
{
    public abstract void drive();
    // public abstract void fly();

    public void playMusic()
    {
        System.out.println("PlayMusic");
    }
}

abstract class Wagonar extends Car
{
    public abstract void fly();

    public void drive()
    {
        System.out.println("Driving");
    }
}

class UpdateWagonar extends Wagonar
{
    public void fly()
    {
        System.out.println("Flying...");
    }
}

public class abstract_class 
{
    public static void main(String args[])    
    {
        Car obj = new UpdateWagonar();
        obj.drive();
        obj.playMusic();
//        obj.fly(); //error

        Wagonar obj1 = new UpdateWagonar();
        obj1.fly();
    }
}
