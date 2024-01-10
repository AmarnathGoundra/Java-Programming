import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

class Student
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

}

public class Collectionss4 
{
    public static void main(String args[])    
    {
        List<Integer> nums1 = new ArrayList<>();

        nums1.add(57);
        nums1.add(33);
        nums1.add(90);
        nums1.add(62);
        nums1.add(41);


        System.out.println("------------------------------------------");

        Comparator<Integer> c = new Comparator<Integer>() 
        {
            public int compare(Integer i, Integer j)
            {
                if(i%10 > j%10)
                    return 1;
                else
                    return -1;
            }
        };

        Collections.sort(nums1, c);

        System.out.println(nums1);

        System.out.println("------------------------------------------------");

        Collections.sort(nums1);

        System.out.println(nums1);

        System.out.println("--------------------------------------------------");

        List<Student> studs = new ArrayList<>();

        studs.add(new Student(21, "Vinay"));
        studs.add(new Student(25, "Ravi"));
        studs.add(new Student(23, "Suri"));
        studs.add(new Student(27, "Ram"));
        studs.add(new Student(22, "Amar"));

        // Comparator<Student> com = new Comparator<Student>() 
        // {
        //     public int compare(Student i, Student j)
        //     {
        //         if(i.age > j.age)
        //             return 1;
        //         else
        //             return -1;
        //     }
        // };

        // upper one is simplified as below

        Comparator<Student> com = (i, j) -> (i.age > j.age) ? 1 : -1;

        Collections.sort(studs, com);
        
        for(Student s : studs)
            System.out.println(s);

    }
}
