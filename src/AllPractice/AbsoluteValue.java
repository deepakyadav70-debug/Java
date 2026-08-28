import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int a = sc.nextInt();
        if (a < 0) {
            a = -a;
        }
        System.out.print(a);
        // if (a % 5 == 0)
        // System.out.print(a);
        // else
        // System.out.print(-a);
    }
}
