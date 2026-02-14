import java.util.*;

class Product{
	private String pname;
	private int rate;
	private int qty;
	Scanner sc=new Scanner(System.in);
	int bill=0;

	public void readData(){
		System.out.println("PNAME:  ");
		pname=sc.next();
		System.out.println("RATE:  ");
		rate=sc.nextInt();
		System.out.println("Qty:  ");
		qty=sc.nextInt();

	}

	public void showData(){
		System.out.println("Pname: "+pname);
		System.out.println("Rate: "+rate);
		System.out.println("Qty: "+qty);

	}

	public void billing(){
		bill=qty*rate;
		System.out.println("BILL:  "+bill);
	}

}
class Test{
	public static void main(String[]args){
        Product p1[]=new Product[5];

        for(int i=0;i<=4;i++){
        	System.out.println("Enter Product"+(i+1)+" Details");
        	p1[i]=new Product();
        	p1[i].readData();
            p1[i].showData();
            p1[i].billing();
            System.out.println("\n =========================================================\n");




        }

        
	} 
}