package Array;

public class ArrayMethod {
    public static void change(int [] x) {
        x[2]=99;
    }

    static void main() {
        int [] x={22,63,36,44,87};
        System.out.println(x[2]);
        change(x);
        System.out.println(x[2]);
    }
}
