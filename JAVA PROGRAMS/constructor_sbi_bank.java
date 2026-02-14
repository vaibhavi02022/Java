import java.util.*;
class Sbi_Bank{
	private int accno;
	private String name;
	private int Isamt;
	private int noy;
	private double roi;
      Scanner sc =new Scanner(System.in);

      public Sbi_Bank(){
      	roi=0.10;
      }
	public void getData(){
		
		System.out.println("Enter Accno :");
		accno =sc.nextInt();
		System.out.println("Enter Name :");	
		name= sc.next();
		System.out.println("Enter Amount :");
		Isamt=sc.nextInt();
		System.out.println("Enter Number of Year :");
		noy=sc.nextInt();
	}

	public void showData(){
		System.out.println("Accno: " +accno);
		System.out.println("Name: " +name);
		System.out.println("Isamt: " +Isamt);
		System.out.println("Noy: " +noy);
		System.out.println("Roi: " +roi);


	}

	public void mat_amt(){
		double Iamt =(Isamt*roi)*noy;
		double mamt=Iamt+Isamt;

		System.out.println(mamt);
	}
}//end of class

class show{

      public static void main(String[]args){
	Sbi_Bank obj =new Sbi_Bank();
	obj.getData();
	obj.showData();
	obj.mat_amt();
}
}