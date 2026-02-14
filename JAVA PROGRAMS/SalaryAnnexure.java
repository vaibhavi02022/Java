import java.util.*;
class Salary{
	private String Ename;
	private String Job;
	private int bas_sal;

	public void getData(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter");
		Ename =sc.next();
		System.out.println("Enter");
		Job =sc.next();
		System.out.println("Enter");
		bas_sal =sc.nextInt();
	}

	public void showData(){
		System.out.println("ENAME "+Ename);
		System.out.println("JOB "+Job);
		System.out.println("BASIC SALARY "+bas_sal);
	}

	public double hra_fun(){
		double bs= bas_sal*0.30;
		return bs;
	}

	public double ta_fun(){
		return bas_sal*0.20;
	}

	public double pf_fun(){
		return bas_sal*0.10;
	}

	public double medicalfun(){
		return bas_sal*0.30;
	}

	public  void payment()
	{
	        double  tot_allow= hra_fun() + ta_fun()+pf_fun() +medicalfun();
	        System.out.println("Total allowances are "+tot_allow);

	        double final_pay=bas_sal + tot_allow;
	        System.out.println("Total payment with allowances are "+final_pay);


	}
}//end of class

class SalaryAnn{
	public static void main(String[]args)
	{
		Salary s1= new Salary();
		s1.getData();
		s1.showData();
		double hra=s1.hra_fun();
		System.out.println("HRA "+hra);

		double ta=s1.ta_fun();
		System.out.println("TA "+ta);

		double pf=s1.pf_fun();
		System.out.println("PF "+pf);

		double medical=s1.medicalfun();
		System.out.println("MEDICAL COST "+medical);

	     s1.payment();
		
	}
}