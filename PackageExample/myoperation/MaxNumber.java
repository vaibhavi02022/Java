package myoperation;

public class MaxNumber {
    private int a;
    private int b;

    public MaxNumber(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int max() {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
