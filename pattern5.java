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
public class pattern5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Type the number: ");
        int n = sc.nextInt();
        for(int i=1; i<=2*n; i++)
        {
            int a = i>n ? 2*n-i:i;
            for(int j=1; j<=a; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
