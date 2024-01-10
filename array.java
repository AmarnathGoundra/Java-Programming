public class array 
{
    public static void main(String args[])    
    {
        int num[] = {5,6,7,9};
        num[2] = 54;

        System.out.println(num[2]);

        int nums[] = new int[5];
        nums[4] = 3;
        nums[2] = 9;

        for(int i=0; i<5; i++)
        {
            System.out.println(nums[i]);
        }
    }
}
