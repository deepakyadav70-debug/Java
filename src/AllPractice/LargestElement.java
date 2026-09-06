package AllPractice;

public class LargestElement {
    static void main() {
        int[] numbers = {45, 12, 85, 32, 7, 64};

        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Largest element: " + max);
    }
}
