/*

* * * * *
 * * * *
  * * *
   * *
    *

 */
import java.util.*;
public class pattern8 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Type the number: ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++)
        {
           for(int sp=0; sp<=i; sp++)
           {
            System.out.print(" ");
           }
           for(int j=i; j<=n; j++)
           {
            System.out.print("* ");
           }
           System.out.println();
        }
    }
}
