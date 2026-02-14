import java.util.*;
class Student{
	private int rollno;
	private String name;
	private int phy;
	private int che;
	private int math;
	int tot_marks=0;
	int percentage=0;
	int p=0;
	int f=0;

	public void get(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Rollno:");
		rollno=sc.nextInt();
		System.out.println("Name:");
        name=sc.next();
        System.out.println("Physics:");
		phy=sc.nextInt();
		System.out.println("Chemistry:");
		che=sc.nextInt();
		System.out.println("Math:");
		math=sc.nextInt();
	}

	public void show(){
		System.out.println("Rollno:  "+rollno);
		System.out.println("Name:  "+name);
        System.out.println("Physics:  "+phy);
		System.out.println("Chemistry  :"+che);
		System.out.println("Math:  "+math);

	}

	public  static void result(){
		tot_marks=phy+che+math;
		System.out.println("Total Marks:  "+tot_marks);

		percentage=tot_marks/3;
		System.out.println("percentage:  "+percentage);

		if(percentage>35){
			System.out.println("YOU ARE PASS");
			p++;
		}
		else{
			System.out.println("BETTER LUCK NEXT TIME ");
			f++;
		}
	}
}

class Main{
	public static void main(String[]args){
		Student s[] =new Student[5];
		for(int i=0;i<4;i++){
        	System.out.println("Enter Product"+(i+1)+" Details");
        	s[i]=new Student();
        	s[i].get();
        	s[i].show();
        	s[i].result();
        	System.out.println("_____________________________________________________________");

		}

	}
}