class Abc implements Runnable {
	public void run(){
		Thread t= Thread.currentThread();
		System.out.println("Thread started :"+t.getName());
	}
}

	class ThreeObject {
		public static void main(String[]args) {
			Thread th1 =new Thread(new Abc(), "Thread-1");
			Thread th2 =new Thread(new Abc(), "Thread-2");

			Abc obj =new Abc();
			Thread th3 =new Thread(obj, "Thread-3");

			th1.start();
			th2.start();
			th3.start();


		}
	}
