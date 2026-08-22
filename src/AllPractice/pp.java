package AllPractice;

import java.util.Scanner;

public class pp {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int a =n;
        for (int i = 1; i<=n ;i++){
            for (int j = 1 ; j<=a ;j++){
                System.out.print((char)(j+64)+ " ");
            }
            a--;
            System.out.println();
        }
    }
}
