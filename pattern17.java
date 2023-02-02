/*

1 0 1 0 1 
0 1 0 1 0
1 0 1 0 1
0 1 0 1 0
1 0 1 0 1

 */
import java.util.*;
public class pattern17 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type the number: ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++)
        {
            int no;
            if(i%2 == 0){
                no=0;
                for(int j=1; j<=n; j++){
                    System.out.print(no+" ");
                    no = (no == 0) ? 1:0;
                }
            }
            else{
                no =1;
                for(int j=1; j<=n; j++){
                    System.out.print(no+" ");
                    no=(no ==0)?1:0;
                }
            }
            System.out.println();
        }
    }
}
