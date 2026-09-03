package AllPractice;

import java.util.Scanner;

public class StarPlus2 {
    static void main() {
        int n,m;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        n = sc.nextInt();
        System.out.print("Enter the value of m: ");
        m = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if(i==(n/2)+1 || j==(m/2)+1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
// Always take input as odd number...
