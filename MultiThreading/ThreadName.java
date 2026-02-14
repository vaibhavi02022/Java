class MyThread {
	public static void main(String []args) {
		Thread t1 =new Thread("First Thread"); //born state of thread
		Thread t2 =new Thread("Second Thread");

		String name1 =t1.getName();
		String name2 =t2.getName();

		System.out.println("Thread-1 name is running :"+name1);
		System.out.println("Thread-2 name is running :"+name2);

	}
}