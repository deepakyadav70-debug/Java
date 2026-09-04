package Array;
import java.util.Arrays;
public class ShallowANDDeepCopy {
    static void main() {
        int[] arr={10,20,30,40};
//        int[] x= arr;     // Here x is a Shallow copy of arr.
//        x[0]=100;
//        System.out.println(arr[0]);
        int[]y = Arrays.copyOf(arr, arr.length); // deep copy
        y[0]= 20;
        System.out.print(arr[0]);
    }
}
