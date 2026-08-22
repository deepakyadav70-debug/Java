package AllPractice;

import java.util.Scanner;

public class CountOfDigits {
    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no : ");
        int n= sc.nextInt();
        int count = 0;
        while(n != 0) {
            n /= 10;
            count++;
        }
                System.out.println(count);

    }
}
