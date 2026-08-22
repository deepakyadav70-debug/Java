package AllPractice;

import java.util.Scanner;

public class UPtriangle {
    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int a =n;
        for(int i = 0 ; i<n; i++){
            for(int j=0; j<a; j++){
                System.out.print(i+" ");
            }
            a--;
            System.out.println();
        }
    }
}
