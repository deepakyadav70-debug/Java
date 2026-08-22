package PatternPrinting;

import java.util.Scanner;

public class LowerTriangle {
    static void main() {
        System.out.println("Enter the value of n  ");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int a = n;
        for (int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j<=a ; j++) {
                System.out.print("* ");
            }
            a--;
            System.out.println();
        }
    }
}

//        int n = sc.nextInt();
//        for (int i = 1 ; i <= n ; i++){
//            for(int j = 1 ; j<=n+1-i ; j++) {
//                System.out.print((char)(96+j)+ " ");
//            }
//            System.out.println();
//        }