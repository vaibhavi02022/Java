import mit.*;
class Student extends College{
	private int rollno;
	private String name;
	private String branch;

	public void read(){
		super.getData();
		System.out.println("Rollno: ");
		rollno=sc.nextInt();
		System.out.println("Name ");
		name=sc.next();
		System.out.println("Branch");
		branch=sc.next();
	}

	public void show(){
		super.showData();
		System.out.println("Rollno: "+rollno);
		System.out.println("Name: "+name);
		System.out.println("Branch: "+branch);


	}
}

class Test{
	public static void main(String[]args){
		Student s=new Student();
		s.read();
		s.show();
	}
}