import java.util.Arrays;
class Array1 {
	public static void main(String[]args) {
		int[] my_array1 ={22,3,45,6,7,8,1,25,2222};

		String[] my_arrray2 ={
			"Zomato" , "Alibaba" ,"amazon" ,"BMW" ,"Xento" ,"Benz"
		};

		System.out.println("Original numeric array:" +Arrays.toString(my_array1));

		Arrays.sort(my_array1);

		System.out.println("Sorted numeric array:" +Arrays.toString(my_array1));

		System.out.println("Original numeric array:" +Arrays.toString(my_arrray2));
		Arrays.sort(my_arrray2);
		System.out.println("Sorted numeric array:" +Arrays.toString(my_arrray2));


	}
}