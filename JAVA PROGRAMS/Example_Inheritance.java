class AAA{
	protected int a=100;
}

class BBB extends AAA{
	protected int b=200;
}

class CCC extends BBB{
	private int c=300;

	public void sum(){
		int s=a+b+c;
		System.out.println("SUM: "+s);
	}
}

class TestCCC{
	public static void main(String[]args){
		CCC c =new CCC();
		c.sum();
	}
}