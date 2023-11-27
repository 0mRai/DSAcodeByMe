import java.util.HashSet;
import java.util.Scanner;

class Zero_sum{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the values");
       int[] a=new int[5];
       for(int i=0; i<5; i++)
       {
         a[i]=sc.nextInt();
       }
       System.out.println(ZeroSum(a,5));
    }
    public static int ZeroSum(int[] arr, int n)
    {
         HashSet<Integer> us=new HashSet<Integer>();
         us.add(0);
         int pre_sum=0;
         for(int i=0; i<n; i++)
         {
            pre_sum+=arr[i];
            if(us.contains(pre_sum))
            {
               return 1;
            }
            us.add(pre_sum);
         }
         return 0;
    }
    
}