class Box{
	private int len,bre,het;
	public Box(int l,int b,int h ){
		len=l;
		bre=b;
		het=h;
	}


public void volume(){
	int v=len*bre*het;
	System.out.println("Volume of box" +v);
}
}//end of main

class Main{
	public static void main(String[]args){
		Box b1=new Box(2,3,4);
		b1.volume();
	}
}