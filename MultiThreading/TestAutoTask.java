class Typing extends Thread {
	public void run (){
		System.out.println("Typing the document");
	}
}

class AutoSave extends Thread {
	public void run() {
		System.out.println("Auto-saving the document");
	}
}

class TestBothClass {
	public static void main(String[]args) {
		new Typing().start();
		new AutoSave().start();
	}
}