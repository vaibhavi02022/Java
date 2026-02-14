class Student{
	private int rollno;
	private String sname;
	private String branch;
	final private String college;

	public Student(){
		college="Zeal College";
	
	}
	public void setData(int rollno,String sname,String branch){
		this.rollno=rollno;
		this.sname=sname;
		this.branch=branch;
	}

	public void showData(){
		System.out.println("Roll no:  "+rollno);
		System.out.println("Sname:  "+sname);
		System.out.println("Branch:  "+branch);
		System.out.println("College:  "+college);
	}

	public void changeCollege(){
		//college="SCOE";//we can not change declared as final
	}
}
class Test{
	public static void main(String[]args){
		Student s=new Student();
		s.setData(101,"Amol","Computer");
		s.showData();
	}
}