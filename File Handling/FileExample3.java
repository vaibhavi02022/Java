import java.io.*;

class Ex3{
	public static void main( String[]args)throws IOException{
		File f=new File("Student.txt");
		f.createNewFile();
		System.out.println("File created successfully");
	}
}