package Array;

import org.w3c.dom.ls.LSOutput;

public class MaxElement {
    static void main() {
        int[] arr={21, 33, 23, 47, 59, 64, -99};
        int max= arr[0];
        for(int i=0; i<arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.print(max);
    }
}
