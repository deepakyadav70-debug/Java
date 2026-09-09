package Array;

public class RotateArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int d = 2;
        rotate(arr, d);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    public static void reverse(int arr[], int i, int j){
        while(i<j){
            int temp= arr[i];
            arr[i]=arr[j];
            arr[j]= temp;
            i++;
            j--;
        }
    }
    public static void rotate(int arr[],int d){
        int n= arr.length;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }
}
