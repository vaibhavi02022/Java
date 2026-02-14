import java.util.*;
class LinkedListEx{
	public static void main(String[]args){


		LinkedList <String> al= new LinkedList<String>();
		al.add("Amol");
		al.add("Pravin");
		al.add("Komal");
		al.add("Sagar");

		System.out.println(al);

		al.addFirst("Anisha");
		al.addLast("Mayur");
		System.out.println(al);
		al.clear();
		System.out.println(al);
	}
}