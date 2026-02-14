class Company{
	public String company_name;
	public int phone_no;
	public String location;

	public Company(String company_name,int phone_no,String location){

		this.company_name=company_name;
		this.phone_no =phone_no;
		this.location=location;
	}
}

class Seller{
	public String SellerName;
	public int table_Cost;
	public String city;
	public String s_comp_name;
	

	public Seller(String SellerName,int table_Cost, String city,String s_comp_name){
		this.SellerName=SellerName;
		this.table_Cost=table_Cost;
		this.city=city;
		this.s_comp_name=s_comp_name;
	}
}
class Customer{
	private String cust_name;
	private int quantity;
	Company comp;
	Seller sell;

	public Customer(String cust_name,int quantity,Company comp_objx ,Seller sell_objx){
		this.cust_name=cust_name;
		this.quantity=quantity;
		comp=comp_objx;
		sell =sell_objx;

	}

	public void display_data(){
		System.out.println("company"+comp.company_name);
		System.out.println("company"+comp.phone_no);
		System.out.println("company"+comp.location);

		System.out.println("Sell"+sell.SellerName);
		System.out.println("Sell"+sell.table_Cost);
		System.out.println("Sell"+sell.city);


		System.out.println("cust_name"+cust_name);
		System.out.println("quantity"+quantity);
		

	}

	public void billing(){
		int cost =sell.table_Cost*quantity;
		System.out.println("Total cost"+cost);
	}
}

class Main{
	public static void main(String[]agrs){
		Company comp_objx =new Company("Wipro", 1234567890, "pune");
		Seller sell_objx =new Seller("vaibhav" ,5000,"pune" ,"TCS");
        Customer cos =new Customer("vaishu" ,700 ,comp_objx ,sell_objx);
        cos.display_data();
        cos.billing();
	}
}