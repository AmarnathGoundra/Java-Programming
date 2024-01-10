class Human
{
    private int age;
    private String name;

    public Human()  // default constructor
    {
        age = 12;
        name = "Rama";
    }

    public Human(int age, String name)   // parameterized constructor
    {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}

public class constructor_method
{
    public static void main(String args[])    
    {
        Human obj = new Human();
        Human obj1 = new Human(20, "Raju");

        // obj.setAge(20, obj);
        // obj.setName("Amar");

        System.out.println(obj.getName() + " : " + obj.getAge());
        System.out.println(obj1.getName() + " : " + obj1.getAge());
    }
}
