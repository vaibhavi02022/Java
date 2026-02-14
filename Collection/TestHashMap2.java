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

		HashMap<Integer,String>mapx=new HashMap<Integer,String>();
		mapx.put(106,"Turner");
		mapx.put(107, "Adams");

		System.out.println("Elements Are: "+mapx);

		map.putAll(mapx);
		System.out.println("Elements are "+map);
		System.out.println("Total Employee are "+map.size());




	}
}