class test{
	public static void main(String []args){
		int n=50;
		try{
			int res =n/0;
			System.out.println("The result is"+res);
		}
		System.out.println("Japan");
		catch(ArithmeticException msg){
			System.out.println(msg);
		}
	}
}