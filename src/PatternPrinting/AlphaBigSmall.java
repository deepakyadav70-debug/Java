package PatternPrinting;

import java.util.Scanner;

public class AlphaBigSmall {
    static void main() {
        System.out.print("Enter value of n : ");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0 ; i<n ; i++){
            for (int j= 0 ; j<n ; j++){
//                System.out.print((char)(j+65)+" ");
               System.out.print((char)(j+97)+" ");
            }
            System.out.println();
        }
    }
}
