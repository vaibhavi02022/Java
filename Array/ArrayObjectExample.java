class Rectangle{
	private int len;
	private int bre;

	public Rectangle(int l,int b){
		len=l;
		bre=b;
	}

	public void area(){
		int a=len*bre;
		System.out.println("Area is"+a);
	}
}

class Test{
	public static void main(String[]args){
		Rectangle r1[]=new Rectangle[2];
		r1[0]=new Rectangle(2,4);
		r1[0].area();
		r1[1]=new Rectangle(3,4);
		r1[1].area();
		
	}
}