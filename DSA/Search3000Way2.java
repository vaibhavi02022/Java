class CheckArrayContainsLoop {
	public static void main(String[] args){
		int[]arr ={1000,2000,3000,4000,5000};
		int key =3000;
		boolean found =false ;

		for(int num:arr){
			if(num==key){
				found=true;
				break;
			}

		}

		if(found){
			System.out.println(key+" is found");
		}
		else{
			System.out.println(key+" is not found");

		}
	}
}