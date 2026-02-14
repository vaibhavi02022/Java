class Multi implements Runnable {
	public void run() {
		System.out.println("Now thread is running by using Runnable Interface");
	}
} //end of class

class TestMulti{
	public static void main (String[] args){
		Multi obj =new Multi();
		Thread t =new Thread(obj);
		t.start();
	}
}