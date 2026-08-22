//Display this GP- 1,2,4,8,... upto 'n' terms.

package Loops;

import java.util.Scanner;

public class GP {
   public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       System.out.print("Enter no. of terms n : ");
       int n= sc.nextInt();
        int a=1 , r=2 ;
        for(int i = 1 ; i<=n ; i++){
            System.out.print(a +" ");
        a *= r;
        }
    }
}
