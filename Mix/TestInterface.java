interface MyInterface{
	public void method1();
	public void method2();
	public void method3();
}

class Demo implements MyInterface{
	public void method1(){
		System.out.println("M1");
	}
	public void method2(){
		System.out.println("M2");
	}
	public void method3(){

	}

	public void method_xyz(){
		System.out.println("XYZ message");//this method not from interface
	}
}

class TestDemo{
	public static void main(String[]args){
		Demo m=new Demo();
		m.method1();
		m.method2();
		m.method3();
		m.method_xyz();
	}
}