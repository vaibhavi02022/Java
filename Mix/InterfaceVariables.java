interface std1{
	int a=200;
	public void test_sum();
}

class Demo implements std1{
	public void test_sum(){
		int b=300;
		int res=a+b;
		System.out.println("Result is: "+res);
	}
}
class Test{
	public static void main(String[]args){
		Demo d=new Demo();
		d.test_sum();
	}
}