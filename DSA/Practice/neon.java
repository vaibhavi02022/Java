class neon {
	public static void main(String [] args){
		int n=15 ;

		int square=n*n;
		int sum=0;

		while(square>0){

			int r=square%10;

			sum=sum+r;

			square=square/10;

		}

		if(sum==n){
			System.out.println(sum);
		}
		else{
			System.out.println("...");

		}
	}
}