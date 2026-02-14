class Test{
	public int sum(int a ,int b){
		int s= a+b;
		return s;
	}
	public double mean(int a ,int b,int c){
		double me =(a+b+c)/3;
		return me;
	}

}//end of class

class Testing{
	public static void main(String[]args){
		Test obj =new Test();
		int res =obj.sum(100,400);
		System.out.println("Sum is"+res);

		double m=obj.mean(3,4,5);
		System.out.println("Mean is"+m);
	}
}