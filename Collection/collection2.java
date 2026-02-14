import java.util.*;
class Test{
	public static void main(String[]args){
		ArrayList<String>java_fsd =new ArrayList<String>();
		ArrayList<String>php_fsd =new ArrayList<String>();
		ArrayList<String>python_fsd =new ArrayList<String>();

		ArrayList<String>java_tech=new ArrayList<String>();
		java_tech.add("Core Java");
		java_tech.add("Adv java");
		java_tech.add("Hibernet");
		java_tech.add("Spring");

		ArrayList<String>php_tech=new ArrayList<String>();
		php_tech.add("Php");
		php_tech.add("Laravel");
		php_tech.add("Symphony");

		ArrayList<String>python_tech=new ArrayList<String>();
		python_tech.add("Python");
		python_tech.add("Django");
		python_tech.add("Flask");

		ArrayList<String>web_tech=new ArrayList<String>();
		web_tech.add("Html");
		web_tech.add("Css");
		web_tech.add("Jquery");
		web_tech.add("Bootstrap");
		

		ArrayList<String>db_tech=new ArrayList<String>();
		db_tech.add("Oracle");
		db_tech.add("mysql");

		java_fsd.addAll(java_tech);
		java_fsd.addAll(db_tech);
		java_fsd.addAll(web_tech);

		System.out.println("List Java_fsd: "+java_fsd);
		System.out.println("Size of Java_fsa  "+java_fsd.size() +"\n\n");

		php_fsd.addAll(php_tech);
		php_fsd.addAll(db_tech);
		php_fsd.addAll(web_tech);

		System.out.println("List Php_fsd: "+php_fsd);
		System.out.println("Size of Php_fsa  "+php_fsd.size() +"\n\n");


		python_fsd.addAll(python_tech);
		python_fsd.addAll(web_tech);
		python_fsd.addAll(db_tech);

		System.out.println("List Python_fsd: "+python_fsd);
		System.out.println("Size of Python_fsa  "+python_fsd.size() +"\n\n");


	}
}
