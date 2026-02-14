import java.io.*;
class Test{
	public static void main(String[]args) throws IOException{
		char data[]=new char[500];
		char data1[]=new char[500]; //by creating only one array this program will run

		FileReader fr=new FileReader("D:\\java.txt");
		FileReader fr1 =new FileReader("D:\\php.txt");

		fr.read(data);
		fr1.read(data1);
		System.out.println(data);
		System.out.println(data1);

		fr.close();
		fr1.close();

	}
}