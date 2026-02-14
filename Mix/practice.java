import java.util.*;
class practice{
	public static void main(String[]args){
		
		private String ename;
		private String job;
		private int wages;
		private int wdays;
		private int payment;

		Scanner sc=new Scanner(System.in);
		ename=sc.next();
		job=sc.next();
		wages=sc.nextInt();
		wdays=sc.nextInt();

		public void pay(){
		payment=wages*wdays;
		System.out.println(payment);
		}

		public void check(){
			if (payment>=20000){
				System.out.println("You have to pay 20%gst");
					}
					else{
						System.out.println("NOT ELIGIBLE");
							}
		}



	}
}