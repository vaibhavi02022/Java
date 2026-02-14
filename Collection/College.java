import java.util.*;
class Testclg{
	public static void main(String[]args){
		ArrayList <String>mca=new ArrayList<String>();
		ArrayList <String>bca=new ArrayList<String>();
		ArrayList <String>mtech=new ArrayList<String>();

		mca.add("Amar");
		mca.add("Ram");
		mca.add("Ramesh");
		mca.add("Ashok");

		bca.add("Alex");
		bca.add("John");
		bca.add("Martin");
		bca.add("Adams");

		mtech.add("Anisha");
		mtech.add("Avantika");
		mtech.add("Vidhya");

		System.out.println("MCA students: "+mca);
		System.out.println("BCA students: "+bca);
		System.out.println("MTECH students: "+mtech);

		ArrayList<String>college =new ArrayList<String>();
		college.addAll(mca);
		college.addAll(bca);
		college.addAll(mtech);

		System.out.println("Total count"+college.size());
		System.out.println("Students" +college);

		college.removeAll(bca);
		System.out.println("Total count"+college.size());
		System.out.println("Students" +college);





	}
}