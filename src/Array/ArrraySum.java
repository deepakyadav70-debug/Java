package Array;

public class ArrraySum {
    static void main() {
        int [] arr={-2, 3, 4, 12,-9};
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        System.out.print(sum);
    }
}
