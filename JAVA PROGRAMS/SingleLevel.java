class AnviStar{
	protected String company="Anvistar";
	protected String city="Pune";

	public void showData(){
		System.out.println("Company Name: "+company);
		System.out.println("Comapny City: "+city);

	}
}

class Employee extends AnviStar{
	private String fname ="Amit";
	private String lname ="Khojare";

	public void showData(){
		super.showData();
		System.out.println("Full Name is: "+fname+" "+lname);
	}
}

class TestEmp{
	public static void main(String[]args){
		Employee e =new Employee();
		e.showData();
	}
}