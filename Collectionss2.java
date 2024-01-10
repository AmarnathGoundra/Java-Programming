import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;

public class Collectionss2 
{
    public static void main(String args[])    
    {
        // Set<Integer> nums1 = new HashSet<Integer>();
        // Collections<Integer> nums1 = new HashSet<Integer>();
        Set<Integer> nums1 = new TreeSet<Integer>(); //for sorted

        nums1.add(5);
        nums1.add(3);
        nums1.add(9);
        nums1.add(6);
        nums1.add(5);

        for(int n: nums1)
        {
            System.out.println(n);    // not sorted and unique values 
        }

        System.out.println("-------------------------------");

        Iterator<Integer> values = nums1.iterator();

        while(values.hasNext())
            System.out.println(values.next());

    }
}
