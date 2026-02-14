class Father{
	protected String surname;
	 final public void setData(String Surname){
		this.surname=surname;
	}
	public void showData(){
		System.out.println("surname"+surname);
	}

}

class Son extends Father{
	private String fname;
	public void setData(String fname){
		super.setData("Deshpande");
		this.fname=fname;
	}
	public void showData(){
		System.out.println("fname:  "+fname);
		super.showData();
	}
}

class Test{
	public static void main(String []args){
		Son s1=new Son();
		s1.setData("Amol");
		s1.showData();


	}
}