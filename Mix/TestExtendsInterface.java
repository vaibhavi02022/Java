interface std1{
	int a=100;
}

class ABC{
	protected int b=200;
}
// class Demo  implements std1 extends ABC {

class Demo extends ABC implements std1 {
	private int c=0;
	public void test_sum(){
		int res=a+b;
		System.out.println("Result is:  "+res);

	}

}

class Test{
	public static void main(String []args){
		Demo obj=new Demo();
		obj.test_sum();
	}
}