import alibaba.*;
class Customer extends Company{
	private String cname;
	private String phoneno;

	public Customer(String cname,String phoneno,String cm,String ct){
		super(cm,ct); //base class constructor get called
		this.cname=cname;
		this.phoneno=phoneno;
	}

	public void displayData(){
		String x=super.show();
		System.out.println("Company Info:  "+x);
		System.out.println("Customer Name:  "+cname);
		System.out.println("Customer Phone No:  "+phoneno);

		System.out.println("Customer Phone No:  "+tollfreeno);//checking default member accessiblity


	}

}

class TestAlibaba{
	public static void main(String[]args){
		Customer c=new Customer("Ashok" ,"8010439573","Alibaba","pune");
		c.displayData();
	}
}
