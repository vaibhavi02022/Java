import java.io.*;
class TestReadFile{   
	public static void main (String[]args)throws IOException{

		char data[]=new char[500];
		FileReader fr =new FileReader("D:\\JAVA(PLACEMENT)\\File Handling\\Student.txt");
		fr.read(data);
		System.out.println(data);
		fr.close();

	}
}