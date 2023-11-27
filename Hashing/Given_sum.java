import java.util.HashSet;
import java.util.Scanner;

public class Given_sum {
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the values");
       int[] a=new int[5];
       for(int i=0; i<5; i++)
       {
         a[i]=sc.nextInt();
       }
       System.out.println(GivenSum(a, 5, 22));
    }
    public static int GivenSum(int[] a, int n, int sum)
    {
        HashSet<Integer> us=new HashSet<Integer>();
        int preSum=0;
        us.add(0);
        for(int i=0; i<n; i++)
        {
          preSum+=a[i];
          if(us.contains(preSum-sum))
          {
             return 1;
          }
          us.add(preSum);
        }
        return 0;
    }
}
