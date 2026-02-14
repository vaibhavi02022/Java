import java.util.Arrays;

class RemoveEle{
	public static void main(String[] args){

		int[] arr ={10,20,30,40,50};
		int removeElement=30;

		System.out.println("Original array");
		for(int num:arr){
			System.out.print(num+" ");
		}

		int[] newArr =new int[arr.length-1];
		int index=0;

		for(int i=0 ;i<arr.length ;i++){
			if(arr[i]!= removeElement) {
				
					newArr[index++] =arr[i];
				
			}
		}
		System.out.println("\n Array after removing" +removeElement+":");

		for(int num:newArr) {
			System.out.print(num+" ");
		}
	}
}