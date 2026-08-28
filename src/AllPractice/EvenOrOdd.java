import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check: ");
        int a = sc.nextInt();
        if (a % 2 == 0)
            System.out.print("Number is Even");
        else {
            System.out.print("Number is Odd");
        }
    }
}
