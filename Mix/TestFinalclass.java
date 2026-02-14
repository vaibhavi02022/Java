final class Family{
	protected String surname="Varma";
}
class Candidate extends Family{
	private String fname="Raman";

	public void fullname(){
		String res=fname+" "+surname;
		System.out.println("Full Name is:  "+res);
	}
}

class Test{
	public static void main(String []args){
		Candidate c=new Candidate();
		c.fullname();
	}

}