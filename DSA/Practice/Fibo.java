class fibo {
	public static void main(String[]args){
		int a=0;
		int b=1;
		int n=10;
int sum=0;
		for(int i=0;i<=n;i++){
			if(i%2==0){
			 sum=a+b;
			
			a=b;
			b=sum;
		}
}
		System.out.println(sum);
	}
}