import java.util.List;
import java.util.stream.Stream;
import java.util.Arrays;

public class StreamApi2 
{
    public static void main(String args[])    
    {
        List<Integer> nums = Arrays.asList(2,8,5,3,9,0,6);

        Stream<Integer> s1 = nums.stream();
        //s1.forEach(n -> System.out.println(n)); //automatically closes stream

        Stream<Integer> s2 = s1.filter(n -> n%2 == 0);
        //s2.forEach(n -> System.out.println(n));

        Stream<Integer> s3 = s2.map(n -> n*2);
        // s3.forEach(n -> System.out.println(n));

        int result = s3.reduce(0, (c,e) -> c+e);
        System.out.println(result);

        // we can de above operations in one line as below

        int results = nums.stream()
            .filter(n -> n%2 == 0)
            .map(n -> n*2)
            .reduce(0, (c,e) -> c+e);
        
        System.out.println(results);


        // sorted
        Stream<Integer> sortedValues = nums.stream()
            .filter(n -> n%2 != 0)
            .sorted();
        
        sortedValues.forEach(n -> System.out.println(n));

        //for doing with multiple threats
        Stream<Integer> sortedValuess = nums.parallelStream()
            .filter(n -> n%2 != 0)
            .sorted(); //sort doesnot work in parallel stream
        
        sortedValuess.forEach(n -> System.out.println(n));
    }
}