import java.util.Arrays;

class ArrayEqualityCheck {
	public static void main(String[]args){

		int arr1[] ={1,2,3,4,5};
		int arr2[] ={1,2,3,4,5,0};

		boolean isEqual =Arrays.equals(arr1,arr2);

		if(isEqual){
			System.out.println("both are equal");
		}
		else{
			System.out.println("both are not equal");
		}

	}
}