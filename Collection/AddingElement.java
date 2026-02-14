import java.util.ArrayList;

class Test{
	public static void main(String[]args){
		ArrayList<String> emp =new ArrayList<String>();

		emp.add("Adams");
		emp.add("Turner");
		emp.add("Alex");

		System.out.println("old ArrayList: "+emp);

		emp.add(1,"Amar");
		emp.add(3,"Ashish");

		System.out.println("Updated Arraylist: "+emp);

		// emp.add(6,"Amit");
		// System.out.println("Updated Arraylist: "+emp);
		emp.add(5,"Amit");
		System.out.println("Updated Arraylist: "+emp);

		for(int i=0;i<emp.size();i++){
			System.out.println(emp.get(i));
		}

System.out.println("Result is:"+emp.getFirst());
System.out.println("Result is:"+emp.getLast());


	}
}  