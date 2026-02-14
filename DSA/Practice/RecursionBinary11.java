class Binary11 {

	public static void Binary(int n, int last ,String str){
		if(n==0){
			System.out.println(str);
			return;
		}

			Binary(n-1 ,0,str+"0");

		if(last==0){
			Binary(n-1 ,1,str+"1");

		}
	}

	public static void indice(int index ,int[]arr ,int key){
		if(index>arr.length-1){
			return ;
		}

		if(arr[index]==key){
	     System.out.println(index+" ");
	}

	indice(index+1 ,arr,key);

}

   
	public static void main(String[]args){

		//Binary(3 ,0,"");

		int arr[] ={2,3,4,5,1,2,2,2};
		//indice(0, arr ,2);

		String str ="vaibhavi";
		System.out.println(lengthString(str));
		lengthString(str);

	}
		
}