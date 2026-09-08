package Array;

public class ReverseArray {
    static void main() {
        int arr[]={2,4,6,8,10,12,14};
        int n=arr.length;
        int i=0 ;
        int j=n-1;
        while(i<j){
            int temp=arr[i];
            arr[i]= arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int ele: arr)
            System.out.print(ele+" ");
    }
}
