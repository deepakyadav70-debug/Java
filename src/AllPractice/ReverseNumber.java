package AllPractice;

import java.util.Scanner;

public class ReverseNumber {
    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no : ");
        int n= sc.nextInt();
        int r = 0;
        while(n!=0) {
            r*=10;
            r+=(n%10);
            n/=10;
          }
        System.out.println(r);
      }
    }
