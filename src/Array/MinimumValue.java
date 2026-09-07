package Array;

public class MinimumValue {
    static void main() {
        int[] arr= {2,4,5,9,1,-1};
        int min=Integer.MAX_VALUE;
        for (int i=0;i<arr.length;i++){
            if(arr[i]<min)
                min=arr[i];
        }
        System.out.println(min);
    }
}
