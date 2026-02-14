class Abc extends Thread {
	String name ;
	public  Abc(String name) {
		this.name =name ;
	}

	public void run() {
		System.out.println("Thread started :" +name);
	}
}

class ThreeObject {
		public static void main(String[]args) {
			Abc th1 =new Abc("Thread1");
			Abc th2 =new Abc("Thread2");
			Abc th3 =new Abc("Thread3");



			th1.start();
			th2.start();
			th3.start();


		}
	}
