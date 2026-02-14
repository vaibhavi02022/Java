class University{
	protected String uni_name;
	protected String city;

	
	public void setData(String un ,String ct){
         uni_name=un;
         city=ct;
	}
	public void showData(){
		System.out.println("Uni_name: "+uni_name);
		System.out.println("City: "+city);
	}
}

class College extends University{
	protected String CollegeName;
	protected String college_location;

	public void setData(String un, String ct ,String cn ,String cl){
		super.setData(un,ct);
		CollegeName=cn;
		college_location=cl;

	}

	public void showData(){
		super.showData();
		System.out.println("Enter College Name: "+CollegeName);
		System.out.println("Enter College location: "+college_location);
	}
}

class Student extends College{
	private String name;
	private String branch;

	public void setData(String un ,String ct ,String cn ,String cl ,String sn ,String br){
		super.setData(un,ct,cn,cl);
		name=sn;
		branch=br;
	}
	public void showData(){
		super.showData();
		System.out.println("Enter Student Name: "+name);
		System.out.println("Enter branch:"+branch);
	}
}//end of class

class Main{
	public static void main(String[]args){
		Student s=new Student();
		   s.setData("sppu" ,"pune" ,"scoe","pune" ,"vaibhavi" ,"it");
           s.showData();
		
	}
}