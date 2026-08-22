package PatternPrinting;

import java.util.Scanner;

public class StarTriangle2 {
    static void main() {
        System.out.print("Enter value of n : ");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for (int i = 0 ; i<= n ;i++)
        {
            for(int j= 0; j<i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
