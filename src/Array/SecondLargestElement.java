package Array;

public class SecondLargestElement {
    static void main() {
       int arr[]={4,5,3,7,8,18,99};
       int max= Integer.MIN_VALUE;
       int secondMax= Integer.MIN_VALUE;
       for(int i=0;i<arr.length;i++){
           if(arr[i]>max)
               max=arr[i];
       }
       for(int i=0;i<arr.length;i++){
           if(arr[i]>secondMax && arr[i] !=max)
               secondMax=arr[i];
       }
        System.out.println(max);
        System.out.println(secondMax);
    }
}
