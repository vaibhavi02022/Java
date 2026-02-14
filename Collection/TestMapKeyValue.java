import java.util.*;
class TestHashMap{

	public static void main(String[]args){
		HashMap<Integer,String>data=new HashMap<Integer,String>();
		data.put(101,"JAVA");
		data.put(102,"PHP");
		data.put(103,"PYTHON");

		System.out.println("-----All keys are-----");
		for(Map.Entry x:data.entrySet()){
			System.out.println(x.getKey());
		}

		System.out.println("----All Values are");
		for(Map.Entry x:data.entrySet()){
			System.out.println(x.getValue());
		}

		System.out.println("----All key-Value pair");
		for(Map.Entry m:data.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}

		System.out.println("Result is "+data.containsKey(101));
		System.out.println("Result is "+data.containsKey(1001));

		System.out.println("Result is "+data.containsValue("JAVA"));
		System.out.println("Result is "+data.containsValue("AWS"));

		HashMap<Integer,String>xyz=new HashMap<Integer,String>();
		xyz.put(104,"Sales Force");
		xyz.put(105,"Data Analyst");
		data.putAll(xyz);
		System.out.println("---Both Map Output---");
		for(Map.Entry m:data.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}

		data.remove(101);
		data.remove(105);

		System.out.println("---Updated Output---");
		for(Map.Entry m :data.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}

		System.out.println("Size is: "+data.size());
		System.out.println("Map is Empty: "+data.isEmpty());

		data.clear();

		System.out.println("Size is: "+data.size());
		System.out.println("Map is Empty: "+data.isEmpty());


	}
}