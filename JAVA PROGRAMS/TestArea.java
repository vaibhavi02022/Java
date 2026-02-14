class TestArea{
	private int l;
	private int b;
	private int h;
    private double a;

	public void area(int r){
	    a =3.14*r*r;
		System.out.println("Area of circle: "+a);
	}

	public void area(int l,int b){
		a=l*b;
		System.out.println("Area of rectangle: "+a);

	}
	public void area(int l,int b,int h){
		a=l*b*h;
		System.out.println("Area of Box: "+a);

	}
}//end of class


class Main{
	 public static void main(String[] args) {
		TestArea t1 =new TestArea();
		t1.area(7);
		t1.area(7,8);
		t1.area(5,6,7);
	}
}
