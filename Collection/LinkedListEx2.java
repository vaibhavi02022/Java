import java.util.*;
class LinkedListEx{
	public static void main(String[]args){


		LinkedList <String> al= new LinkedList<String>();
		al.add("Amol");
		al.add("Pravin");
		al.add("Komal");
		al.add("Sagar");

		System.out.println(al);
		System.out.println("Size:  "+al.size());

		if(al.contains("Pravin")){
			System.out.println("Yes Elements Exists");
		}
		else{
			System.out.println("Not Exist");
		}

		if(al.contains("amar")){
			System.out.println("Exists");
		}
		else{
			System.out.println("Not Exist");
		}
	}
}