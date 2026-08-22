// Print no. from 'n' to 1....
package Loops;

import java.util.Scanner;

public class DecreasingNo {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number n : ");
        int n= sc.nextInt();
        for (int i = n; i>=1 ; i--) {
            System.out.println(i+". ");
        }
    }
}
