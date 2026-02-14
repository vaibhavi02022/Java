class TestWithSleep extends Thread {
	public void run() {
		for (int i=1 ;i<=5 ;i++){
			try{
				Thread.sleep(500);
			}
			catch(InterruptedException e){
				System.out.println(e);
			}
			System.out.println(i);
		}
	}  //end of run

} //end of class

class Testing{
	public static void main(String[] args) {
		TestWithSleep t1 =new TestWithSleep();
		TestWithSleep t2 =new TestWithSleep();

		t1.start();
		t2.start();

	}
}