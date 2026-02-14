package myoperation;

public class TestDiv {
    private int a;
    private int b;

    
    public TestDiv(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int div() {
        if (a>b) {
            return a / b;
        } else {
            System.out.println("Cannot divide by zero!");
            return -1;
        }
    }
}
