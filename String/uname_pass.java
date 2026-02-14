import java.util.Scanner;

class Test{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter uname");
		String uname=sc.nextLine();
        System.out.println("Enter password");
		String password=sc.nextLine();
		uname=uname.trim();
		password=password.trim();

		if(uname.equals("admin") &&password.equals("win@123")){
              System.out.println("ADMIN ");
		}
		
		else if(uname.equals("hr")&&password.equals("win@123")){
              System.out.println("HR ");
		}
		else if(uname.equals("owner")&&password.equals("win@123")){
              System.out.println("OWNER ");
		}

		else{
			System.out.println("Wrong Values");
		}
	}
}