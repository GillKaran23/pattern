/*

* * * * * 
 * * * *
  * * *
   * *
    *
    *
   * *
  * * *
 * * * *
* * * * *

 */
import java.util.*;
public class pattern14 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Type the number: ");
        int n = sc.nextInt();
        for(int i=0; i<=n-1; i++){
            for(int sp=1; sp<=i; sp++){
                System.out.print(" ");
            }
            for(int j=i; j<=n-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n-1; i>=0; i--){
            for(int sp=1; sp<=i; sp++){
                System.out.print(" ");
            }
            for(int j=i; j<=n-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }   
}
