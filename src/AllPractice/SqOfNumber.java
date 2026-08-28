import java.util.Scanner;

public class SqOfNumber {
    public static void main(String[] args) {
        System.out.print("Enter value: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = a * a;
        System.out.print("Sq of the value is: ");
        System.out.print(b);
    }
}
