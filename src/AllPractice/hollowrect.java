package AllPractice;

import java.util.Scanner;

public class hollowrect {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n as length : ");
        int n=sc.nextInt();
        System.out.print("Enter value of m as breadth : ");
        int m=sc.nextInt();
        for(int i=1 ; i<=n; i++){
            for(int j=1 ; j<=m; j++){
                if(i==1||i==n|| j==1 ||j==m)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
