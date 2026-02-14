import java.util.Scanner;
class Test{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER");
		String fname =sc.nextLine();
		if(fname.endsWith(".java")){
			System.out.println("THIS IS JAVA FILE");
		}
		else if(fname.endsWith(".php")){
			System.out.println("THIS IS PHP FILE");
		}
		else if(fname.endsWith(".html")){
			System.out.println("THIS IS WEB FILE");
		}
		else{
			System.out.println("NOT LISTED");
		}
	}
}