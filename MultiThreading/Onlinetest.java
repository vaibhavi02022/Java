class Student extends Thread {
	private String studentName ;

	Student(String studentName) {
		this.studentName =studentName;
	}

	public void run() {
		System.out.println(studentName +"is taking the test");
	}
}

class TestStudent {
	public static void main(String []args) {
		new Student("Sourabh ").start();
		new Student("Akansha ").start();
		new Student("Sharvari ").start();

	}
}