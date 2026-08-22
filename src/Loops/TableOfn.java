package Loops;

import java.util.Scanner;

public class TableOfn {
    public static void main(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter n: ");
        int n= sc.nextInt();
        for (int i=1; i<=10 ; i++)
            System.out.print(i*n+" ");
    }
}
