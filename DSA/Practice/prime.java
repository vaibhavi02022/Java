class prime{
	public static void main(String[]args){
		int n=0;

		int count=0;

		if(n<1){
			System.out.println("not prime ...");
		}
		for(int i= 1;i<=n;i++){
			if(n%i==0){
				count++;
			}
		}
		if(count==2){
			System.out.println("Prime");

		}
		else{
			System.out.println("not prime");
		}
	}
}