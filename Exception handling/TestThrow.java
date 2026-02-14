import java.util.*;

class Circle{
	public static void main(String[]args){

		Scanner sc =new Scanner(System.in);
		System.out.println("\n Enter the radius");
		int r =sc.nextInt();

		if(r<0){
			throw new ArithmeticException("Radius can not be negative");
		}
		if(r>100){
			throw new ArithmeticException("radius must be in range 1 to 100");
		}

		double a=3.14*r*r;
		double c=2*3.14*r;
		System.out.println("Area od circle "+a);
		System.out.println("Circumferance of circle"+c);
	}
}