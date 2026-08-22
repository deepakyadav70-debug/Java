package PatternPrinting;

import java.util.Scanner;

public class StarPlus {
    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter m: ");
        int n = sc.nextInt();
        for(int i =1 ; i<=n ; i++){
            for(int j=1 ; j<=n ; j++){
                if (i==(n/2)+1 || j==(n/2)+1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
