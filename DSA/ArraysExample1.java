import java.util.Arrays ;
class ArraysExample {
	public static void main(String[] args) {

		int [] numbers={5,3,9,1};

		System.out.println(" \n Given Arrays List Are : ");
		for(int i=0 ;i<=3;i++){
			System.out.print(numbers[i]+" ");
		}

		Arrays.sort(numbers);
		System.out.println("\n Sorted" +Arrays.toString(numbers));


		//fill

		Arrays.fill(numbers,10);
		System.out.println("After fill:"+Arrays.toString(numbers));
		
	}
}