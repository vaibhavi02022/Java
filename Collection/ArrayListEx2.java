import java.util.*;
class TestArrayList{
	public static void main(String[]args){
		ArrayList<String>tech=new ArrayList<String>();

		tech.add("PHP");
		tech.add("Python");
		tech.add("Java");

		System.out.println("\n\nArray list: "+tech);
		System.out.println("List Size: "+tech.size());


		ArrayList<String>tech1=new ArrayList<String>();

		tech1.add("HTML");
		tech1.add("CSS");
		tech1.add("JavaScript");
		tech1.add("MySQL");

		System.out.println("\n\nArray list: "+tech1);
		System.out.println("List Size: "+tech1.size());

        tech1.removeAll();
        System.out.println("\n\nRemaining technologies are:  "+tech1);
		System.out.println("List Size: "+tech1.size());



	}
}