import java.util.*;
class TestArrayList{
	public static void main(String[]args){
		ArrayList<String>emplist=new ArrayList<String>();

		emplist.add("Sneha");
		emplist.add("Puja");
		emplist.add("Aniket");

		System.out.println("Array list: "+emplist);

		emplist.add("Yogita");
		emplist.add("Anjali");
		emplist.add("Yashu");
		emplist.add("Anand");
		emplist.add("Sagar");

		System.out.println("\n\n Updated array list"+emplist);

		int no_of_emp=emplist.size();
		System.out.println("\n\nList Size: "+no_of_emp);

	}
}