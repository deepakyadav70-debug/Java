package Array;

import java.util.Scanner;

public class ArraySum {
    static void main() {
//        int [] arr={-2, 3, 4, 12,-9};
//        int sum=0;
//        for(int i=0; i<arr.length; i++){
//            sum += arr[i];
//        }
//        System.out.print(sum);

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number of element in array: ");
        int n=sc.nextInt();
        int[] arr= new int[n];
        System.out.print("Enter "+n+" integers");
        for (int i=0 ;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.print("Sum= "+ sum);
    }
}
