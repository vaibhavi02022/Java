import java.util.Arrays;

class CompareArr {
	public static void main(String[]args){
		int [] arr1 ={10,20,30,40,50};
		int [] arr2 ={10,21,30,40,50};


		boolean isEqual=true;
		for(int i=0;i<=arr1.length;i++){
			if(arr1[i]!=arr2[i]) {

				isEqual=false;
				break;
			}
		}

		if(isEqual){
			System.out.println("Array are equal");
		}
		else{
			System.out.println("Array are !equal");
		}

	}
}