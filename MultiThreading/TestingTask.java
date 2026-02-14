class DownloadTask extends Thread {
	String fileName ;

	public DownloadTask(String fileName) {
		this.fileName =fileName ;

	}

	public void run() {
		System.out.println("Downloading "+fileName);
	}
} 

class TestDing {
	public static void main(String[]args) {
		DownloadTask obj =new DownloadTask("file1.pdf");
		obj.start();

		                  new DownloadTask("file2.docx").start();
		                  new DownloadTask("file3.jpg").start();

	}
}