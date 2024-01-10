import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TryFinally 
{
    public static void main(String args[]) throws IOException 
    {
        int num;

        BufferedReader br = null;
        Scanner scan = null;

        try
        {
            InputStreamReader in = new InputStreamReader(System.in);
            br = new BufferedReader(in);

            System.out.println("Enter a number");
            num = Integer.parseInt(br.readLine());

            System.out.println(num);


            scan = new Scanner(System.in);

            System.out.println("Enter a number");
            int num1 = scan.nextInt();

            System.out.println(num1);

        }
        finally
        {
            br.close();
            scan.close();
        }
    }
}
