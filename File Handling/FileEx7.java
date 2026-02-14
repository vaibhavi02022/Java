import java.io.*;

class Test{
	public static void main(String[]args) throws IOException{
		FileWriter fr =new FileWriter("D:\\college.txt");
		FileWriter fr1 =new FileWriter("D:\\company.txt");
		FileWriter fr2 =new FileWriter("D:\\home.txt");
		String data ="Sinhgad College Of Engineering";
		String data1 ="pune";
		String data2="katraj,pune";

		fr.write(data);
		fr1.write(data1);
		fr2.write(data2);

		fr.close();
		fr1.close();
		fr2.close();

		System.out.println("File created Successfully");

	}
}