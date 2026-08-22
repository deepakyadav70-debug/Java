package PatternPrinting;

import java.util.Scanner;

public class StarRectangle {
    static void main() {
        Scanner sc= new Scanner(System.in);
        int rows = sc.nextInt();
        int col = sc.nextInt();
        for(int i =1; i<=rows; i++) {
            for(int j = 1 ; j<= col ; j++){
                    System.out.print("* ");
            }
            System.out.println();
        }
    }
}
