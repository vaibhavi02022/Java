interface Inf1{
	public void method1();
}

interface Inf2{
	public void method2();
}

interface Inf3{
	public void method3();
}

class Demo implements Inf1,Inf2,Inf3{
	public void method1(){
		System.out.println("method1");
	}

	public void method2(){
		System.out.println("method2");
	}

	public void method3(){
		System.out.println("method3");
	}
}

class TestDemo{
	public static void main(String[]args){
		Demo obj=new Demo();
		obj.method1();
		obj.method2();
		obj.method3();
	}
}