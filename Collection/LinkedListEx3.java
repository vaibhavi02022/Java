import java.util.*;
class LinkedListEx{
	public static void main(String[]args){


		LinkedList <String> loc= new LinkedList<String>();
		loc.add("Dubai");
		loc.add("USA");
		loc.add("Canada");
		loc.add("Chicago");

		System.out.println(loc);
		System.out.println("Size:  "+loc.size());
Object x=loc.get(2);
System.out.println("Element at index 2: "+x);

Object y=loc.getFirst();
System.out.println("First Element : "+y);

System.out.println("last ele:" +loc.getLast());

loc.addFirst("India");
loc.addLast("China");

System.out.println("Updated list is"+loc);


	}
}