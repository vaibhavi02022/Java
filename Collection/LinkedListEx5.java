import java.util.*;

class LinkedListExample{
	public static void main(String[]args){
		LinkedList<String> loc =new LinkedList<String>();

		loc.add("Dubai");
		loc.add("USA");
		loc.add("Canada");
		loc.add("Chicago");

		System.out.println("Result is:"+loc);
		loc.set(2,"Boston");

		System.out.println("Updated List: "+loc);
		System.out.println("Updated List Size: "+loc.size()); 


		LinkedList<String>asia =new LinkedList<String>();
		asia.add("India");
		asia.add("Shri Lanka");
		asia.add("China");
		loc.addAll(asia);

        System.out.println("Updated List: "+loc);
		System.out.println("Updated List Size: "+loc.size()); 





	}
}