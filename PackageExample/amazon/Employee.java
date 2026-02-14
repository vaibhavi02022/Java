package amazon;
import java.util.*;
 class Company{
	private String com_name;
	private String location;
	Scanner sc=new Scanner(System.in);

	public void getData(){
		System.out.println("Company Name: ");
		com_name=sc.nextLine();
		System.out.println("Company Location: ");
		location=sc.nextLine();
	}

	public void showData(){
		System.out.println("Company Name :"+com_name);
		System.out.println("Company Location :"+location);
	}
}

public class Employee extends Company{
	private int empid;
	private String ename;
	private String job;
	private int wages;
	private int wdays;
    int pay=0;

	public void enterData(){
		super.getData();
		System.out.println("Emp id: ");
		empid=sc.nextInt();
		System.out.println("Emp name: ");
		ename=sc.next();
		System.out.println("job: ");
		job=sc.next();
		System.out.println("wages: ");
		wages=sc.nextInt();
		System.out.println("wdays: ");
		wdays=sc.nextInt();
	}

	public void showData1(){
		super.showData();
		System.out.println("Emp id: "+empid);
		System.out.println("Emp name: "+ename);
		System.out.println("job: "+job);
		System.out.println("wages: "+wages);
		System.out.println("wdays: "+wdays);

	}

	public void payment(){
		pay=wdays*wages;
		System.out.println("Payment:"+pay);
	}

}