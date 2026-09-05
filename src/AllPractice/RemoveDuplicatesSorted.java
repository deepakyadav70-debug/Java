package AllPractice;

public class RemoveDuplicatesSorted {
    static void main() {
        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};

        if (arr.length == 0) return;

        int uniqueIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[uniqueIndex]) {
                uniqueIndex++;
                arr[uniqueIndex] = arr[i];
            }
        }

        for (int i = 0; i <= uniqueIndex; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
