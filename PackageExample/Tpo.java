import mycollege.*;
class Tpo{
	private String tname;
	private String dname;
	private int wages;
	private int wdays;
	College col;


	public Tpo(String tname,String dname ,int wages,int wdays,College col){
		this.tname=tname;
		this.dname=dname;
		this.wages=wages;
		this.wdays=wdays;
		this.col=col;
	}

		public void showData(){
			System.out.println("College name:  "+col.collegeName);
			System.out.println("City:  "+col.city);
			System.out.println("State:  "+col.state);

			System.out.println("Tname:  "+tname);
			System.out.println("Dname:  "+dname);
			System.out.println("Wages:  "+wages);
			System.out.println("Wdays:  "+wdays);


		

	}

}

class Main{
	public static void main(String[]args){
		College c1=new College("SCOE","Pune","Maharastra");
		Tpo t1=new Tpo("Mr.Shinde","Mr.Patil",8000,50,c1);
		t1.showData();
	}
}