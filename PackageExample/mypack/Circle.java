package mypack;

public class Circle{
	private int r;
	public void setData(int r){
		this.r=r;
	}

	public void area(){
		double a=3.14*r*r;
		System.out.println("Area od Circle "+a);
	}
}