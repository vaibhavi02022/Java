class Circle{
	private int r;

	public Circle(){
		r=4;
	}
	public void setData(int x){
		r=x;
	}
	public void area(){
		double a=3.14*r*r;
		System.out.println(a);
	}
} //end of class

class TestCircle{
	public static void main(String[]args){
		Circle c1=new Circle();
		c1.area();

		Circle c2=new Circle();
		c2.setData(6);
		c2.area();


	}
}