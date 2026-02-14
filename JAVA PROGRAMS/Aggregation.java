class Company{

	public String comp_name;
	public String city;
	public String state;

	public Company(String comp_name,String city ,String state){
		
		this.comp_name=comp_name;
		this.city=city;
		this.state=state;

	}
} //end of company

class Employee{
	private String name;
	private String job;
	private int wages;
	private int wdays;
	Company com ; //instance of class working as dm

	public Employee(String name ,String job , int wages ,int wdays ,Company com_objx){
              this.name=name;
              this.job=job;
              this.wages=wages;
              this.wdays=wdays;
              com=com_objx;
	}

	public void showData(){
	   	System.out.println("Company Name is: "+com.comp_name);
	   	System.out.println("Company Name is: "+com.city);
	   	System.out.println("Company Name is: "+com.state);


         System.out.println("Employee name is: "+name);
         System.out.println("Employee job is: "+job);
         System.out.println("Employee wages is: "+wages);
         System.out.println("Employee wdays is: "+wdays);
	}

	public void payment(){
		int pay=wages * wdays;
		System.out.println("PAYMENT: "+pay);
	}

} //end of class

class TestAggregation{
	public static void main(String[] args) {
		Company com_obj =new Company("TCS" ,"Pune" ,"Maha");
		Employee emp =new Employee("Ashok" ,"Manager" ,1000 ,30,com_obj);
		emp.showData();
		emp.payment();

		
	}

}