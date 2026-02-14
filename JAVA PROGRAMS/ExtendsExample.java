class Family{
	protected String surname="Kalyankar";

}

class Member1 extends Family{
	private String fname ="Pravin";
	public void showData(){
		String fullname =fname+" "+surname;
		System.out.println("Full name is "+fullname);
	}
}

class Member2 extends Family{
	private String fname ="Sujit";
	public void showData(){
		String fullname =fname+" "+surname;
		System.out.println("Full name is "+fullname);
	}
}

class TestMember{
	public static void main(String[]args){
		Member1 obj1=new Member1();
		obj1.showData();

		Member2 obj2=new Member2();
		obj2.showData();
	}
}