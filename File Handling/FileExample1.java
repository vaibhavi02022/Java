import java.io.*;

class FileExample{
	public static void main (String[]args){
		File f=new File("D:\\AITS");
		f.mkdir();

		System.out.println("Folder is created successfully");
	}
}