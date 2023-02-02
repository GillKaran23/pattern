/*

    *
   * *
  * * *
 * * * *
* * * * *
 * * * *
  * * *
   * *
    *

 */
import java.util.*;
public class pattern6 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Type the number: ");
        int n = sc.nextInt();
        for(int i=1; i<=2*n; i++)
        {
            int a = i>n ? 2*n-i:i;
            int sp = n-a;
            for(int s=1;s<=sp;s++)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=a; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
