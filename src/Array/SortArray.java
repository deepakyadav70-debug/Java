package Array;

import java.util.Arrays;

public class SortArray {
    static void main() {
        // Sorting is a process in which we set the elements of an array in ascending or descending order
        int[] arr={2,-4,-1,0,12,11,24,99,-99};
         print(arr);
        Arrays.sort(arr);
        System.out.print("Sorted array: ");
        print(arr);
    }
    public static void print(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
