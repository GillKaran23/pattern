/*

    1
   1 2
  1 2 3 
 1 2 3 4 
1 2 3 4 5

*/
import java.util.*;
public class pattern10 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type the number: ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++)
        {
            int a = i>n ? n-i:i;
            int sp = n-a;
            for(int s=1;s<=sp;s++)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=a; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}