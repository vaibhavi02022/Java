interface Inf1{
	public void m1();
}

interface Inf2 extends Inf1{
	public void m2();

}
class Demo implements Inf2{
	public  void m1(){
		System.out.println("method1");

	}
	public  void m2(){
		System.out.println("method2");
		
	}
}

class Test{
	public  static void main(String[]args){
		Demo d1=new Demo();
		d1.m1();
		d1.m2();
	}
}