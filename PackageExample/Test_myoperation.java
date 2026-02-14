import myoperation.*;

class Test {
    public static void main(String[] args) {
        TestSum sum = new TestSum(10, 7);
        TestSub sub = new TestSub(10, 7);
        TestDiv div = new TestDiv(10, 7);
        MaxNumber max = new MaxNumber(10, 7);

        System.out.println("Sum: " + sum.sum());    // Call sum() method
        System.out.println("Sub: " + sub.sub());    // Call sub() method
        System.out.println("Div: " + div.div());    // Call div() method
        System.out.println("Max: " + max.max());    // Call max() method
    }
}
