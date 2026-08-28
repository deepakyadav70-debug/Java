import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        System.out.print("Enter radius: ");
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        System.out.print("Area is: ");
        double area = 3.141592 * r * r;
        System.out.println(area);
    }
}
