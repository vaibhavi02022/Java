import java.util.*;

class Studentx{
	private int rollno;
	private String name;
	private static String City;

	Scanner sc=new Scanner(System.in);

	public void getData(){
		rollno=sc.nextInt();
		name=sc.next();
	}

	public void showData(){
		System.out.println("NAME:  "+name);
		System.out.println("ROLLNO:  "+rollno);
		System.out.println("City:  "+City);
	}

	public static void changeCity(){
		City="Mumbai";
	}

}
class Main{
	public static void main(String[]args){
		Studentx s1=new Studentx();
		Studentx.changeCity();
		s1.getData();
		s1.showData();
	}
}