package Array;

public class ShallowANDDeepCopy {
    static void main() {
        int[] arr={10,20,30,40};
        int[] x= arr;     // Here x is a Shallow copy of arr.
        x[0]=100;
        System.out.println(arr[0]);
    }
}
