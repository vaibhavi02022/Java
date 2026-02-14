import java.util.ArrayList;

class ArrayListSum{
	public static void main(String[]args){
		ArrayList<Integer> numbers =new ArrayList<Integer>();
		numbers.add(1000);
		numbers.add(2000);
		numbers.add(3000);
		numbers.add(4000);
		numbers.add(5000);

		System.out.println("ArrayList numbers" +numbers);
		System.out.println("Access ArrayList using for loop");
		int tot=0;
		for(int i=0;i<numbers.size();i++){
			 System.out.println(numbers.get(i));
			 tot=tot+numbers.get(i);

		}

			 System.out.print("Total"+tot);


	}
}