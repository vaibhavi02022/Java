class Person{

	protected String name;
	protected int age;
	protected String city;

	public Person(String nm ,int ag,String ct) {
		name=nm;
		age=ag;
		city=ct;
	}

	public void display(){
		System.out.println(name+" "+age+" "+city);
	}
}  //end of person class

class Employee  extends Person{

	private String job;
	private int wages;
	private int wdays;


	public Employee(String nm,int ag ,String ct ,String j,int wg,int wd){
		super(nm,ag,ct);
		job=j;
		wages=wg;
		wdays=wd;

	}

	public void show(){
		super.display();
		System.out.println(job+" "+wages+" "+wdays);
	}

	public void payment(){
		int p=wages*wdays;
		System.out.println("Payment is: "+p);
	}
}//end of employee

class TestEmp{

	public static void main(String[]args){
		Employee e=new Employee("Radhika" ,20 ,"pune" ,"Developer" ,500 ,30);
		e.show();
		e.payment();
	}
}