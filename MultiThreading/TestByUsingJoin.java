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

			

			//start first thread immediatly
			th1.start();

			try {
				th1.join();
			}
			catch(Exception msg) {
				System.out.println(msg);
			}

			//start 2nd thread once first thread is dead
			th2.start();

			try{
				th2.join();
			}
			catch(Exception msg) {
				System.out.println(msg);
			}

			//start 3rd thread once second is dead
			th3.start();

			try{
				th3.join();
			}
			catch(Exception msg) {
				System.out.println(msg);
			}


		}
	}
