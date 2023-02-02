/*

        *
      * *
    * * *
  * * * *
* * * * *

 */
import java.util.*;
public class pattern13 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type the number: ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++)
        {
            for(int sp=2*(n-i); sp>=1;sp--)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
