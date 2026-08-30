//Write a program using class to reverse a number.
package AllPractice;

import java.util.Scanner;

public class ReverseOfNumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int reverse = 0;

        while (n != 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }

        System.out.println("Reverse = " + reverse);
    }
}

