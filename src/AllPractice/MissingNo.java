package AllPractice;

public class MissingNo {
    static void main() {
        int[] arr = {1, 2, 4, 5, 6};
        int n = arr.length + 1;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        System.out.println("Missing number: " + (expectedSum - actualSum));
    }
}
