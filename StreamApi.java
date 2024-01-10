import java.util.Arrays;
import java.util.List;

public class StreamApi 
{
    public static void main(String argss[])    
    {
        List<Integer> nums = Arrays.asList(3,5,9,5,2,2,6,4);

        System.out.println(nums);


        // for(int i = 0; i<nums.size(); i++)
        // {
        //     System.out.println(nums.get(i));
        // }


        // for(int n : nums)
        // {
        //     System.out.println(n);
        // }


        nums.forEach(n -> System.out.println(n));

        System.out.println("------------------------------------");

        int sum = 0;
        for(int n : nums)
        {
            if(n%2 == 0)
            {
                n *= 2;
                sum += n;
            }
        }
        System.out.println(sum);
        
    }
}
