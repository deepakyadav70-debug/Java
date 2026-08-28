import java.util.Scanner;

public class DivisibilityOf5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check: ");
        int a = sc.nextInt();
        if (a % 5 == 0)
            System.out.println("Yes no. is divisible by 5");
        else
            System.out.println("Not divisible by 5 ");
    }
}
