class FindStringDuplicate {
	public static void main(String[]args) {
		String []arr ={"apple" ,"banana" ,"orange" ,"apple" ,"mango" ,"banana"} ;
		System.out.println("Duplicate strings are :");

		for(int i=0 ;i<arr.length ;i++){
			for(int j=i+1 ;j<arr.length ;j++){
				if(arr[i].equals(arr[j])) {
					System.out.println(arr[i]);
				}
			}
		}
	}
}