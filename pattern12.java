/*

    1
   212
  32123
 4321234
543212345
 4321234
  32123
   212
    1

 */
import java.util.*;
public class pattern12 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type the number: ");
        int n = sc.nextInt();
        for(int i=1; i<=2*n; i++)
        {
            int a = i>n ? 2*n-i:i;
            for(int sp = 0; sp<n-a; sp++)
            {
                System.out.print(" ");
            }
            for(int j=a; j>=1; j--)
            {
                System.out.print(j);
            }
            for(int j=2; j<=a; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}
