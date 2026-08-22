package PatternPrinting;

import java.util.Scanner;

public class UpperTriangle {
    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        for(int i=0 ; i<n; i++){
            for(int j=1; j<n+1-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
