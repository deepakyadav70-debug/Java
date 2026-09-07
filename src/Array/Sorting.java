package Array;

import java.util.Arrays;

public class Sorting {
    static void main() {
        System.out.print("Unsorted array : ");
        int[] arr = {1, -4, -99, 83, 78, -22, 11, 24};
        print(arr);
        Arrays.sort(arr);
        System.out.print("Sorted array : ");
        print(arr);
    }

    public static void print(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
