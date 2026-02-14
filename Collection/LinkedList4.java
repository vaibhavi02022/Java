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


		Object first_ele =loc.removeFirst();
		Object last_ele =loc.removeLast();

		System.out.println(loc);
		System.out.println("Size:  "+loc.size());





int x=loc.indexOf("USA");
System.out.println("Position"+x);

int y=loc.indexOf(loc.getFirst());
System.out.println("Index"+y);

int z=loc.indexOf(loc.getLast());
System.out.println("Index position is"+y);
System.out.println("Index position is"+z);
loc.clear();

int res=loc.indexOf("Canada");
System.out.println("Res"+res);






	}
}