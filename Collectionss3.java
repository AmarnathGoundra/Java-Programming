import java.util.HashMap;
import java.util.Map;

public class Collectionss3 
{
    public static void main(String args[])    
    {
        Map<String, Integer> students = new HashMap<>();
        // Map<String, Integer> students = new Hashtable<>();  // for synchronised -> means while running multiple threads

        students.put("Amar", 99);
        students.put("Ravi", 68);
        students.put("Naven", 57);
        students.put("Vinay", 97);
        students.put("Amar", 100);

        System.out.println(students.get("Vinay"));
        System.out.println(students);
        System.out.println(students.keySet());

        for(String name : students.keySet())
        {
            System.out.println(name + " : " + students.get(name));
        }
    }
}
