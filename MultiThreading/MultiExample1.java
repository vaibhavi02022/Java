class Multi extends Thread {
	public void run() {
		System.out.println("Now Thread is running");

	}
} //end of class

class TestMulti{
	public static void main(String[]args){
		Multi t =new Multi();
		t.start();
	} 
}