package mit;
import java.util.*;
public class College{
	private String collName;
	private String city;
	public Scanner sc=new Scanner(System.in);

	public void getData(){
		System.out.println("COLL NAME:");
          collName=sc.next();
		System.out.println("CITY:");
          city=sc.next();
	}

	public void showData(){
		System.out.println("COLL NAME: "+collName);
		System.out.println("CITY: "+city);

	}
}