class Fib {
	public static int Fibonassi(int n){
		//base case

		if(n==1 || n==0){
          return n;
		}

		

		int f1 = Fibonassi(n-1);
		int f2 = Fibonassi(n-2);

		int f0 = f1 + f2 ;

		return f0;


	}

	public static void main(String []args){
		int n;
		System.out.println(Fibonassi(23));
	}
}