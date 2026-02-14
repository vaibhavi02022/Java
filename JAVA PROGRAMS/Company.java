import java.util.*;
class Company{

	protected String company_name;
	protected String location;

    Scanner sc =new Scanner(System.in);

	public void readData(){
		System.out.print("Enter company name: ");
		company_name =sc.next();
		System.out.print("Enter location: ");
		location=sc.next();
	}

	public void showData(){
		System.out.println("Company Name : "+company_name);
		System.out.println("Company Location : "+location);
	}
}

class Employee extends Company{
      protected int Empid;
      protected String Ename;
      protected int Wages;
      protected int Wdays;

      public void enterData(){
      	super.readData();
      	System.out.print("Enter Employee ID: ");
        Empid = sc.nextInt();
        System.out.print("Enter Employee Name: ");
        Ename = sc.next();
        System.out.print("Enter Wages: ");
        Wages = sc.nextInt();
        System.out.println("Enter Wdays: ");
        Wdays =sc.nextInt();
      }

      public void displayData(){
      	super.showData();
      	System.out.println("Empid: "+Empid);
      	System.out.println("Ename: "+Ename);
      	System.out.println("Wages: "+Wages);
      	System.out.println("Wdays: "+Wdays);
      }

      public void payment(){
      	double pay =Wages*Wdays;
        System.out.println("Payment: "+pay);
      }
}

class Manager extends Employee{

	private String department;
	private int comm;

	public void getData(){
		super.enterData();
		System.out.print("Enter Department: ");
        department = sc.next();
        System.out.print("Enter Commission: ");
        comm = sc.nextInt();
    }
		
	public void show(){
		super.displayData();
			super.showData();
			super.payment();
				
	}
} //end of class

class Main{
	public static void main(String[]args){
		Manager m = new Manager();
        
        m.getData();
        m.show();
	}
}