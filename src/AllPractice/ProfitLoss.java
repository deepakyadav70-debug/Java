import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cost price: ");
        int cp = sc.nextInt();
        System.out.print("Enter selling price: ");
        int sp = sc.nextInt();
        if (sp > cp)
            System.out.print("Profit is " + (sp - cp));
        else if (sp == cp)
            System.out.print("No profit no loss ");
        else
            System.out.print("Loss is " + (cp - sp));
    }
}
