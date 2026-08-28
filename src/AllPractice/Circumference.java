import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        System.out.print("Enter radius of circle: ");
        Scanner cir = new Scanner(System.in);
        double r = cir.nextDouble();
        double Circumference = 2 * 3.141582 * r;
        System.out.print("Circumference of circle is: ");
        System.out.print(Circumference);
    }

}
