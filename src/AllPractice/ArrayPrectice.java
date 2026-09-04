package AllPractice;

public class ArrayPrectice {
    static void main() {
        int[] arr={10,20,30,40,50,60};
        for(int i=0;i<arr.length;i++){
            if(i%2==1)
                arr[i]*=2;
            else
                arr[i]+=10;
            System.out.print(arr[i]+" ");
        }
    }
}
