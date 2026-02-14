import java.io.*;

class FileExample{
	public static void main (String[]args){
		File f=new File("D:\\Amazon");
		boolean x=f.mkdir();

		if(x==true){
			System.out.println("Folder is created successfully");
		}
		else{
			System.out.println("File already Exists...");
		}

	}
}