package Array;

public class ProductOfArray {
    static void main() {
        int [] arr= {2,3,2,5};
        int product= 1;
        for (int i=0 ;i< arr.length; i++){
            product *= arr[i];
        }
        System.out.print(product);
    }
}
