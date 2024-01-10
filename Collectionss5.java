import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>
{
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    @Override
    public int compareTo(Student that) {
        if(this.age > that.age)
            return 1;
        else
            return -1;
    }

    
}

public class Collectionss5 
{
    public static void main(String args[])    
    {
        List<Student> studs = new ArrayList<>();

        studs.add(new Student(21, "Vinay"));
        studs.add(new Student(25, "Ravi"));
        studs.add(new Student(23, "Suri"));
        studs.add(new Student(27, "Ram"));
        studs.add(new Student(22, "Amar"));

        Collections.sort(studs);

        for(Student s : studs)
            System.out.println(s);

        
    }
}
