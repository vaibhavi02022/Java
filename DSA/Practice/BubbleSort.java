
class Bubble {
	public static void Bubble_sort(int arr[]) {
		for(int i=0 ;i<arr.length-1;i++){
			for( int j=0 ;j<arr.length-1-i;j++){
				if (arr[j]> arr[j+1]){
					int temp= arr[j];
					arr[j] =arr[j+1];
					arr[j+1]= temp;
				}
			}
		}
	}

	public static void selectionSort(int arr[]) {
		for(int i=0;i<arr.length-1 ;i++){
			int min = i;

			for(int j=i+1;j<arr.length ;j++){
				if(arr[min] >arr[j]){
					min=j;
				}
			}

			int temp = arr[min];
			arr[min] =arr[i];
			arr[i] =temp;
		}
	}


	public static void InsertionSort(int arr[]){
		for(int i=0 ;i<arr.length-1;i++){
			int curr= arr[i];
			int prev =i-1;

			while(prev>=0 && arr[prev]>curr){
				arr[prev+1]=arr[prev];
				prev--;
			}
			arr[prev+1]=curr;
		}
	}

	public static void main(String[] args){
		int arr[] ={2,8,1,3,0};
		// Bubble_sort(arr);
		//selectionSort(arr);
		InsertionSort(arr);

		for(int num:arr){
			System.out.print(num+",");
		}
	

}
}