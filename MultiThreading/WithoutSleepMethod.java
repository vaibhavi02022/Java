class TestWithoutSleep extends Thread {
	public void run() {
		for (int i=1 ;i<=5 ;i++){
			System.out.println(i);
		}
	}  //end of run

} //end of class

class Testing{
	public static void main(String[] args) {
		TestWithoutSleep t1 =new TestWithoutSleep();
		TestWithoutSleep t2 =new TestWithoutSleep();

		t1.start();
		t2.start();

	}
}