import java.util.*;
class Technology{
	public static void main(String[]args){
		ArrayList<String> tech=new ArrayList<String>();
		tech.add("java");
		tech.add("php");
		tech.add("python");

		System.out.println("Technology list are: "+tech);
		System.out.println("Size:"+tech.size());
		System.out.println("Status: "+tech.isEmpty());

		tech.clear();

		if(tech.isEmpty()==true){
			System.out.println("List is Empty");
		}
		else{
			System.out.println("List is not empty");
		}
		tech.add("HTML");
		tech.add("CSS");
		tech.add("JAVASCRIPT");

		System.out.println("Result is"+tech.contains("HTML"));
		System.out.println("Result is"+tech.contains("JavaScript"));

		Scanner sc=new Scanner(System.in);
		System.out.println("Which technology do you select");
		String search_tech=sc.next();

		if(tech.contains(search_tech)){
			System.out.println("Technology exists");
		}
		else{
			System.out.println("Technology not exists");
		}


	}
}