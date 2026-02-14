import java.util.*;
class ArrayListByForLoop{
	public static void main ( String[]args){
		ArrayList <String> tech =new ArrayList<String>();
		tech.add("Java");
		tech.add("JavaScript");
		tech.add("Python");

		System.out.println("ArrayList :"+tech);

		System.out.println(tech.get(0));

		System.out.println("Accessing one by one ArrayList using for loop");

		for (int i=0;i<tech.size();i++){
			System.out.println(tech.get(i)+" ");
		}


	}
}