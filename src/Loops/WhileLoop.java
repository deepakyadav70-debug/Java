package Loops;


public class WhileLoop {
    static void reccur(int a, int idx) {
        if (a*idx > 20) return;
        System.out.print(a * idx + " ");
        idx++;
        reccur(a, idx);
    }
    static void main() {
        reccur(2, 1);
    }
}
