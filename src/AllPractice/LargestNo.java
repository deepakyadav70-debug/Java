//Write a class-based program to find largest of three numbers.
package AllPractice;

import java.util.Scanner;

public class LargestNo {
    static void main() {
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter first number: ");
                int a = sc.nextInt();

                System.out.print("Enter second number: ");
                int b = sc.nextInt();

                System.out.print("Enter third number: ");
                int c = sc.nextInt();

                int largest = a;

                if (b > largest) {
                    largest = b;
                }

                if (c > largest) {
                    largest = c;
                }

                System.out.println("Largest number = " + largest);
            }
        }