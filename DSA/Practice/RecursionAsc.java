class Asc {
	public static void ascending(int n){
		if(n==1){
			System.out.print(n+" ");
			return;
		}

		ascending(n-1);
		System.out.print(n+" ");
	}


	public static int factorial(int n){
		if(n==0){
			return 1;
        }
			int fact =factorial(n-1);
			int factno =n * factorial(n-1);
			return factno;
		
	}

	public static int natural_no(int n){
		if(n==1){
			return 1;
		}

		int sum = natural_no(n-1);
		int final_sum =sum+ n;
		return final_sum;
	}

	public static boolean isSorted(int []arr ,int n){
		if(n==arr.length-1){
			return true;
		}

		if(arr[n]>arr[n+1]){
			return false;
		}

		return isSorted(arr ,n+1);
	}

	public static int First_occ(int []arr ,int key ,int i){
		if(i==arr.length){
			return -1;
		}
		if(arr[i]==key){
			return i ;
		}
		return First_occ(arr,key,i+1);
	}

	public static int last_occ (int arr[] ,int key ,int i){
		if(i==arr.length) {
			return -1 ;
		}

		int occ=last_occ(arr,key,i+1);
		if(occ== -1 && arr[i]==key){
			return i;
		}
         return occ;
	}

	public static void main(String[]args){
		int n=10;

		int arr[] ={1,2,3,5,4,5};
		//System.out.print(isSorted(arr ,0));
		// System.out.println(factorial(5));
		//System.out.println(natural_no(5));
		//ascending(n);
		//System.out.println(First_occ(arr , 5 ,0));
		System.out.println(last_occ(arr , 5 ,0));



	}
}