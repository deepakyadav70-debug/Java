package Array;

public class TwoSum {
    static void main() {
        System.out.println("Two Sum: " + TwoSum());
    }
    public static boolean TwoSum(){
        int arr[]={1,2,5,7,9};
        int target=11;
        int n=arr.length;
        for(int i=0 ; i<n; i++){
            for(int j=i+1 ; j<n; j++){
                if(arr[i]+arr[j]== target)
                    return true;
            }
        }
        return false;
    }
}
