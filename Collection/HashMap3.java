import java.util.*;
class TestHashMap{

	public static void main(String[]args){
		HashMap<Integer ,String> map =new HashMap<Integer,String>();
		map.put(101,"Amol");
		map.put(102,"Akash");
		map.put(103,"Piyush");
		map.put(104,"Rahul");
		map.put(105,"Chetan");

		System.out.println("Elements Are: "+map);

		for(Map.Entry m : map.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}




	}
}