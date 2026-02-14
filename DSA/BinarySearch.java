import java.util.Arrays;

class BinarySearchEx {
	public static void main (String[] args) {

		int[]numbers={60,20,30,40,50};
		System.out.println("Given ArrayList \n");

		for(int i=0 ;i<=4 ;i++){
			System.out.print(numbers[i]+" ");
		}

		Arrays.sort(numbers);

		for(int i=0 ;i<=4 ;i++){
			System.out.print("\n "+numbers[i]+" ");
		}

		int key=30;
		int index=Arrays.binarySearch(numbers ,key);
		 
		 if(index>=0) {
		 	System.out.println("\n Element"+key+"found at index"+index);
		 }
		 else{
		 	System.out.println("\n Element not found "+(-index-1));
		 }
	}
}