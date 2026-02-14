
import java.util.*;

class TestLinearSearch{
	public static int linearSearch_function(ArrayList<String>list,String key) {
		for(int i=0;i<list.size();i++){
			if(list.get(i).equals(key)){
				return i;
			}
		}
		return -1;
	}


	public static void main(String[]args){
		ArrayList <String>students=new ArrayList<>();
		students.add("Kajal");
		students.add("Pooja");
		students.add("Sneha");
		students.add("Aniket");
		System.out.println(students);

		String key ="Pooja";
		int result =linearSearch_function(students,key);
		if(result!= -1){
			System.out.println("found at index" +result);
		}
		else{
			System.out.println("not found");
		}
	}
}