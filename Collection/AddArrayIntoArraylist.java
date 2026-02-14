import java.util.*;

class AddArrayIntoArrayList{
	public static void main(String[]args){
		String data[]={"Manali" ," Keral" ,"Shimla" ,"Pune" ,"Nashik" ,"Satara"};

		ArrayList<String> tours =new ArrayList<String>();
		int i;
		for(i=0;i<=5;i++){
			tours.add(data[i]);
		}
		System.out.println("\n All Tours Name :"+tours);
		tours.remove("Pune");
		System.out.println("\n All Tours Name :"+tours);
		System.out.println("\n All Tours Name :"+tours.size());
        System.out.println("\n Remove All Elements Excluding Keral");
		for(i=0;i<=5;i++){
			if(data[i].equals("Keral")==false){
			tours.remove(data[i]);
		}
	}
		System.out.println("\n All Tours Name :"+tours);





	}
}