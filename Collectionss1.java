import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Collectionss1 
{
    public static void main(String args[])    
    {
        Collection<Integer> nums = new ArrayList<Integer>();

        nums.add(5);
        nums.add(3);
        nums.add(9);
        nums.add(6);
        nums.add(4);

        System.out.println(nums);
        System.out.println("----------------------------");
        for(int n:nums)
        {
            System.out.println(n*10);
        }

        System.out.println("----------------------------");

        List<Integer> nums1 = new ArrayList<Integer>();

        nums1.add(5);
        nums1.add(3);
        nums1.add(9);
        nums1.add(6);
        nums1.add(4);

        System.out.println(nums1.get(3));
    }
}
