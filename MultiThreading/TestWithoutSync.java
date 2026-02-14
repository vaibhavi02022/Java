class Table {
	void printTable( int n){
		for(int i=1 ;i<=5 ;i++){
			System.out.println(i*n);

			try{
				Thread.sleep(400);
			}
			catch(Exception e){
				System.out.println(e);
			} //end of catch
		} //end of loop
	} //end of PrintTable
} //end of class

class MyThread1 extends Thread {
	Table t ;
	MyThread1(Table t) {
		this.t =t ;
	}

	public void run() {
		t.printTable(5);
	}
} //end of class

class MyThread2 extends Thread {
	Table t ;
	MyThread2(Table t) {
		this.t =t ;
	}

	public void run() {
		t.printTable(100);
	}
} //end of class

class TestSynchronization1 {
	public static void main(String[]args){
		Table obj =new Table();
		MyThread1 t1 =new MyThread1(obj);
		MyThread2 t2 =new MyThread2(obj);
		t1.start();
		t2.start();



	}
}

