package Array;

import java.util.Scanner;

public class InputOutput {
    static void main() {
     //input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element of array:");
        int[] arr = new int[5];
        for(int i=0; i<5; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<5;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
