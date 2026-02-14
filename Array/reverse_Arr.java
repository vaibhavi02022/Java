class Test{
	public static void arr(int[]arr){
		for(int i=0;i<arr.length;i++){
			System.out.println("Array elements"+arr[i]);
		}
	}
}

class Main{
	public static void main(String[]args){
		int[]arr={100,200,300,400,500};
		for(int i=arr.length-1;i>=0;i--){
			System.out.println("reverse elements"+arr[i]);
		}
		Test.arr(arr);
	}
}