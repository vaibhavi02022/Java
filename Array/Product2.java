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

	public int billing(){
		bill=qty*rate;
		//System.out.println("BILL:  "+bill);
		return bill;
	}

}
class Test{
	public static void main(String[]args){
        Product p1[]=new Product[3];
        int s=0;


        for(int i=0;i<=2;i++){
        	System.out.println("Enter Product"+(i+1)+" Details");
        	p1[i]=new Product(); //memory allocation for each obj data member
        	p1[i].readData();
            p1[i].showData();
            int x= p1[i].billing();

           System.out.println("\n Bill Of Product is"+x);
            System.out.println("\n =========================================================\n");
s=s+x;

        }
        System.out.println("total bill:  "+s);

        
	} 
}