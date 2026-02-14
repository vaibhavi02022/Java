class Employee{
	private String ename;
	private String job;
	private int wages;
	private int wdays;


	public void setData(String ename, String job , int wages ,int wdays){
		this.ename=ename;
		this.job=job;
		this.wages=wages;
		this.wdays=wdays;
	}

	public void showData(){
		System.out.println("Employee name  "+ename);
		System.out.println("Employee job  "+ job);
		System.out.println("Employee Wages  "+wages);
		System.out.println("Employee Wdays  "+wdays);
	}

	public int payment(){
		int payment= wages*wdays;

		return payment;

	}
}//end of class


class EmpInfo{
public static void main(String args[]){
	Employee obj1 =new Employee();
	obj1.setData("Vaibhavi","Software Engineer" , 5000,30);
	obj1.showData();
	int pay1=obj1.payment();

	System.out.println("Salary of First Employee"+pay1);
    System.out.println();

	Employee obj2=new Employee();
	obj2.setData("vaishnavi", "Manager" ,3000,20);
	obj2.showData();
	int pay2=obj2.payment();

	System.out.println("Salary of Second Employee"+pay2);

	int total=pay1+pay2;
	System.out.println(total);

}
}

