class ABC{
	//default constructor
	public ABC(){
		System.out.println("\n constructor gets called");
	}
}//end of class

class XYZ{
	public static void main(String[]args){
		ABC obj1=new ABC();
		ABC obj2=new ABC();
	}
}