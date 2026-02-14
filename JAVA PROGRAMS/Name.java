class Person{
	private String fname;
	private String lname;

	public void setData(String f ,String l )
	{
		fname=f;
		lname=l;
	}
	
	public String fullName()
	{
		String Name=fname+" "+lname;
		return Name;
	}
}//class end


class Details{
	public static void main(String[]args){
		Person p=new Person();
		
		p.setData("vaibhavi","samangave");

		String result=p.fullName();
		System.out.println("Full name is "+result);
	}
}
