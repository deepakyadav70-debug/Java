import java.util.Scanner;

public class FourDigitNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
         if (n > 999 && n < 10000)
            System.out.print("4 digit number ");
        else
            System.out.print("Not 4 digit number ");

    }
}