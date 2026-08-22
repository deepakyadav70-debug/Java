package AllPractice;

import java.util.Scanner;

public class SumOfDigit
{
    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no : ");
        int n= sc.nextInt();
        int sum = 0;
        while(n!=0) {
            sum += (n % 10);
            n /= 10;
        }
        System.out.println(sum);
    }
}
