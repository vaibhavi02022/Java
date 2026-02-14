import java.util.Arrays;

class BinarySearchEx {
	public static void main (String[] args) {

		int[]numbers={1000,2000,3000,4000,5000};
		System.out.println("Given ArrayList \n");

		for(int i=0 ;i<=4 ;i++){
			System.out.print(numbers[i]+" ");
		}

		Arrays.sort(numbers);

		for(int i=0 ;i<=4 ;i++){
			System.out.print(numbers[i]+" ");
		}

		int key=3000;
		int index=Arrays.binarySearch(numbers ,key);
		 
		 if(index>=0) {
		 	System.out.println("\n Element"+key+"found at index"+index);
		 }
		 else{
		 	System.out.println("\n Element not found "+(-index-1));
		 }
	}
}