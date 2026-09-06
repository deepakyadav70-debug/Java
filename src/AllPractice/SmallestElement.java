package AllPractice;

public class SmallestElement {
    static void main() {
        int[] numbers = {45, 12, 85, 32, 7, 64};

        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("Smallest element: " + min);
    }
}
