package ttsm;
import java.util.*;
public class student{
	
		Scanner sc=new Scanner(System.in);
		private String fname;
		private String lname;
		private String branch;
		private int phy;
		private int che;
		private int math;
		private int tot_marks=0;
		private int per;


		public void readData(){
		System.out.println("Fname: ");
		fname=sc.nextLine();
		System.out.println("Lname: ");
	    lname=sc.nextLine();
	    System.out.println("Branch: ");
	    branch=sc.nextLine();
	    System.out.println("Physics: ");
	    phy=sc.nextInt();
	    System.out.println("Chemistry: ");
	    che=sc.nextInt();
	    System.out.println("Maths: ");
	    math=sc.nextInt();

	}
	   public void showData(){
	   	System.out.println("Fname: "+fname);
	   	System.out.println("Lname: "+lname);
	   	System.out.println("Branch: "+branch);
	   	System.out.println("Physics: "+phy);
	   	System.out.println("Chemistry: "+che);
	   	System.out.println("Maths: "+math);
	   }
	   public void total_mark(){
	   	tot_marks=phy+che+math;
	   	System.out.println("Total Marks: "+tot_marks);

	   }
	   public void percentage(){
	   	per=tot_marks/3;
	   	System.out.println("percentage: "+per);


	   }
}