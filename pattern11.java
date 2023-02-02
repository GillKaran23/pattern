/*

    1
   212
  32123
 4321234
543212345

 */
import java.util.*;
public class pattern11 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type the number: ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++)
        {
            for(int sp = 0; sp<n-i; sp++)
            {
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--)
            {
                System.out.print(j);
            }
            for(int j=2; j<=i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
