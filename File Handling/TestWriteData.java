import java.io.*;
class Test{
	public static void main(String[]args)throws IOException{

		FileWriter fw=new FileWriter("D:\\Myfile.txt");
		String data="We are learning java file handling";
		fw.write(data);
		fw.close();
		System.out.println("File created successfully");
		System.out.println("Data write inside file successfully");

	}
}