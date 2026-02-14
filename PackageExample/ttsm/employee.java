package ttsm;
import java.util.*;

public class employee{
	private String fname;
	private String lname;
	private String job;
	private int wdays;
	private int wages;
	int pay=0;
    Scanner sc=new Scanner(System.in);
    public void acceptData(){
    	System.out.println("FName: ");
    	fname=sc.nextLine();
    	System.out.println("LName: ");
    	lname=sc.nextLine();
    	System.out.println("Job: ");
    	job=sc.nextLine();
    	System.out.println("Wdays: ");
    	wdays=sc.nextInt();
    	System.out.println("Wages: ");
    	wages=sc.nextInt();
    }
    public void displayData(){
    	System.out.println("FName: "+fname);
    	System.out.println("LName: "+lname);
    	System.out.println("Job: "+job);
    	System.out.println("Wdays: "+wdays);
    	System.out.println("Wages: "+wages);
    }

    public void payment(){
           pay=wdays*wages;
    	   System.out.println("Payment: "+pay);


    }

}