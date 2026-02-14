import java.util.*;
class Test{
	public static void main(String[]args){
		ArrayList<String>lang=new ArrayList<>();

		lang.add("Java");
		lang.add("JavaScript");
		lang.add("Python");
		System.out.println("Arraylist:"+lang);
		System.out.println("Access Arraylist using for-each loop:");

		for(String tech:lang){
			System.out.println(tech);
		}
	}
}