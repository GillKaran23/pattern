/*

              1
             1   1
           1   2   1
         1   3   3   1
       1   4   6   4   1
     1   5  10  10   5   1

 */
import java.util.*;
public class pattern16 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Type the number: ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            int no=1;
            System.out.printf("%"+(n-i)*2+"s","");
            for(int j=0; j<=i; j++){
                System.out.printf("%4d", no);
                no=no*(i-j)/(j+1);
            }
            System.out.println();
        }
    }
}
