package Array;

public class MinimumElement {
    static void main() {
        int[] arr= {2,4,5,9,1,-1};
        int min=arr[0];
        for (int i=0;i<arr.length;i++){
            if(arr[i]<min)
                arr[i]=min;
        }
        System.out.println(min);
    }
}
