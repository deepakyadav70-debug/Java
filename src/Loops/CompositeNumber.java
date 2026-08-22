// More than 2 factor known as composite number
package Loops;

import java.util.Scanner;

public class CompositeNumber {
    static void main() {
        Scanner sc= new Scanner(System.in) ;
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        for(int i = 2; i<= n-1 ; i++) {
            if (n % i == 0)
                System.out.println("Composite no. ");
            break;
        }
    }
}
