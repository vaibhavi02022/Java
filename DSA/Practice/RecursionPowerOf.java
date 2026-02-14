class PowerOf{

	public static  int powerOf(int x ,int n){
		if(n==0){
			return 1;
		}

		int solution =powerOf(x,n/2);
		int final_cal =solution*solution;
	


	//n is odd
	if(n%2!=0){
		final_cal =x*final_cal;
	}

	return final_cal;
}
	public static void main(String[]args){
		System.out.println(powerOf(2 ,5));

	}
}