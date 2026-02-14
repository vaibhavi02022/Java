import java.util.ArrayList ;
import java.util.Arrays ;

class removeElement {
	public static void main(String[] args) {
		int arr1[] = {10,20,30,40,50};

		ArrayList<Integer> list =new ArrayList<>(Arrays.asList(10,20,30,40,50));

		System.out.println("Original List" +list);
		int removeElement =30;
		list.remove(Integer.valueOf(removeElement));
		System.out.println("After removing"+removeElement+":"+list);
	}
}